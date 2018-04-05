package com.sp.ex.spdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpdataApplication {

	private static final Logger log = LoggerFactory.getLogger(SpdataApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpdataApplication.class, args);
	}

/*	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save user
			repository.save(new User("uname@umail.com", "Uname"));

			// fetch users by name
			log.info("Users found with findByName():");
			log.info("-------------------------------");
			for (User u : repository.findByName("Uname")) {
				log.info(u.getEmail());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(1L).ifPresent(customer -> {
				log.info("Customer found with findById(1L):");
				log.info("--------------------------------");
				log.info(customer.getName());
				log.info("");
			});

		};
	}*/
}
