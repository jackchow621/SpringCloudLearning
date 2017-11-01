package ghost.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@EnableDiscoveryClient  // 通过该注解，实现服务发现，注册
@SpringBootApplication
@RestController
@EnableHystrix
@EnableHystrixDashboard
public class EurekaJackApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaJackApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	@HystrixCommand(fallbackMethod = "hiError")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;
	}
	
	public String hiError(String name){
		return "hi,"+name+",sorry,error!";
	}
}
