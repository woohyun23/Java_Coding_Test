#!/usr/bin/env bash

set -euo pipefail

if [[ $# -lt 1 || $# -gt 2 ]]; then
  echo "Usage: $0 <Main.java> [input-file]" >&2
  exit 1
fi

source_file="$1"
input_file="${2:-}"

if [[ ! -f "$source_file" ]]; then
  echo "Source file not found: $source_file" >&2
  exit 1
fi

build_dir="$(mktemp -d)"
trap 'rm -rf "$build_dir"' EXIT

main_class="$(basename "$source_file" .java)"
source_dir="$(dirname "$source_file")"
package_name="$(
  sed -nE 's/^[[:space:]]*package[[:space:]]+([^;]+);.*/\1/p' "$source_file" |
    head -n 1
)"

if [[ -n "$package_name" ]]; then
  main_class="${package_name}.${main_class}"
fi

javac -encoding UTF-8 -d "$build_dir" "$source_dir"/*.java

if [[ -n "$input_file" ]]; then
  if [[ ! -f "$input_file" ]]; then
    echo "Input file not found: $input_file" >&2
    exit 1
  fi

  java -cp "$build_dir" "$main_class" < "$input_file"
else
  java -cp "$build_dir" "$main_class"
fi
