package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class PluralsightSprintcloudM3TasksinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSprintcloudM3TasksinkApplication.class, args);
	}
}
