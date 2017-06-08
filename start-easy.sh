#!/usr/bin/env bash

export PROJECT_HOME=/home/admin/app
export PROJECT_HOME_LOGS_O=${PROJECT_HOME}/logs
export BUILD_LOG=${PROJECT_HOME_LOGS_O}/jetty_stdout.log

if [ ! -d "$PROJECT_HOME_LOGS_O" ];then
    echo create $PROJECT_HOME_LOGS_O
    mkdir -p ${PROJECT_HOME_LOGS_O}
fi
if [ ! -f "$BUILD_LOG" ];then
    echo create $BUILD_LOG
    touch $BUILD_LOG
fi

# 到这目录下面
cd $PROJECT_HOME/src

# 打包

mvn clean package -Dmaven.test.skip -U

# 进入web 目录下 target 执行
cd sion-web/target
# 显示下目录
ls

java -jar sion-web-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev | tee $BUILD_LOG &