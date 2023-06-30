FROM amazoncorretto:11.0.17
LABEL version=5.8.1 description="EPAM Report portal. Service jobs" maintainer="Andrei Varabyeu <andrei_varabyeu@epam.com>, Hleb Kanonik <hleb_kanonik@epam.com>"
ARG GH_TOKEN
ARG GH_URL=https://__:$GH_TOKEN@maven.pkg.github.com/reportportal/service-jobs/com/epam/reportportal/service-jobs/5.7.4/service-jobs-5.8.1-exec.jar
RUN curl -O -L $GH_URL \
    --output service-jobs-5.8.1-exec.jar && \
    echo 'exec java ${JAVA_OPTS} -jar service-jobs-5.8.1.exec.jar' > /start.sh && chmod +x /start.sh
ENV JAVA_OPTS=""
VOLUME ["/tmp"]
EXPOSE 8080
ENTRYPOINT ./start.sh