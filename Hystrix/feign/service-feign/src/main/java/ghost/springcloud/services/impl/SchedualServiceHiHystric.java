package ghost.springcloud.services.impl;

import ghost.springcloud.services.SchedualServiceHi;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	public String sayHiFromClientOne(String name) {
		// TODO Auto-generated method stub
		return "sorry "+name;
	}

}
