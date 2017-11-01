package ghost.springcloud.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;


import com.netflix.zuul.ZuulFilter;

public class LoggerFilter extends ZuulFilter{
	
	@Autowired
    Tracer tracer;

	public Object run() {
		// TODO Auto-generated method stub
		tracer.addTag("operator","forezp");
        System.out.print(tracer.getCurrentSpan().traceIdString());
		return null;
	}

	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 900;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return FilterConstants.POST_TYPE;
	}

}
