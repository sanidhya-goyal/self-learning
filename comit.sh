#!/bin/bash

# Set your Git identity
GIT_AUTHOR_NAME="Sanidhya Goyal"
GIT_AUTHOR_EMAIL="sanidhyagoyal15@gmail.com"
GIT_COMMITTER_NAME="$GIT_AUTHOR_NAME"
GIT_COMMITTER_EMAIL="$GIT_AUTHOR_EMAIL"

# Go to your project directory
cd /Users/sanidhyagoyal/Downloads/self-learning || exit 1  # <--- CHANGE THIS PATH

# Commit everything else first (HLD, README, etc.)
git add -A
git commit -m "Initial commit with full project"

# Get list of LLD folders in reverse order (8 to 1-2.SOLID)
cd LLD || exit 1
folders=($(ls -1d */ | sed 's#/##' | sort -r -V))
cd ..

# Start date is today
start_date=$(date +%Y-%m-%d)

# Commit one folder per day
for i in "${!folders[@]}"; do
    folder="${folders[$i]}"
    commit_date=$(date -v-"$i"d -j -f "%Y-%m-%d" "$start_date" +"%a %b %d %T %Y %z")

    echo "✅ Committing LLD/$folder on $commit_date"

    git add "LLD/$folder"
    GIT_AUTHOR_DATE="$commit_date" GIT_COMMITTER_DATE="$commit_date" \
    git commit -m "Add LLD/$folder" --date="$commit_date"
done

# Push rewritten commit history to GitHub
git push origin main --force
