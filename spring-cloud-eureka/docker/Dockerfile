#基础镜像
FROM java:8
#拷贝app包到镜像目录
COPY spring-cloud-eureka.jar /app/spring-cloud-eureka.jar
#拷贝启动命令
COPY start.sh /app/
#启动命令
ENTRYPOINT cd /app && sh start.sh