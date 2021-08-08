package com.corey.springbootjpamultidb;

import com.corey.springbootjpamultidb.entity.User;
import com.corey.springbootjpamultidb.repo.db1.Db1UserRepo;
import com.corey.springbootjpamultidb.repo.db2.Db2UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJpaMultidbApplication {

	@Autowired
	Db1UserRepo db1UserRepo;
	@Autowired
	Db2UserRepo db2UserRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaMultidbApplication.class, args);
	}

	@Bean
	CommandLineRunner run() {
		return args -> {
			User user = new User(null, "Corey", 34);
			User user2 = new User(null, "Doreen", 32);
			db1UserRepo.save(user);
			db1UserRepo.save(user2);
			db2UserRepo.save(user);
			db2UserRepo.save(user2);
		};
	}

}
