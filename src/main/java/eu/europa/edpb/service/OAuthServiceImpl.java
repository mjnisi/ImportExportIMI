package eu.europa.edpb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.stereotype.Service;

@SuppressWarnings({ "deprecation"})
@Service
public class OAuthServiceImpl implements AuthService {

	@Value("${token-uri}")
	private String tokenUri;

	@Value("${client-id}")
	private String clientId;

	@Value("${client-secret}")
	private String clientSecret;

	@Override
	public String getToken() throws Exception {

		ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
		resourceDetails.setAccessTokenUri(tokenUri);
		resourceDetails.setClientId(clientId);
		resourceDetails.setClientSecret(clientSecret);
		resourceDetails.setGrantType("client_credentials");

		DefaultOAuth2ClientContext clientContext = new DefaultOAuth2ClientContext();

		OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resourceDetails, clientContext);
		System.out.println("access token: " + restTemplate.getAccessToken());

		return restTemplate.getAccessToken().getValue().toString();
	}

}
