import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.demo2.Demo2Application;

public class ServletInitializer extends SpringBootServletInitializer {
	 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Demo2Application.class);
	}//servelet

}
