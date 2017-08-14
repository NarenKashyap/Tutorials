package ibs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="ibs")
@EntityScan(basePackages="ibs")
@ComponentScan(basePackages="ibs")
public class TutorialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialsApplication.class, args);
	}
}
