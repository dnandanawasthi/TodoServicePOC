As a requirement to build a simple online TODO list with a web interface that can be used in
all popular web browsers. The application has to Support multiple users, store necessary
data in a in-memory database and be built with J2EE technology (use of open-source
frameworks is also allowed)


Below is selection of POC only. Actual implementation may have different stack depend of size, traffic, load, performance etc.
Spring Boot 1.4.3.RELEASE
Spring 4.3.5.RELEASE 
Spring data JPA 1.10.6.RELEASE 
Hibernate 5.0.11.Final 
MySQL 5.1.40 
H2 1.4.187
Hikari CP 2.4.7 
AngularJS 1.5.8

To Start application
mvn springboot:run / java -jar <jar file name from target> –spring.profiles.active=local

profile can be set "local or prod"

This VM argument can be set incase if application is being executed from eclipse or different tool
-Dspring.profiles.active=local or -Dspring.profiles.active=prod

To Access application
http://localhost:8080/TodoServicePOC/#/
