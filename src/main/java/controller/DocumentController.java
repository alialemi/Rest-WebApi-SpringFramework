package controller;


import org.springframework.web.bind.annotation.RestController;
import entity.Document;
import provider.IDocumentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/document")
public class DocumentController {
		private final IDocumentService documentService;
		
		@Autowired
		public DocumentController(IDocumentService documentService) {
			this.documentService = documentService;
		}
		
	 	@RequestMapping("/greeting")
	    public Document greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return documentService.SayGreeting(name);
	    }	   	   
}

