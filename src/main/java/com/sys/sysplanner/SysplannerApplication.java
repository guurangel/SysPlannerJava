package com.sys.sysplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SysplannerApplication {

	public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load(); // carrega o .env
        SpringApplication.run(SysplannerApplication.class, args);
	}

}
