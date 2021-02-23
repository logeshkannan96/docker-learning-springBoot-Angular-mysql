FROM openjdk:8-alpine
ADD target/docker-springboot-0.0.1-SNAPSHOT.jar content-management.jar
ENTRYPOINT ["java", "-jar", "content-management.jar"]