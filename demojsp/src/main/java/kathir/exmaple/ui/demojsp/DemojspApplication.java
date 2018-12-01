package kathir.exmaple.ui.demojsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemojspApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemojspApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemojspApplication.class);
	}
}
