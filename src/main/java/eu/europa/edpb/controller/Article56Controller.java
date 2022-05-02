package eu.europa.edpb.controller;

import java.io.InputStream;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import eu.europa.edpb.service.Article56Service;

@RestController
@RequestMapping("/article56")
public class Article56Controller {

	@Autowired
	private Article56Service article56;

	private static final Logger logger = Logger.getLogger(Article56Controller.class.getName());

	
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
	

	@GetMapping(value = "/getschematron", produces = MediaType.APPLICATION_XML_VALUE)
	public String getSchematron() {
		return article56.findSchematronDocumentationArticle56();
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

	//import
	@GetMapping(value = "/createArticle56", produces = MediaType.APPLICATION_XML_VALUE)
	public String createArticle56() {
		return article56.createArticle56();
	}
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadData(@RequestParam("file") MultipartFile file) throws Exception {

		if (file == null) {
			throw new RuntimeException("You must select the a file for uploading");
		}

		InputStream inputStream = file.getInputStream();
		String originalName = file.getOriginalFilename();
		String name = file.getName();
		String contentType = file.getContentType();
		long size = file.getSize();

		logger.info("inputStream: " + inputStream);
		logger.info("originalName: " + originalName);
		logger.info("name: " + name);
		logger.info("contentType: " + contentType);
		logger.info("size: " + size);

		// Do processing with uploaded file data in Service layer
		return new ResponseEntity<String>(originalName, HttpStatus.OK);
	
	}

}