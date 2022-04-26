package eu.europa.edpb.controller;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;

import eu.europa.edpb.model.AssumedCSAOnetomany;
import eu.europa.edpb.model.AssumedCSAOnetomanyList;
import eu.europa.edpb.model.EdpbDemoArticle56;
import eu.europa.edpb.model.EdpbDemoArticle56List;
import eu.europa.edpb.service.Article56Service;

@Controller
@RequestMapping("/pages")
public class WebController {

	@Autowired
	private Article56Service article56;

	@GetMapping(value = "/view")
	public String viewAll(Model model) {

		model.addAttribute("article56", article56.findSchemaArticle56());
		return "view-article56";
	}

	@RequestMapping("/welcome")
	public String hello(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "Article56") String name) {
		model.addAttribute("name", name);
		return "welcome";
	}

	@RequestMapping("/article56")
	public String article56(Model model) {
		
        XStream xStream = new XStream();
        xStream.processAnnotations(EdpbDemoArticle56.class);
        xStream.processAnnotations(EdpbDemoArticle56List.class);

        //Clear out all permissions
        xStream.addPermission(NoTypePermission.NONE);
        xStream.allowTypes(new Class[]{EdpbDemoArticle56List.class});
        xStream.allowTypes(new Class[]{EdpbDemoArticle56.class});
        xStream.allowTypes(new Class[]{AssumedCSAOnetomany.class});
        
        xStream.ignoreUnknownElements();
        xStream.setClassLoader(Thread.currentThread().getContextClassLoader());

        String xmlString = article56.findAllArticle56();
        
        System.out.println("xmlString = " + xmlString);

        EdpbDemoArticle56List art56List = (EdpbDemoArticle56List)xStream.fromXML(xmlString);
        System.out.println("Deserialized object = " + art56List);
		
		model.addAttribute("article56List", art56List);
		return "all-article56";
	}

}
