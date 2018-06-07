FROM openjdk:8-jre-alpine
MAINTAINER Greg Whitaker <greg@netifi.com>
EXPOSE 5050
COPY build/distributions/quip-server.zip /opt/quip-server/
RUN unzip /opt/quip-server/quip-server.zip -d /opt/quip-server
WORKDIR /opt/quip-server/quip-server
CMD ["./bin/quip-server", "-fg"]
