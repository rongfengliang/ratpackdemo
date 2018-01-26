FROM openjdk:8-jre-alpine
WORKDIR /appdemo/
COPY  ratpackdemo-1-1.zip /appdemo
RUN  unzip /appdemo/ratpackdemo-1-1.zip && rm -rf atpackdemo-1-1.zip
EXPOSE 5050
ENTRYPOINT [ "./ratpackdemo/bin/ratpackdemo"]