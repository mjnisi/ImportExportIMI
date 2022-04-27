package eu.europa.edpb;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;

import eu.europa.edpb.model.ReferenceValue2List;
import eu.europa.edpb.model.ReferenceValueList;
import eu.europa.edpb.model.Value;

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
