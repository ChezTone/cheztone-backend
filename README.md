# cheztone-backend

This project exposes a REST Api and store all data in a MongoDb repository.

# Usage

This project should run deployed in a tomcat server.

# Stack

The project is build Using Java Spring Swagger And Maven

# Docker

This project contains a Dockerfile which allow you to build a container on top of tomcat8.

To build your own docker just run the following command in a terminal

`docker build -t myUser/myRepository .`

If you wanna use a build of the current master branch it is available using the docker command

`docker run cheztone/cheztone-backend`