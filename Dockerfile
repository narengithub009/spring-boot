FROM openjdk:17
EXPOSE 8181
ADD target/spring-boot-3.1.6.jar spring-boot-3.1.6.jar
ENTRYPOINT ["java","-jar","/spring-boot-3.1.6.jar"]