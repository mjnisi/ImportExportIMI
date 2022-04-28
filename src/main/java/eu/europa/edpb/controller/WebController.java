package eu.europa.edpb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;

import eu.europa.edpb.model.AssumedCSAOnetomany;
import eu.europa.edpb.model.EdpbDemoArticle56;
import eu.europa.edpb.model.EdpbDemoArticle56List;
import eu.europa.edpb.model.ReferenceType;
import eu.europa.edpb.model.ReferenceValue2List;
import eu.europa.edpb.model.ReferenceValueList;
import eu.europa.edpb.model.Value;
import eu.europa.edpb.service.Article56Service;

@Controller
@RequestMapping("/pages")
public class WebController {

	@Autowired
	private Article56Service article56;

//	public Map<String, Map<String, String>> referenceList;

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
		ReferenceType.referenceList = createRefList();

		XStream xStream = new XStream();
		xStream.processAnnotations(EdpbDemoArticle56.class);
		xStream.processAnnotations(EdpbDemoArticle56List.class);

		// Clear out all permissions
		xStream.addPermission(NoTypePermission.NONE);
		xStream.allowTypes(new Class[] { EdpbDemoArticle56List.class });
		xStream.allowTypes(new Class[] { EdpbDemoArticle56.class });
		xStream.allowTypes(new Class[] { AssumedCSAOnetomany.class });

		xStream.ignoreUnknownElements();
		xStream.setClassLoader(Thread.currentThread().getContextClassLoader());

		String xmlString = article56.findAllArticle56();

		EdpbDemoArticle56List art56List = (EdpbDemoArticle56List) xStream.fromXML(xmlString);
		System.out.println("Deserialized object = " + art56List);

		model.addAttribute("article56List", art56List);

//		EdpbDemoArticle56 art56 = art56List.getEdpbDemoArticle56List().get(0);
//		Map<String, String> map1= referenceList.get(art56.getCaseType().getIsLocalCase().getReferenceList());
//		String value = map1.get(art56.getCaseType().getIsLocalCase().getId());

		return "all-article56";
	}

	public Map<String, Map<String, String>> createRefList() {

		XStream xStream2 = new XStream();
		xStream2.processAnnotations(ReferenceValueList.class);
		xStream2.processAnnotations(ReferenceValue2List.class);

		// Clear out all permissions
		xStream2.addPermission(NoTypePermission.NONE);
		xStream2.allowTypes(new Class[] { ReferenceValueList.class });
		xStream2.allowTypes(new Class[] { ReferenceValue2List.class });
		xStream2.allowTypes(new Class[] { Value.class });

		xStream2.ignoreUnknownElements();
		xStream2.setClassLoader(Thread.currentThread().getContextClassLoader());

		String xmlReferenceString = article56.findReferenceValueListArticle56();

		System.out.println("xmlString = " + xmlReferenceString);

		ReferenceValueList refList = (ReferenceValueList) xStream2.fromXML(xmlReferenceString);
		System.out.println("Deserialized object = " + refList);

		Map<String, Map<String, String>> referenceList = new HashMap<>();

		for (ReferenceValue2List ref : refList.getList()) {

			Map<String, String> rList = new HashMap<>();

			for (Value val : ref.getValueList().getValue()) {
				rList.put(val.getId(), val.getText().get(0));
			}
			referenceList.put(ref.getName(), rList);

		}
		return referenceList;

	}

}
