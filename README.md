# aiger
Build Docker Image

$ docker build -t spring-boot-docker.jar .
Check Docker Image

$ docker image ls
Run Docker Image

$ docker run -p 9090:8080 spring-boot-docker.jar


*Docker for postgres

1)docker pull postgres
2)docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres
3)docker ps
4)docker stop 820
5)docker rm 820(container name)

*application.properties
1.spring.datasource.platform=postgres
2.spring.datasource.username=some-postgres
3.spring.datasource.password=mysecretpassword

Maven -> mvn package

sudo docker build -t springboot-docker-demo:latest .
sudo docker images
sudo docker run -p 8081:8080 springboot-docker-demo

FROM openjdk:18
LABEL maintainer="javaguides.net"
ADD target/student-management-system-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
#how this application is going to run in a docker container
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]
