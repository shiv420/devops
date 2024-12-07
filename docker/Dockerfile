FROM ubuntu:22.04

RUN apt-get update && apt-get install -y openjdk-8-jdk --yes

ENV JAVA_HOME /usr/lib/jvm/java-1.8.0-openjdk-amd64

RUN mkdir /app

WORKDIR /app

ADD https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.97/bin/apache-tomcat-9.0.97.tar.gz /app/

RUN tar -xzvf apache-tomcat-9.0.97.tar.gz ; mv apache-tomcat-9.0.97 apache-tomcat

EXPOSE 8080
ENV CATALINA_HOME /app/apache-tomcat
ENV PATH $CATALINA_HOME/bin:$PATH
CMD ["catalina.sh","run"]



