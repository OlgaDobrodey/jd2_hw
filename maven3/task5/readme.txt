Прописываем путь Maven
Path=%Path%;D:\java\apache-maven-3.6.3\bin
 
Создаем проект Parent
D:\jd2_hw\maven3\home_work_modul3>mvn validate

D:\jd2_hw\maven3>mvn archetype:generate -DgroupId=com.epam.maven -DArtifactId=MySampleApp

D:\jd2_hw\maven3>cd home_work_modul3

D:\jd2_hw\maven3\home_work_modul3>mvn compile package

D:\jd2_hw\maven3\home_work_modul3>mvn test

D:\jd2_hw\maven3\home_work_modul3>mvn install

Меняем  <packaging>pom</packaging>

Создаем Сhild MOdul jar

D:\jd2_hw\maven3>cd home_work_modul3
D:\jd2_hw\maven3\home_work_modul3>mvn archetype:generate

maven-archetype-quickstart

Modul war

D:\>cd D:\jd2_hw\maven3\home_work_modul3

D:\jd2_hw\maven3\home_work_modul3>mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp

Confirm properties configuration:
groupId: it.academy
artifactId: modulWar
version: 1.0-SNAPSHOT
package: it.academy
 Y: : Y


в Parent pom генерируется 
<modules>
        <module>modulJar</module>
        <module>modulWar</module>
    </modules>


COMPILE AND INSTALL CHILD MODULES

D:\jd2_hw\maven3\home_work_modul3>mvn clean install

[INFO] Packaging webapp
[INFO] Assembling webapp [modulWar] in [D:\jd2_hw\maven3\home_work_modul3\modulWar\target\modulWar]
[INFO] Processing war project
[INFO] Copying webapp resources [D:\jd2_hw\maven3\home_work_modul3\modulWar\src\main\webapp]
[INFO] Webapp assembled in [49 msecs]
[INFO] Building war: D:\jd2_hw\maven3\home_work_modul3\modulWar\target\modulWar.war
[INFO] WEB-INF\web.xml already added, skipping
[INFO]
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ modulWar ---
[INFO] Installing D:\jd2_hw\maven3\home_work_modul3\modulWar\target\modulWar.war to D:\java\.m2\repositoty\it\academy\modulWar\1.0-SNAPSHOT\modulWar-1.0-SNAPSHOT.war
[INFO] Installing D:\jd2_hw\maven3\home_work_modul3\modulWar\pom.xml to D:\java\.m2\repositoty\it\academy\modulWar\1.0-SNAPSHOT\modulWar-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for home_work_modul3 1.0-SNAPSHOT:
[INFO]
[INFO] home_work_modul3 ................................... SUCCESS [  0.488 s]
[INFO] modulJar ........................................... SUCCESS [  2.624 s]
[INFO] modulWar Maven Webapp .............................. SUCCESS [  8.643 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.886 s
[INFO] Finished at: 2020-12-14T12:53:28+03:00
[INFO] ------------------------------------------------------------------------

