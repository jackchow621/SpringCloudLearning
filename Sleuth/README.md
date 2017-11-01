# SpringCloudLearning
Spring Cloud 学习

Spring Cloud Sleuth 进阶

采用父子maven工程的方式进行服务集成，包含：eureka-server工程（服务注册中心）、zipkin-server工程（链路追踪服务中心）、 gateway-service工程（服务网关）、user-service工程（链路追踪客户端），同时使用RabbitMQ进行链路通讯，并把生成的链路数据存到Mysql数据库中

Spring Cloud Sleuth中集成Zipkin、Zuul、Eureka等服务
