# CSBscUOP
Computer Science Bs.c University of People
Now, follow the second set of instructions, “Push an existing repository…”

 $ git remote add origin git@github.com:username/new_repo
 $ git push -u origin master
 Actually, the first line of the instructions will say

 $ git remote add origin https://github.com/username/new_repo
But I use git@github.com:username/new_repo rather than https://github.com/username/new_repo, 
as the former is for use with ssh (if you set up ssh as I mentioned in “Your first time”, 
then you won’t have to type your password every time you push things to github).
If you use the latter construction, you’ll have to type your github password every time you push to github.
