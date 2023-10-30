FROM openjdk:11
COPY ./target/Project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
ENV LANG C.UTF-8
ENV LC_ALL C.UTF-8
WORKDIR ./
CMD ["java","-cp","Project-1.0-SNAPSHOT-jar-with-dependencies.jar","org.cal.Main"]