package ghost.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer         //开启eureka服务
@SpringBootApplication      //springBoot注解,spring在springBoot基础之上来构建项目
public class EurekaServerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
