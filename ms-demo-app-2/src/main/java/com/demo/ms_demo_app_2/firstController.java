package com.demo.ms_demo_app_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/demo")
public class firstController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to second client";
	}
	
	@Autowired
    private RestTemplate restTemplate;

    @Value("${gateway.base-url}")
    private String gatewayUrl;
    
    @GetMapping("/call-service-1")
    public String callService1() {
        String url = gatewayUrl + "/app1/number";
        Integer response = restTemplate.getForObject(url, Integer.class);
        return "Service 2 called Service 1 and got Integer: " + response;
    }

}
