#!/usr/bin/env bash

set -euo pipefail

if [[ $# -ne 2 ]]; then
  echo "Usage: $0 <section-number> <problem-number>" >&2
  exit 1
fi

printf -v section_number "%02d" "$((10#$1))"
printf -v problem_number "%02d" "$((10#$2))"

target_dir="solutions/inflearn/section${section_number}/problem${problem_number}"
target_file="${target_dir}/Main.java"

if [[ -e "$target_file" ]]; then
  echo "Problem already exists: $target_file" >&2
  exit 1
fi

mkdir -p "$target_dir"
sed \
  -e "s/sectionXX/section${section_number}/" \
  -e "s/problemXX/problem${problem_number}/" \
  templates/inflearn/Main.java > "$target_file"

echo "Created $target_file"
