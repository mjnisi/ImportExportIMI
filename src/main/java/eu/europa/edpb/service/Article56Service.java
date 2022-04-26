package eu.europa.edpb.service;

import java.io.File;

import javax.swing.text.Document;

public interface Article56Service {
	
	public String findAllArticle56();
	
	public String findArticle56ById(Long id);
	
	public String findSchemaArticle56();

	public String findSchemaReferenceTypeArticle56();

	public String findSchemaReferenceValueListArticle56();

	public String findReferenceValueListArticle56();

}
