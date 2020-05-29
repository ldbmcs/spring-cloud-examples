#基础镜像
FROM java:8
#拷贝app包到镜像目录
COPY spring-cloud-config.jar /app/spring-cloud-config.jar
#拷贝启动命令
COPY start.sh /app/
#启动命令
ENTRYPOINT cd /app && sh start.sh $SPRING_PROFILES_ACTIVE