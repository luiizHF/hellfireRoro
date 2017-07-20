package com.luiizhf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

//@ComponentScan("com.luiizhf")
//@EntityScan( basePackages = "com.luiizhf")
//@EnableJpaRepositories("com.luiizhf")
//@EnableScheduling()
@SpringBootApplication
public class HellfireRoroApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellfireRoroApplication.class, args);
	}
	// ahora solo agrego un comentario baby
	//ahora solo quiero probar las ramas en git baby
}
