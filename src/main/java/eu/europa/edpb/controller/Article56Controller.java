package eu.europa.edpb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.europa.edpb.service.Article56Service;

@RestController
@RequestMapping("/article56")
public class Article56Controller {

	@Autowired
	private Article56Service article56;

	@GetMapping(value = "/getall", produces = MediaType.APPLICATION_XML_VALUE)
	public String getAll() {
		return article56.findAllArticle56();
	}

	@GetMapping(value = "/get/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public String get(@PathVariable Long id) {
		return article56.findArticle56ById(id);
	}
	
	@GetMapping(value = "/getschema", produces = MediaType.APPLICATION_XML_VALUE)
	public String getSchema() {
		return article56.findSchemaArticle56();
	}
	
	@GetMapping(value = "/getreferencevaluelist", produces = MediaType.APPLICATION_XML_VALUE)
	public String getReferenceValueList() {
		return article56.findReferenceValueListArticle56();
	}
	
	@GetMapping(value = "/getschemareferencevaluelist", produces = MediaType.APPLICATION_XML_VALUE)
	public String getSchemaReferenceValueList() {
		return article56.findSchemaReferenceValueListArticle56();
	}
	
	@GetMapping(value = "/getschemareferencetype", produces = MediaType.APPLICATION_XML_VALUE)
	public String getSchemaReferenceType() {
		return article56.findSchemaReferenceTypeArticle56();
	}
	
	
	/*
	public void import() {
		
	}
	 */
}
