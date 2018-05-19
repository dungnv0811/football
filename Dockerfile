FROM java:8
EXPOSE 8084
VOLUME /tmp
ADD target/football.jar football.jar
ENTRYPOINT exec java -jar football.jar