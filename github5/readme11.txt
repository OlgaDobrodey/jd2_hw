1. в GIT Bash выполняем


cd /d/
cd jd2_hw (папка уже подключена к Git /d/jd2_hw (master))

1.1.Ранее на https://github.com/OlgaDobrodey создан репозиторий и 
https://github.com/OlgaDobrodey/jd2_hw с файлом 
.gitignore(добавляем к стандартным 
.idea
target
*.iml)

и на диске D: c помощью команды 
$ git clone https://github.com/OlgaDobrodey/jd2_hw

на диске появилась папка jd2_hw
В ней настраиваем репозиторий
git config --global user.name "Olga Dobrodey"
git config --global user.email "olga.gurkovskaya@gmail.com"
2. 
Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw (master)
$ mkdir github5

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw (master)
$ cd github5

3.Создадим текстовый файл (внутри "оздали документ"
touch test.txt 

3.1 Посмотреть документы в папке
Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ ls
readme11.txt  test.txt

3.2 Подготовим к Commit

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git add test.txt readme11.txt

3.3 Проверка статуса
Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   readme11.txt
        new file:   test.txt

3.4 Удалем из add test.txt
Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git rm --cached test.txt
rm 'github5/test.txt'

проверяем статус
Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   readme11.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        test.txt

3.5 Внесли изменения и сделаем add для файла test.txt
Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ cat test.txt
создали документ
внесли изменения

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git add test.txt
warning: CRLF will be replaced by LF in github5/test.txt.
The file will have its original line endings in your working directory

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   readme11.txt
        new file:   test.txt

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   readme11.txt


Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git commit -m "Added new test in test.txt"
[master f0f6401] Added new test in test.txt
 2 files changed, 32 insertions(+)
 create mode 100644 github5/readme11.txt
 create mode 100644 github5/test.txt

Olga@DESKTOP-9GO56GS MINGW64 /d/jd2_hw/github5 (master)
$ git log
commit f0f640199565a4dc97a2aee2fdf7d0247cab9716 (HEAD -> master)
Author: Olga Dobrodey <olga.gurkovskaya@gmail.com>
Date:   Wed Dec 23 09:56:28 2020 +0300

    Added new test in test.txt







 
