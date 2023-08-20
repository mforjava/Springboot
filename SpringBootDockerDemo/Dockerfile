#base docker image
#FROM openjdk:17-alpine
#LABEL maintainer="javamahi.net"
#ADD target/FirstSpringBoot-0.0.1-SNAPSHOT.jar FirstSpringBoot-0.0.1-SNAPSHOT.jar
#ENTRYPOINT [ "java","-jar", "FirstSpringBoot-0.0.1-SNAPSHOT.jar" ]

##alternate config
FROM openjdk:17-alpine
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY build/libs/*.jar /opt/SpringBootDockerDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT exec java $JAVA_OPTS -jar SpringBootDockerDemo-0.0.1-SNAPSHOT.jar