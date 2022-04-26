package eu.europa.edpb.service;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.Document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class Article56ServiceImpl implements Article56Service {

	@Autowired
	private RestTemplate clientRest;
	
	@Autowired
	private AuthService authService;
	
	@Value("${export.edpbDemoArticle56.entry.uri}")
	private String getArticle56ByIdUri;	
	
	@Value("${export.edpbDemoArticle56.uri}")
	private String getAllArticle56Uri;
	
	@Value("${export.edpbDemoArticle56.schema.uri}")
	private String getSchemaArticle56Uri;

	@Value("${export.edpbDemoArticle56.referenceValueList.uri}")
	private String getReferenceValueListArticle56;

	@Value("${export.edpbDemoArticle56.schema.referenceValueList.uri}")
	private String getSchemaReferenceValueListArticle56;
		
	@Value("${export.edpbDemoArticle56.schema.referenceType.uri}")
	private String getSchemaReferenceTypeArticle56;
		
	
	
	@Override
	public String findAllArticle56() {
		
		try {
		    String token = authService.getToken();
			
//			List<EdpbDemoArticle56> edpbDemoArticle56List = Arrays.asList(clientRest.getForObject(url, EdpbDemoArticle56[].class));

			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization" , "Bearer "+ token );
		    headers.setContentType(MediaType.APPLICATION_XML);
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

		    HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(headers);

		    ResponseEntity<String> response = null;

		    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getAllArticle56Uri);
		    try {
		        response = clientRest.exchange(builder.toUriString(),
		                HttpMethod.GET,
		                entity, 
		                String.class);
		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.hasBody());
//		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.getBody());

		        return response.getBody();
		    } catch (Exception e) {
				System.out.println("** Exception: " + e.getMessage());
		    }		
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return null;

	}

	@Override
	public String findArticle56ById(Long id) {
		
		Map<String,String> pathVariables = new HashMap<String,String>();
		pathVariables.put("id", id.toString());
		
		try {
			String token = authService.getToken();

			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization" , "Bearer "+ token );
		    headers.setContentType(MediaType.APPLICATION_XML);

		    HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(headers);

		    ResponseEntity<String> response = null;

		    try {
		        response = clientRest.exchange(getArticle56ByIdUri,
		                HttpMethod.GET,
		                entity, String.class, pathVariables);
		        System.out.println("Result - status ("+ response.getStatusCode() + ") body: " + response.getBody());

		        return response.getBody().toString();
		    } catch (Exception e) {
		        System.out.println("** Exception: "+ e.getMessage());
		    }
		
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return null;

	}

	@Override
	public String findSchemaArticle56() {

		try {
		    String token = authService.getToken();
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization" , "Bearer "+ token );
		    headers.setContentType(MediaType.APPLICATION_XML);
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

		    HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(headers);

		    ResponseEntity<String> response = null;

		    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getSchemaArticle56Uri);
		    try {
		        response = clientRest.exchange(builder.toUriString(),
		                HttpMethod.GET,
		                entity, 
		                String.class);
		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.hasBody());
		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.getBody());

		        return response.getBody();
		        
		    } catch (Exception e) {
		        System.out.println("** Exception: "+ e.getMessage());
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return null;

	}



	@Override
	public String findReferenceValueListArticle56() {

		try {
		    String token = authService.getToken();
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization" , "Bearer "+ token );
		    headers.setContentType(MediaType.APPLICATION_XML);
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

		    HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(headers);

		    ResponseEntity<String> response = null;

		    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getReferenceValueListArticle56);
		    try {
		        response = clientRest.exchange(builder.toUriString(),
		                HttpMethod.GET,
		                entity, 
		                String.class);
		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.hasBody());
		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.getBody());

		        return response.getBody();
		        
		    } catch (Exception e) {
		        System.out.println("** Exception: "+ e.getMessage());
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return null;

	}

	@Override
	public String findSchemaReferenceValueListArticle56() {

		try {
		    String token = authService.getToken();
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization" , "Bearer "+ token );
		    headers.setContentType(MediaType.APPLICATION_XML);
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

		    HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(headers);

		    ResponseEntity<String> response = null;

		    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getSchemaReferenceValueListArticle56);
		    try {
		        response = clientRest.exchange(builder.toUriString(),
		                HttpMethod.GET,
		                entity, 
		                String.class);
		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.hasBody());
		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.getBody());

		        return response.getBody();
		        
		    } catch (Exception e) {
		        System.out.println("** Exception: "+ e.getMessage());
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return null;

	}

	@Override
	public String findSchemaReferenceTypeArticle56() {

		try {
		    String token = authService.getToken();
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization" , "Bearer "+ token );
		    headers.setContentType(MediaType.APPLICATION_XML);
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

		    HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(headers);

		    ResponseEntity<String> response = null;

		    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getSchemaReferenceTypeArticle56);
		    try {
		        response = clientRest.exchange(builder.toUriString(),
		                HttpMethod.GET,
		                entity, 
		                String.class);
		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.hasBody());
		        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.getBody());

		        return response.getBody();
		        
		    } catch (Exception e) {
		        System.out.println("** Exception: "+ e.getMessage());
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return null;

	}

}