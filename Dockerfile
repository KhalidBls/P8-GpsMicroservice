FROM openjdk:8-jdk-alpine

VOLUME /tmp

ADD build/libs/*.jar GpsMicroservice.jar

EXPOSE 9091

ENTRYPOINT ["java","-jar","GpsMicroservice.jar"]