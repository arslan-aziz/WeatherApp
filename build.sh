#!bin/bash
rm -r -f build
mkdir build
docker build -t weather-app-builder .
docker run -d --mount type=bind,source="$(pwd)"/build,target=/application/build weather-app-builder
