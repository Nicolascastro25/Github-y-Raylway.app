package escuelaing.edu.co.SayHello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"escuelaing.edu.co.SayHello"})
public class SayHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SayHelloApplication.class, args);
	}

}
