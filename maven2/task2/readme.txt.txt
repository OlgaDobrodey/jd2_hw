
D:\jd2_hw\maven2\task1>cd..

D:\jd2_hw\maven2>md task2

D:\jd2_hw\maven2>md task3 task4

NEW PTOJECT MAVEN

D:\jd2_hw\maven2>mvn archetype:generate

8: 1.4
Choose a number: 8: 8
Define value for property 'groupId': it.academy
Define value for property 'artifactId': home-work
Define value for property 'version' 1.0-SNAPSHOT: :
Define value for property 'package' it.academy: :
Confirm properties configuration:
groupId: it.academy
artifactId: home-work
version: 1.0-SNAPSHOT
package: it.academy
 Y: : Y
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: maven-archetype-quickstart:1.4
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: it.academy
[INFO] Parameter: artifactId, Value: home-work
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: it.academy
[INFO] Parameter: packageInPathFormat, Value: it/academy
[INFO] Parameter: package, Value: it.academy
[INFO] Parameter: groupId, Value: it.academy
[INFO] Parameter: artifactId, Value: home-work
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Project created from Archetype in dir: D:\jd2_hw\maven2\home-work
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  13:25 min
[INFO] Finished at: 2020-12-14T00:51:44-08:00
[INFO] ------------------------------------------------------------------------

COMPILE MAVEN PROJECT

D:\jd2_hw\maven2\task2\home-work>mvn clean compile
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< it.academy:home-work >------------------------
[INFO] Building home-work 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ home-work ---
[INFO] Deleting D:\jd2_hw\maven2\task2\home-work\target
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\task2\home-work\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ home-work ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to D:\jd2_hw\maven2\task2\home-work\target\classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.116 s
[INFO] Finished at: 2020-12-14T01:35:23-08:00
[INFO] ------------------------------------------------------------------------

D:\jd2_hw\maven2\task2\home-work>