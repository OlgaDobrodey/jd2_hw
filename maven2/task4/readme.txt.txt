TASK 4
 
CMOPILE TEST AND PACKAGE

D:\jd2_hw\maven2\home-work>mvn compile test package


[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< it.academy:home-work >------------------------
[INFO] Building home-work 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ home-work ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ home-work ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ home-work ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ home-work ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running it.academy.AppTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.04 s - in it.academy.AppTest
[INFO] Running it.academy.AverageListTest
Average =  10.00[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 s - in it.academy.AverageListTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ home-work ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ home-work ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ home-work ---
[INFO] Skipping execution of surefire because it has already been run for this configuration
[INFO]
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ home-work ---
[INFO] Building jar: D:\jd2_hw\maven2\home-work\target\home-work-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.231 s
[INFO] Finished at: 2020-12-14T10:42:56+03:00
[INFO] ------------------------------------------------------------------------

VERIFY INSTALL

D:\jd2_hw\maven2\home-work>mvn verify install

[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< it.academy:home-work >------------------------
[INFO] Building home-work 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ home-work ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ home-work ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ home-work ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running it.academy.AppTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.034 s - in it.academy.AppTest
[INFO] Running it.academy.AverageListTest
Average =  10.00[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 s - in it.academy.AverageListTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ home-work ---
[INFO] Building jar: D:\jd2_hw\maven2\home-work\target\home-work-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ home-work ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ home-work ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ home-work ---
[INFO] Skipping execution of surefire because it has already been run for this configuration
[INFO]
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ home-work ---
[INFO] Building jar: D:\jd2_hw\maven2\home-work\target\home-work-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ home-work ---
[INFO] Installing D:\jd2_hw\maven2\home-work\target\home-work-1.0-SNAPSHOT.jar to D:\java\.m2\repositoty\it\academy\home-work\1.0-SNAPSHOT\home-work-1.0-SNAPSHOT.jar
[INFO] Installing D:\jd2_hw\maven2\home-work\pom.xml to D:\java\.m2\repositoty\it\academy\home-work\1.0-SNAPSHOT\home-work-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.918 s
[INFO] Finished at: 2020-12-14T10:45:24+03:00
[INFO] ------------------------------------------------------------------------

CLEAN

D:\jd2_hw\maven2\home-work>mvn clean
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< it.academy:home-work >------------------------
[INFO] Building home-work 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ home-work ---
[INFO] Deleting D:\jd2_hw\maven2\home-work\target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.604 s
[INFO] Finished at: 2020-12-14T10:50:45+03:00
[INFO] ------------------------------------------------------------------------

SITE
D:\jd2_hw\maven2\home-work>mvn site

[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< it.academy:home-work >------------------------
[INFO] Building home-work 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-site-plugin:3.7.1:site (default-site) @ home-work ---
[INFO] configuring report plugin org.apache.maven.plugins:maven-project-info-reports-plugin:3.0.0
[INFO] 15 reports detected for maven-project-info-reports-plugin:3.0.0: ci-management, dependencies, dependency-info, dependency-management, distribution-management, index, issue-management, licenses, mailing-lists, modules, plugin-management, plugins, scm, summary, team
[INFO] Rendering site with default locale English (en)
[INFO] Relativizing decoration links with respect to localized project URL: http://www.example.com
[INFO] Rendering content with org.apache.maven.skins:maven-default-skin:jar:1.2 skin.
[INFO] Generating "Dependencies" report  --- maven-project-info-reports-plugin:3.0.0:dependencies
[INFO] Generating "Dependency Information" report --- maven-project-info-reports-plugin:3.0.0:dependency-info
[INFO] Generating "About" report         --- maven-project-info-reports-plugin:3.0.0:index
[INFO] Generating "Plugin Management" report --- maven-project-info-reports-plugin:3.0.0:plugin-management
[INFO] Generating "Plugins" report       --- maven-project-info-reports-plugin:3.0.0:plugins
[INFO] Generating "Summary" report       --- maven-project-info-reports-plugin:3.0.0:summary
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  13.043 s
[INFO] Finished at: 2020-12-14T10:55:06+03:00
[INFO] ------------------------------------------------------------------------


