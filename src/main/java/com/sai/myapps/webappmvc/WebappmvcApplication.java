package com.sai.myapps.webappmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebappmvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(WebappmvcApplication.class, args);
		Topics top= con.getBean(Topics.class);
		top.display();
		
	
	}

}
