package com.springApp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.hamcrest.collection.IsEmptyCollection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //pour considérer cette classe  comme un controlleur on va rajouter cette annotation 
public class PagesController {

	//dans cette class on va créer un ensemble d'actions (méthodes) 
	@GetMapping("/") //si on fait une requete de type GET vers la page d'acceuil tu vas m'executer cette méthode  
	// @ResponseBody : permet de dire que ce que va mettre ici considere le comme une réponse ne viens pas de dire que tu cherches un template
	//utilise la meta données comme une réponse 
//@RequestParam : permet de dire c'est une paramétre de notre GET 
	//required = false pour dire que ce paramétre n'est pas obligatoire
	public String home(@RequestParam(defaultValue=" world ", required=false) String name, ModelMap modelMap){
		/* String name=request.getParameter("name")!=null && !request.getParameter("name").isEmpty()
				?request.getParameter("name") 
				:"world";*/
				modelMap.put("name", name);
		//System.out.println("\n\n\n"+ request.getParameter("name")+"\n\n\n");
		return "pages/home";
	}
}
