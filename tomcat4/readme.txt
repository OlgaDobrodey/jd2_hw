ЗАДАНИЕ 8 и 9

Задаем JAVA HOME, Path JDK и Maven

1. D:\java\jdk-11
2.Path=D:\java\jdk-11
3.Path=%Path%;D:\java\apache-maven-3.6.3\bin

Запускаем томкат
4.D:\>cd D:\java\apache-tomcat-9.0.41\bin
D:\java\apache-tomcat-9.0.41\bin>startup.bat

создаем папку tomcat4 

5.D:\>cd D:\jd2_hw
D:\jd2_hw>md tomcat4
D:\jd2_hw>cd tomcat4
D:\jd2_hw\tomcat4>

6. создаем мавен проект в idea
tomcat_home D:\jd2_hw\tomcat4\tomcat_home

7.Добавляем настройки 

MAven home :    D:/java/apache-maven-3.6.3
User setting file:    D:\java\apache-maven-3.6.3\conf\settings.xml
local repository      D:\java\.m2\repositoty

8.ДОбавляем <packaging>war</packaging>
и папки webapp\WEB-INF \web.xml

9.Создаем класс EchoServlet (tomcat4/tomcat_home/src/main/java/it/academy/servlet/EchoServlet.java)
Создаем наследника класса HttpServlet. 
В нем реализуем один метод   @Override doGet().
Потом вытаскиваем из resp ссылку на экземпляр PrintWriter.

c помощью анатации описываем сервет 
@WebServlet
(name = "echoServlet", urlPatterns = "/echo")

удаяем файл web.xml(так как описываем в аннатации)

импортируем javax.servlet

10.В файл POM.XML
добавляем 

10.1 <dependencies>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
        </dependency>
    </dependencies>
	
10.2
кодировка для чтения и записи файлов
 <properties>
        
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
10.3
в  <build> добавляем плагины для мавена 
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>3.3.1</version>
        </plugin>	
10.4 в  <build> добавляем плагины для tomcat
		<plugin>
                <groupId>org.apache.tomcat.maven</groupId>
                <artifactId>tomcat7-maven-plugin</artifactId>
                <version>2.2</version>
                <executions>
                    <execution><id>deployToTomcat9</id>   //делать deploy и undeploy на уров
                        <phase>install</phase>             // на уровне install
                        <goals>
                            <goal>undeploy</goal>
                            <goal>deploy</goal>
                        </goals>
                    </execution>
                </executions>
				 <configuration>
                    <url>http://localhost/manager/text</url>
                    <path>/tomcat_home</path>
                    <server>localhost-tomcat</server>
                </configuration>
         </plugin>
11. Настраиваем хост localhost(должен быть по умолчанию проверяем)
D:\java\apache-tomcat-9.0.41\conf\server.xml

 <Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true">
		 
11 В файле D:\java\apache-tomcat-9.0.41\conf\tomcat-users.xml создаем пользователя 
  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <user username="tomcat" password="tomcat" roles="manager-gui,manager-script"/>
</tomcat-users> 
 
 В файл POM.XML  добавляем конфигурации
	<build>
                <plugin>
                <groupId>org.apache.tomcat.maven</groupId>....
		 <configuration>
                    <url>http://localhost/manager/text</url>
                    <path>/tomcat_home</path>
		    <server>localhost-tomcat</server>
                </configuration>
 прописываем конфигурации(описанные выше , где <server>localhost-tomcat</server> -это настройки
 описанные в D:\java\apache-maven-3.6.3\conf\settings.xml { 
	<server>
            <id>localhost-tomcat</id>
            <username>tomcat</username>
            <password>tomcat</password>
        </server>}

 
 12 Делаем mvn clean install

 13 В папке D:\java\apache-tomcat-9.0.41\webapps
формируются файл tomcat_home.war и папка tomcat_home


 14 Заходим на http://localhost/manager/html/
 под User =tomcat
 Password=tomcat
 отмечаем наличие /tomcat_home в Applications Path
 
 15 по ссылке http://localhost/tomcat_home/echo получаем 
Hello from Echo servlet!
 
               







