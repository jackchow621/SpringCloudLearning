# SpringCloudLearning
Spring Cloud 学习

消息总线

Spring Cloud Bus 将服务节点用轻量的消息中间件连接起来，用于广播配置文件的更改或者服务之间的通讯。

本实例使用RabbitMQ作为消息中间件

配置文件仓库：https://github.com/jackchow621/ConfigRepository/

1、更改配置文件仓库中的配置文件信息；

2、使用postman发送post请求：http://localhost:8881/bus/refresh ，此时消息总线会发送消息提示服务节点重新加载配置文件；

3、重新访问各服务节点：http://localhost:8881/hi 或 http://localhost:8882/hi ，得到新的配置文件信息