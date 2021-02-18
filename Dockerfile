# Reffer to https://cloud.google.com/community/tutorials/kotlin-springboot-container-engine
FROM openjdk:11
# VOLUME /tmp について https://stackoverflow.com/questions/30464204/spring-boot-docker-using-volume-tmp
VOLUME /tmp
RUN mkdir /work
WORKDIR /work
