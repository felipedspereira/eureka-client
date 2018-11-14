package br.gov.am.prodam.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebtestApplication {

	@Autowired
	private HttpServletRequest request;	
	@GetMapping("ola")
	public String olaMundo() {
		return "OLA " + request.getRequestURL();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebtestApplication.class, args);
	}
}
