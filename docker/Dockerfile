FROM ubuntu:22.04

RUN mkdir /app

ADD https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.97/bin/apache-tomcat-9.0.97.tar.gz /app/

RUN mv apache-tomcat-9.0.97 apache-tomcat-09

CMD ["sh /app/apache-tomcat-09/bin/startup.sh"]