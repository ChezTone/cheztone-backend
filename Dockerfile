FROM tomcat:8.0-jre8

RUN rm -rf $CATALINA_HOME/webapps/*
COPY ./target/*.war $CATALINA_HOME/webapps/ROOT.war

CMD ["catalina.sh", "run"]
