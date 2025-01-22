# Git Commands Guide

## Basic Git Commands (For Beginners)

### Setup
- `git init`
    - Initializes a new Git repository in the current directory.
- `git clone <repo-url>`
    - Clones an existing repository to your local machine.
- `git config --global user.name "Your Name"`
    - Sets your name for all repositories.
- `git config --global user.email "your.email@example.com"`
    - Sets your email for all repositories.
- `git config --list`
    - Displays the current Git configuration.

### Working with Files
- `git add <file>`
    - Stages a specific file for commit.
- `git add .`
    - Stages all changes in the current directory.
- `git status`
    - Displays the status of the working directory and staging area.
- `git commit -m "Commit message"`
    - Commits staged changes with a descriptive message.
- `git commit -am "Commit message"`
    - Adds and commits changes in tracked files in one step.

### Branching
- `git branch`
    - Lists all branches in the repository.
- `git branch <branch-name>`
    - Creates a new branch.
- `git checkout <branch-name>`
    - Switches to the specified branch.
- `git switch <branch-name>`
    - An alternative to `git checkout` for switching branches.
- `git merge <branch-name>`
    - Merges the specified branch into the current branch.

### Remote Repositories
- `git remote -v`
    - Displays the URLs of the remote repository.
- `git push origin <branch-name>`
    - Pushes the current branch to the remote repository.
- `git pull origin <branch-name>`
    - Fetches and merges changes from the remote repository to the current branch.
- `git fetch`
    - Downloads objects and refs from another repository without merging.

### Logs and History
- `git log`
    - Displays the commit history.
- `git log --oneline`
    - Shows a condensed one-line version of the commit history.

---

## Intermediate Git Commands

### Advanced Branching
- `git branch -d <branch-name>`
    - Deletes a branch (if merged).
- `git branch -D <branch-name>`
    - Forcefully deletes a branch (even if not merged).
- `git rebase <branch-name>`
    - Reapplies commits on top of another base commit.

### Stashing
- `git stash`
    - Temporarily stores uncommitted changes.
- `git stash apply`
    - Applies the stashed changes without removing them from the stash list.
- `git stash pop`
    - Applies the stashed changes and removes them from the stash list.

### Tagging
- `git tag <tag-name>`
    - Creates a lightweight tag at the current commit.
- `git tag -a <tag-name> -m "Message"`
    - Creates an annotated tag with a message.
- `git push origin <tag-name>`
    - Pushes a specific tag to the remote repository.

### Resetting
- `git reset --soft HEAD~1`
    - Moves the HEAD pointer back by one commit but keeps changes staged.
- `git reset --mixed HEAD~1`
    - Moves the HEAD pointer back by one commit and unstages changes.
- `git reset --hard HEAD~1`
    - Moves the HEAD pointer back by one commit and discards changes.

### Viewing Diffs
- `git diff`
    - Shows changes between working directory and staging area.
- `git diff <branch-name>`
    - Shows changes between the current branch and another branch.
- `git diff --staged`
    - Shows changes between the staging area and the last commit.

---

## Problem-Solving Commands

### Undo Changes
- `git restore <file>`
    - Restores a specific file to its last committed state.
- `git restore --staged <file>`
    - Unstages a file.

### Resolving Merge Conflicts
- `git merge <branch-name>`
    - Merges the specified branch into the current branch.
    - Resolve conflicts manually if prompted, then:
        - Use `git add <file>` to mark resolved files.
        - Commit the merge using `git commit`.

### Fixing the Last Commit
- `git commit --amend -m "Updated commit message"`
    - Edits the message of the last commit.

### Cleaning Up
- `git clean -f`
    - Removes untracked files from the working directory.
- `git clean -fd`
    - Removes untracked files and directories.

### Handling Remote Issues
- `git remote set-url origin <new-url>`
    - Changes the remote repository URL.
- `git push --force`
    - Forcefully pushes changes to the remote repository (use with caution).

### Bisecting to Find Bugs
- `git bisect start`
    - Starts the bisect process to find a commit that introduced a bug.
- `git bisect bad`
    - Marks the current commit as bad.
- `git bisect good <commit>`
    - Marks a known good commit.

---

## Tips
- Always write clear commit messages.
- Use `.gitignore` to exclude unnecessary files from the repository.
- Frequently pull and push to stay updated with the remote repository.
- Avoid force-pushing unless absolutely necessary.

This list will help you work effectively with Git and GitHub in most scenarios!
