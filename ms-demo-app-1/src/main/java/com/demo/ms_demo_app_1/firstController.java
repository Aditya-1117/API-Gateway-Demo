package com.demo.ms_demo_app_1;

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
		return "Welcome to first client";
	}
	
	@Autowired
    private RestTemplate restTemplate;

    @Value("${gateway.base-url}")
    private String gatewayUrl;
    
    @GetMapping("/number")
    public Integer getNumber() {
        return 100;
    }
    
    @GetMapping("/call-service-2")
    public String callService2() {
        String url = gatewayUrl + "/app2/welcome";
        String response = restTemplate.getForObject(url, String.class);
        return "Service 1 called Service 2 and got: " + response;
    }
}
