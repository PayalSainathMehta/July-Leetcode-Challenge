#!/bin/sh

git filter-branch --env-filter '

OLD_EMAIL="mehtpaya@amazon.com"
CORRECT_NAME="PayalSainathMehta"
CORRECT_EMAIL="psmehta@cs.stonybrook.edu"

if [ "$GIT_COMMITTER_EMAIL" = "mehtpaya@amazon.com" ]
then
    export GIT_COMMITTER_NAME="PayalSainathMehta"
    export GIT_COMMITTER_EMAIL="psmehta@cs.stonybrook.edu"
fi
if [ "$GIT_AUTHOR_EMAIL" = "mehtpaya@amazon.com" ]
then
    export GIT_AUTHOR_NAME="PayalSainathMehta"
    export GIT_AUTHOR_EMAIL="psmehta@cs.stonybrook.edu"
fi
' --tag-name-filter cat -- --branches --tags
