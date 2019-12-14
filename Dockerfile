FROM frekele/ant:latest

WORKDIR /app

COPY src/ ./src
COPY lib/ ./lib
COPY build.xml .
