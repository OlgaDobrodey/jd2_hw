Задание 12
1. Создаем новую ветку branch и перейдем на нее
Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git branch branch

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git checkout branch
Switched to branch 'branch'
M       github5/readme11.txt

2.Внесем измениения в файл test.txt (добавим "изменения на второй ветке") посмотрим их 
сделаем add и commit

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (branch)
$ git add test.txt
warning: CRLF will be replaced by LF in github5/test.txt.
The file will have its original line endings in your working directory

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (branch)
$ cat test.txt
создали документ
внесли изменения
изменения на второй ветке

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (branch)
$ git status
On branch branch
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   test.txt

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   readme11.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        readme12.txt


Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (branch)
$ git commit -m "Added new text in test.txt"
[branch dc6b5df] Added new text in test.txt
 1 file changed, 2 insertions(+), 1 deletion(-)

3.Перейдем на ветку master. Повторим действия п.2 ("изменения на ветке master")

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (branch)
$ git checkout master

Switched to branch 'master'
M       github5/readme11.txt
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ cat test.txt

создали документ
внесли изменения
изменения на ветке master
Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git add test.txt
warning: CRLF will be replaced by LF in github5/test.txt.
The file will have its original line endings in your working directory

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git status

On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   test.txt

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   readme11.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        readme12.txt


Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git commit -m "Added new text in test.txt on branch master(step 3)"
[master ce988fb] Added new text in test.txt on branch master(step 3)
 1 file changed, 2 insertions(+), 1 deletion(-)


4.Сделаем merge двух веток и решим конфликт

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git merge branch
Auto-merging github5/test.txt
CONFLICT (content): Merge conflict in github5/test.txt
Automatic merge failed; fix conflicts and then commit the result.
--------------------------
создали документ
внесли изменения
<<<<<<< HEAD
изменения на ветке master
=======
изменения на второй ветке 
>>>>>>> branch
---------------------------------
Приведем к виду
создали документ
внесли изменения
изменения на ветке master
изменения на второй ветке 
------------------------------------

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master|MERGING)
$ git add test.txt


Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master|MERGING)
$ cat test.txt
создали документ
внесли изменения
изменения на ветке master
изменения на второй ветке


Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master|MERGING)
$ git commit -m "Added ^Mmerging branches"
[master 07e936c] Added merging branches

 