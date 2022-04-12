package eu.europa.edpb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eu.europa.edpb.service.Article56Service;

@Controller
@RequestMapping("/pages")
public class WebController {

	@Autowired
	private Article56Service article56;


	@GetMapping(value="/view")
	public String viewAll(Model model) {
	  	
		model.addAttribute("article56", article56.findSchemaArticle56());
		return "view-article56";
	}
	
	
    @RequestMapping("/welcome")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="Article56") String name) {
        model.addAttribute("name", name);
        return "welcome";
    }


}
