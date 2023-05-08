package org.tcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/")
	public String getMsg() {
		return "Welcome to  REST API";
	}
}
/*
 * if you want details read this doc
 *
 * https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html
 

############  URL : http://localhost:8080/actuator/  ############

health : http://localhost:8080/actuator/health

mappings : http://localhost:8080/actuator/mappings

beans : http://localhost:8080/actuator/beans

heapdump : http://localhost:8080/actuator/heapdump

threaddump : http://localhost:8080/actuator/threaddump

Shutdown : http://localhost:8080/actuator/shutdown


Note: Shutdown is a special endpoint which is used to stop our application and it is mapped to POST request.
====================================================================
*/