package pluralsight.demo;



import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;

@SpringBootApplication
public class PluralsightSprintcloudM4SecurecliApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSprintcloudM4SecurecliApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting cron job");
		
		ResourceOwnerPasswordResourceDetails resourceDetails = new ResourceOwnerPasswordResourceDetails();
		resourceDetails.setAuthenticationScheme(AuthenticationScheme.header);
		resourceDetails.setAccessTokenUri("http://localhost:9000/services/oauth/token");
		
		resourceDetails.setScope(Arrays.asList("toll_read"));
		
		resourceDetails.setClientId("pluralsight");
		resourceDetails.setClientSecret("pluralsight");
		resourceDetails.setUsername("givilleg");
		resourceDetails.setPassword("pass2");
		
		OAuth2RestTemplate template = new OAuth2RestTemplate(resourceDetails);
		String token = template.getAccessToken().toString();
		System.out.println("Token:" + token);
		
		String s = template.getForObject("http://localhost:9001/services/tolldata", String.class);
		System.out.println("Result:" + s);
	}
}
