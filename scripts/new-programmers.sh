#!/usr/bin/env bash

set -euo pipefail

if [[ $# -ne 1 ]]; then
  echo "Usage: $0 <problem-number>" >&2
  exit 1
fi

problem_number="$1"
target_dir="solutions/programmers/problem${problem_number}"

if [[ -e "$target_dir" ]]; then
  echo "Problem already exists: $target_dir" >&2
  exit 1
fi

mkdir -p "$target_dir"

for template_file in templates/programmers/*.java; do
  target_file="${target_dir}/$(basename "$template_file")"
  sed "s/problemXXXXXXXX/problem${problem_number}/" "$template_file" > "$target_file"
done

echo "Created $target_dir"
