package org.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
/*
 * Actuator is mainly used to expose operational information about the running
 * application — health, metrics, info, dump, env, etc. It uses HTTP endpoints
 * or JMX beans to enable us to interact with it. Once this dependency is on the
 * classpath, several endpoints are available for us out of the box.
 */