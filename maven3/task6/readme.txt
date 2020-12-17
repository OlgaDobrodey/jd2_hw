В проекте maven3\home_work_modul3
            
D:\jd2_hw\maven3\home_work_modul3>

settings in parent pom

     <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.2</version>
        </dependency>


in child pom 
 <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>5.1.2</version>
    </dependency>

mvn clean install