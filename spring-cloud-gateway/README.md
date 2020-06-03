```yaml
spring:
  boot:
    admin:
      client:
        url: http://spring-boot-admin:7015 #配置admin-server地址
        instance:
          prefer-ip: true
  zipkin:
    base-url: http://123.206.196.94:9411
    sleuth:
      sampler:
        probability: 0.1 #设置Sleuth的抽样收集概率
  cloud:
    gateway:
      discovery:
        locator:
          enabled: true #开启从注册中心动态创建路由的功能
          lower-case-service-id: true #使用小写服务名，默认是大写
        
management:
  endpoints:
    web:
      exposure:
        include: '*'
  endpoint:
    health:
      show-details: always
```