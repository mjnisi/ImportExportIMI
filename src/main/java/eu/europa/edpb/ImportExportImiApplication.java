package eu.europa.edpb;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

@Configuration
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class ImportExportImiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImportExportImiApplication.class, args);
	}
	
	@Bean("clientRest")
	public RestTemplate registerRestTemplate() {

		RestTemplate clientRest = new RestTemplate();
		
        MappingJackson2HttpMessageConverter jackson2Converter = new MappingJackson2HttpMessageConverter();
        jackson2Converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        List<HttpMessageConverter<?>> httpMessageConverters = clientRest.getMessageConverters();
        httpMessageConverters.add(jackson2Converter);

        clientRest.setMessageConverters(httpMessageConverters);

        
		return clientRest;
	}
}
