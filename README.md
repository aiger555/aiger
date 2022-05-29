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
