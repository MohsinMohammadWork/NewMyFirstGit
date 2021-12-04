import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import controllernew.HelloWorldController;

@EnableWebMvc
@SpringBootApplication
public class SpringBootApplicationDemo {
public static void main(String args[]) {
	SpringApplication.run(HelloWorldController.class,args);
}
}
