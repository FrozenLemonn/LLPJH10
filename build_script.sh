#!/bin/bash
cd /workspaces/LLPJH10/LauncherApp
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export ANDROID_HOME=/opt/android-sdk
export PATH=$JAVA_HOME/bin:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools:$PATH
./gradlew assembleDebug --no-daemon 2>&1 | tee /tmp/build.log