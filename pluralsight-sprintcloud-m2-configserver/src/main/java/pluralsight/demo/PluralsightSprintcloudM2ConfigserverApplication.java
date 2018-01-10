package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PluralsightSprintcloudM2ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSprintcloudM2ConfigserverApplication.class, args);
	}
}
