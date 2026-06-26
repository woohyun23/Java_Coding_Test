#!/usr/bin/env bash

set -euo pipefail

if [[ $# -ne 2 ]]; then
  echo "Usage: $0 <level> <problem-number>" >&2
  exit 1
fi

level_arg="$1"
problem_number="$2"

if [[ "$level_arg" =~ ^[0-9]+$ ]]; then
  level_dir="level${level_arg}"
elif [[ "$level_arg" =~ ^level[0-9]+$ ]]; then
  level_dir="$level_arg"
else
  echo "Level must be a number or level-prefixed value: $level_arg" >&2
  exit 1
fi

target_dir="solutions/programmers/${level_dir}/problem${problem_number}"
package_name="programmers.${level_dir}.problem${problem_number}"

if [[ -e "$target_dir" ]]; then
  echo "Problem already exists: $target_dir" >&2
  exit 1
fi

mkdir -p "$target_dir"

for template_file in templates/programmers/*.java; do
  target_file="${target_dir}/$(basename "$template_file")"
  sed \
    -e "s|programmers\.problemXXXXXXXX|${package_name}|" \
    -e "s|problemXXXXXXXX|problem${problem_number}|g" \
    "$template_file" > "$target_file"
done

echo "Created $target_dir"
