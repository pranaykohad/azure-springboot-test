package com.pranaykohad.springazure;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class SpringAzureApplication {

	final static Logger log = LoggerFactory.getLogger(SpringAzureApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureApplication.class, args);
		System.out.println("Server started on port 8080 .....");
		log.info("info: Server started...");
		log.debug("debug: Server started...");
		log.error("error: Server started...");
	}

	@GetMapping("friends")
	public List<String> getFriends() {
		List<String> list = new ArrayList<>();
		list.add("Pranay Kohad");
		list.add("Anuj Kumar");
		list.add("Nilesh Kapale");
		list.add("Bhushan Patil");
		return list;
	}

}
