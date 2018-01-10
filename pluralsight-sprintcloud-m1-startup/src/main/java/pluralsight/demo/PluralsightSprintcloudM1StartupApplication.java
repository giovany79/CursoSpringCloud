package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PluralsightSprintcloudM1StartupApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSprintcloudM1StartupApplication.class, args);
	}
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String sayHello(){
		return "Hello Spring Boot...G10";
	}
	
	@RequestMapping(value="/greetingPost", method=RequestMethod.POST)
	public String sayHello2(){
		return "Hello Spring Boot...G10...POST";
	}
}
