package provider;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Document;
import repositories.DocumentRepository;

public class DocumentService implements IDocumentService {
	private final String template = "Hello Hello %s.";
	
	private final DocumentRepository repository;
	
	@Autowired
	public DocumentService (DocumentRepository documentRepository) {
		repository = documentRepository;
	}
	
	public Document SayGreeting(String name) {
		Document document = new Document();
		document.setContent(String.format(template, name));
		repository.save(document);
		
		return document;
	}

}
