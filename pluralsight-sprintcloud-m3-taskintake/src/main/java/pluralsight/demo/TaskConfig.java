package pluralsight.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {
	
	public TaskProcessor taskProcessor(){
		return new TaskProcessor();
	}

}
