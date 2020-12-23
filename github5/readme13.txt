Задание 13

1. Создадим 3 изменения в файл test.txt,внесем изменения сделаем три раза add и commit

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git add task13.txt

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git commit -m "Added Chahge 1"
[master 3ffd05a] Added Chahge 1
 1 file changed, 1 insertion(+)
 create mode 100644 github5/task13.txt
......так 3 раза 

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git log
commit 5e80835c6ce101f147d992e1efc8e36db6a4814d (HEAD -> master)
Author: Olga Dobrodey <olga.gurkovskaya@gmail.com>
Date:   Wed Dec 23 14:21:47 2020 +0300

    Added Chahge 3

commit f3ca9524db7df4c07cf0f664b3414e96db18090e
Author: Olga Dobrodey <olga.gurkovskaya@gmail.com>
Date:   Wed Dec 23 14:21:12 2020 +0300

    Added Chahge 2

commit 3ffd05a1fd9cd67ad77b160a07646525e60e64e5
Author: Olga Dobrodey <olga.gurkovskaya@gmail.com>
Date:   Wed Dec 23 14:19:55 2020 +0300

    Added Chahge 1

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ cat task13.txt
1. Изменение 1
2. Изменение 2
3. Изменение 3


2. Делаем 4 изменение, делаем add, потом удалим файл из отслеживания(add) редактируем,
делаем еще раз commit 

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git add task13.txt

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 15 commits.
  (use "git push" to publish your local commits)

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   task13.txt


Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git rm --cached task13.txt
rm 'github5/task13.txt'

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 15 commits.
  (use "git push" to publish your local commits)

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        deleted:    task13.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
          task13.txt

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git add task13.txt


Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git commit -m "Added Change 4.1"
[master f5ac823] Added Change 4.1
 1 file changed, 2 insertions(+), 1 deletion(-)

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ cat task13.txt
1. Изменение 1
2. Изменение 2
3. Изменение 3
4. Изменение 4
4. Изменение 4.1

3. Дулаем откат на 1 комиит назад. 

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git revert master
[master 5026fe0] Revert "Added Change 4"
 1 file changed, 1 insertion(+), 2 deletions(-)

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ cat task13.txt
1. Изменение 1
2. Изменение 2
3. Изменение 3
4. Изменение 4git 

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git log task13.txt
commit 5026fe0c1d22292e412d81989a4d03a743b45878 (HEAD -> master)
Author: Olga Dobrodey <olga.gurkovskaya@gmail.com>
Date:   Wed Dec 23 15:27:34 2020 +0300

    Revert "Added Change 4"

    This reverts commit f5ac8234e0048a497539a33e8350490e84677d17.

4 Дулаем откат на 3 комиита назад.

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git revert master~3

Auto-merging github5/task13.txt
CONFLICT (content): Merge conflict in github5/task13.txt
error: could not revert 5e80835... Added Chahge 3
hint: after resolving the conflicts, mark the corrected paths
hint: with 'git add <paths>' or 'git rm <paths>'
hint: and commit the result with 'git commit'

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master|REVERTING)

$ cat task13.txt
1. Изменение 1
<<<<<<< HEAD
2. Изменение 2
3. Изменение 3
4. Изменение 4
=======
2. Изменение 2
>>>>>>> parent of 5e80835 (Added Chahge 3)

редактируем файл

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master|REVERTING)
$ cat task13.txt
1. Изменение 1
2. Изменение 2

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master|REVERTING)
$ git add task13.txt

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master|REVERTING)
$ git commit -m "Finished"
[master a0518c5] Finished
 1 file changed, 1 insertion(+), 2 deletions(-)


5.Делаем push ДЗ
git add .
git commit -m "push Home work"
git push