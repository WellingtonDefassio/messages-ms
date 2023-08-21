FROM openjdk:17-alpine
VOLUME /tmp 
COPY target/message-ms-0.0.1-SNAPSHOT.jar message-ms.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/message-ms.jar"]