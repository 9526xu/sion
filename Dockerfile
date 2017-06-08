FROM maven:3-jdk-8

#RUN apt-get update && apt-get install -y less vim telnet ifconfig
# 创建目录
RUN mkdir -p /home/admin/app
# 切换当前目录

# 将 当前目录下的东西移到
ADD . /home/admin/app/src

ADD start-easy.sh /home/admin/app

WORKDIR /home/admin/app

#RUN pwd
#执行 maven打包命令
#RUN mvn clean package -Dmaven.test.skip
#
#RUN cp ./sion-web/target/sion-web-0.0.1-SNAPSHOT.jar .


#
#RUN java -jar java -jar sion-web-0.0.1-SNAPSHOT.jar


CMD  sh start-easy.sh