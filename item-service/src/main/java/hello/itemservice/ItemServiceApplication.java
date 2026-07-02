package hello.itemservice;

import hello.itemservice.web.validation.ItemValidator;
import org.jspecify.annotations.Nullable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ItemServiceApplication //implements WebMvcConfigurer
 {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

/*	@Override
	public @Nullable Validator getValidator() {
		return new ItemValidator();
	}*/

	/*	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages", "errors");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}*/

}
