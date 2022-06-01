FROM openjdk:18
LABEL maintainer="javaguides.net"
ADD target/student-management-system-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
#how this application is going to run in a docker container
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]