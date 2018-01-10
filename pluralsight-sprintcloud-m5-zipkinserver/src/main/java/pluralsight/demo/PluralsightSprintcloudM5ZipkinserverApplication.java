package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class PluralsightSprintcloudM5ZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSprintcloudM5ZipkinserverApplication.class, args);
	}
}
