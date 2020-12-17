
D:\jd2_hw\maven2>cd home-work

D:\jd2_hw\maven2\home-work>mvn clean compile test
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< it.academy:home-work >------------------------
[INFO] Building home-work 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ home-work ---
[INFO] Deleting D:\jd2_hw\maven2\home-work\target
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ home-work ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\maven2\home-work\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ home-work ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to D:\jd2_hw\maven2\home-work\target\classes
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
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to D:\jd2_hw\maven2\home-work\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ home-work ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running it.academy.AppTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.044 s - in it.academy.AppTest
[INFO] Running it.academy.AverageListTest
Average =  10.00[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in it.academy.AverageListTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.804 s
[INFO] Finished at: 2020-12-14T03:12:45-08:00
[INFO] ------------------------------------------------------------------------