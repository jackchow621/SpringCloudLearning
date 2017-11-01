# SpringCloudLearning
Spring Cloud 学习

断路器监控

Hystrix Dashboard作为断路器状态的一个组件，提供了数据监控和友好的图形化界面

1、访问locahost:8762/hystrix显示数据监控界面；

2、在界面依次输入：locahost:8762/hystrix.stream 、2000 、jack ，点monitor stream；

3、浏览器访问：http://localhost:8762/hi?name=test；

4、重新刷新hystrix.stream网页，你会看到良好的图形化界面，以及一些监控数据。
