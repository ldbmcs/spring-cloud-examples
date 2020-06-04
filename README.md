## 1. 简介
包括大部分核心组件使用的Spring Cloud教程，包括Spring Cloud Alibaba，基于Spring Cloud Hoxton.SR1及SpringBoot 2.2.2.RELEASE。
## 2. 目录
- Spring Cloud 整体架构概览
- Spring Cloud Eureka：服务注册与发现
- Spring Cloud Ribbon：负载均衡的服务调用
- Spring Cloud Hystrix：服务容错保护
- Hystrix Dashboard：断路器执行监控
- Spring Cloud OpenFeign：基于Ribbon和Hystrix的声明式服务调用
- Spring Cloud Zuul：API网关服务
- Spring Cloud Config：外部集中化配置管理
- Spring Cloud Bus：消息总线
- Spring Cloud Sleuth：分布式请求链路跟踪
- Spring Cloud Consul：服务治理与配置中心
- Spring Cloud Gateway：新一代API网关服务
- Zuul、Spring Cloud Gateway 网关对比
- Spring Boot Admin：微服务应用监控
- Spring Cloud Alibaba：Nacos 作为注册中心和配置中心使用
- ZooKeeper、Eureka、Consul 、Nacos 微服务注册中心对比
- Spring Cloud Alibaba：Sentinel实现熔断与限流
## 3. 项目结构
``` lua
spring-cloud-examples
├── config-repo -- spring-cloud-config配置
├── spring-boot-admin -- admin监控中心服务
├── spring-cloud-alibaba-nacos-consumer -- alibaba-nacos作为配置中心的消费者服务
├── spring-cloud-alibaba-nacos-producer -- alibaba-nacos作为配置中心的生产者服务
├── spring-cloud-config -- cloud-config配置中心服务
├── spring-cloud-consul-consumer -- consul作为配置中心的消费者服务
├── spring-cloud-consul-producer -- consul作为配置中心的生产者服务
├── spring-cloud-consumer -- 消费者服务
├── spring-cloud-eureka -- eureka服务端
├── spring-cloud-gateway -- gateway网关服务端
├── spring-cloud-producer -- 生产者服务
├── spring-cloud-zuul -- zuul网关服务端
```
## 4. 感谢
- [SpringBoot-Labs](https://github.com/YunaiV/SpringBoot-Labs):一个涵盖六个专栏：Spring Boot 2.X、Spring Cloud、Spring Cloud Alibaba、Dubbo、分布式消息队列、分布式事务的仓库。
- [springcloud-learning](https://github.com/macrozheng/springcloud-learning):一套涵盖大部分核心组件使用的Spring Cloud教程，包括Spring Cloud Alibaba及分布式事务Seata，基于Spring Cloud Greenwich及SpringBoot 2.1.7。20篇文章，篇篇精华，30个Demo，涵盖大部分应用场景。