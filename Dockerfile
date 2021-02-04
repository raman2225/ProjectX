FROM java:8
EXPOSE 8080
ADD /target/projectx-0.0.1-SNAPSHOT.jar projectx.jar
ENTRYPOINT ["java","-jar","projectx.jar"]