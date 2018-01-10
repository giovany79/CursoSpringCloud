package pluralsight.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PluralsightSprintcloudM3TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSprintcloudM3TaskApplication.class, args);
	}
	
	@Bean
	public TollProcesingTask tollProcessingTask(){
		return new TollProcesingTask();
	}
	
	public class TollProcesingTask implements CommandLineRunner{

		@Override
		public void run(String... strings) throws Exception {
			// TODO Auto-generated method stub
			
			//parameters stationid, license plate, timestamp
			if(null != strings){
				System.out.println("parameter lenght is" + strings.length);
				String stationId = strings[0];
				String licensePlate = strings[1];
				String timestamp = strings[2];
				System.out.println("Station ID is " + stationId + ", plate is " + licensePlate + ", timestamp is " + timestamp);
			}
			
		}
	}
}
