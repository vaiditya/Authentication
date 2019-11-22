package app.pages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"auth.pages","app.pages"}) 
@SpringBootApplication
public class HomePage {

	
	public static void main(String[] args) {
		SpringApplication.run(HomePage.class, args);

	}

}
