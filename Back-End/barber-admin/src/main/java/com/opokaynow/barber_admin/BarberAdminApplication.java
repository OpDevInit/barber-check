package com.opokaynow.barber_admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BarberAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarberAdminApplication.class, args);
	}

}
