package sandy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductInventory1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductInventory1Application.class, args);
		System.out.println("inside api");
	}

}
