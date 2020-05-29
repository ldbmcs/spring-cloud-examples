#基础镜像
FROM microservice/jdk1.8-skywalking-agent:latest
#拷贝app包到镜像目录
COPY spring-cloud-eureka.jar /spring-cloud-eureka.jar
#拷贝启动命令
COPY start.sh /
#挂载目录
VOLUME ["/tmp"," /app/log"]
#启动命令
ENTRYPOINT cd / && sh start.sh $SPRING_PROFILES_ACTIVE