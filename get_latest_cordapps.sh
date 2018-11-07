#!/bin/bash

(
    cd ./libs
    curl -o cordapps.zip http://git.dev.ctp.local/digital-street/digital-street-cordapp-jar/-/archive/master/digital-street-cordapp-jar-master.zip
    unzip -o -j cordapps.zip */*.jar
    rm cordapps.zip
)