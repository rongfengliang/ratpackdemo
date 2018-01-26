FROM openjdk:8-jre-alpine
WORKDIR /appdemo/
COPY  build/distributions/ratpackdemo.zip /appdemo
RUN  unzip /appdemo/ratpackdemo.zip
EXPOSE 5050
ENTRYPOINT [ "./ratpackdemo/bin/ratpackdemo"]