прописываем путь Maven
Path=%Path%;D:\java\apache-maven-3.6.3\bin

переходим в папку \jd2_hw\maven3\task7 
D:\>cd D:\jd2_hw\maven3\task7

D:\jd2_hw\maven3\task7>

Создаем проект:
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp
 -DartifactId=testWebApp -DgroupId=com.it.academy.maven -Dversoin=1.0-SNAPSHOT -Dpackage=com.it.academy.maven

переходим в папку проекта
cd D:\jd2_hw\maven3\task7\testWebApp>

Запускаем компилирование , тестирование проекта и установка 
mvn compile
mvn test install



