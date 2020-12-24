 1. D:\java\jdk-11
2.Path=D:\java\jdk-11
3.Path=%Path%;D:\java\apache-maven-3.6.3\bin

Запускаем томкат
4.D:\>cd D:\java\apache-tomcat-9.0.41\bin
D:\java\apache-tomcat-9.0.41\bin>startup.bat

ДОбавляем плагин			
			
			<plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>tomcat-maven-plugin</artifactId>
                <version>1.1</version>
                <configuration>
                    <url>http://localhost/manager/text</url>
                    <path>/tomcat_home</path>
                    <username>tomcat</username>
                    <password>tomcat</password>
                </configuration>
            </plugin>
Делаем mvn clean install
И начинаем работать с плагином
			
D:\jd2_hw\tomcat4\tomcat_home>mvn tomcat:info
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< it.academy:tomcat_home >-----------------------
[INFO] Building tomcat_home 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:info (default-cli) @ tomcat_home ---
[INFO] Listing server information at http://localhost/manager/text
[INFO] OK - Server info
[INFO] Tomcat Version: [Apache Tomcat/9.0.41]
[INFO] OS Name: [Windows 10]
[INFO] OS Version: [10.0]
[INFO] OS Architecture: [amd64]
[INFO] JVM Version: [11+28]
[INFO] JVM Vendor: [Oracle Corporation]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.331 s
[INFO] Finished at: 2020-12-24T08:34:16+03:00
[INFO] ------------------------------------------------------------------------


D:\jd2_hw\tomcat4\tomcat_home>mvn tomcat:redeploy
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< it.academy:tomcat_home >-----------------------
[INFO] Building tomcat_home 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] >>> tomcat-maven-plugin:1.1:redeploy (default-cli) > package @ tomcat_home >>>
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ tomcat_home ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ tomcat_home ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ tomcat_home ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\jd2_hw\tomcat4\tomcat_home\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ tomcat_home ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ tomcat_home ---
[INFO]
[INFO] --- maven-war-plugin:3.3.1:war (default-war) @ tomcat_home ---
[INFO] Packaging webapp
[INFO] Assembling webapp [tomcat_home] in [D:\jd2_hw\tomcat4\tomcat_home\target\tomcat_home-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Building war: D:\jd2_hw\tomcat4\tomcat_home\target\tomcat_home-1.0-SNAPSHOT.war
[INFO]
[INFO] <<< tomcat-maven-plugin:1.1:redeploy (default-cli) < package @ tomcat_home <<<
[INFO]
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:redeploy (default-cli) @ tomcat_home ---
[INFO] Deploying war to http://localhost/tomcat_home
[INFO] OK - Deployed application at context path [/tomcat_home]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.719 s
[INFO] Finished at: 2020-12-24T08:35:14+03:00
[INFO] ------------------------------------------------------------------------

D:\jd2_hw\tomcat4\tomcat_home>mvn tomcat:undeploy
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< it.academy:tomcat_home >-----------------------
[INFO] Building tomcat_home 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:undeploy (default-cli) @ tomcat_home ---
[INFO] Undeploying application at http://localhost/tomcat_home
[INFO] OK - Undeployed application at context path [/tomcat_home]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.051 s
[INFO] Finished at: 2020-12-24T08:36:58+03:00
[INFO] ------------------------------------------------------------------------


D:\jd2_hw\tomcat4\tomcat_home>mvn tomcat:start
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< it.academy:tomcat_home >-----------------------
[INFO] Building tomcat_home 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:start (default-cli) @ tomcat_home ---
[INFO] Starting application at http://localhost/tomcat_home
[INFO] OK - Started application at context path [/tomcat_home]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.528 s
[INFO] Finished at: 2020-12-24T08:38:14+03:00


D:\jd2_hw\tomcat4\tomcat_home>mvn tomcat:list
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< it.academy:tomcat_home >-----------------------
[INFO] Building tomcat_home 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:list (default-cli) @ tomcat_home ---
[INFO] Listing applications at http://localhost/manager/text
[INFO] OK - Listed applications for virtual host [localhost]
[INFO] /:running:0:ROOT
[INFO] /tomcat_home:running:0:tomcat_home
[INFO] /examples:running:0:examples
[INFO] /host-manager:running:0:host-manager
[INFO] /tomcat-quicstart:running:0:tomcat-quicstart
[INFO] /manager:running:0:manager
[INFO] /docs:running:0:docs
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.563 s
[INFO] Finished at: 2020-12-24T08:38:43+03:00
[INFO] ------------------------------------------------------------------------

D:\jd2_hw\tomcat4\tomcat_home>mvn tomcat:sessions
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< it.academy:tomcat_home >-----------------------
[INFO] Building tomcat_home 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:sessions (default-cli) @ tomcat_home ---
[INFO] Listing session information for application at http://localhost/tomcat_home
[INFO] OK - Session information for application at context path [/tomcat_home]
[INFO] Default maximum session inactive interval is [30] minutes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.566 s
[INFO] Finished at: 2020-12-24T08:39:33+03:00
[INFO] ------------------------------------------------------------------------