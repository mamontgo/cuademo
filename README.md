Software Requirements:
java8+
Maven 3+
git client


Build Instructions:
Unzip cuademo.zip. 
Alternativly clone the project from the get repo:
git clone https://github.com/mamontgo/cuademo.git


To run unit and integration tests:
mvn clean install

To run web application:
mvn spring-boot:run

to test web application:
1) call rest end point to encode
http://localhost:8080/encoded?payload=Encode

2) call rest end point to decode 
http://localhost:8080/decoded?payload=Ksgrff
