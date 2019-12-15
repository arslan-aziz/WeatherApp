#!bin/bash
docker build -t weather-app-builder .
docker run -d --mount type=bind,source="$(pwd)"/build,target=/app/build weather-app-builder
