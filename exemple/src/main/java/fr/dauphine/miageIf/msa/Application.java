package fr.dauphine.miageIf.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class Application {

	/*@RequestMapping("/")
	public String home() {
		return "Welcome.";
	}*/


	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(Application.class, args);
	}
}

