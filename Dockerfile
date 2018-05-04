FROM java:8
VOLUME /tmp
ADD target/football.jar football.jar
ENTRYPOINT exec java -jar football.jar