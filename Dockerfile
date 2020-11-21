FROM openjdk:11-jre
LABEL maintainer="BCP-BOOTCAMP"
ENV spring.application.name ms-adventure-works-products-v1

COPY build/libs/ms-adventure-works-products-*SNAPSHOT.jar /opt/ms-adventure-works-products.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8","-jar","/opt/ms-adventure-works-products.jar"]
