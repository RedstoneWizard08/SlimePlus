#!/bin/bash

NEXT_VERSION="$(java Bump.java)"
CURRENT_VERSION="$(cat .version)"

sed -i "s/version = \"${CURRENT_VERSION}\"/version = \"${NEXT_VERSION}\"/g" build.gradle.kts
sed -i "s/version: ${CURRENT_VERSION}/version: ${NEXT_VERSION}/g" src/main/resources/plugin.yml

echo "${NEXT_VERSION}" > .version
