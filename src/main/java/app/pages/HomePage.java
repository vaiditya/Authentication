package app.pages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"auth.pages","app.pages"}) 

@SpringBootApplication
public class HomePage {

	
	public static void main(String[] args) {
		SpringApplication.run(HomePage.class, args);

	}

}
