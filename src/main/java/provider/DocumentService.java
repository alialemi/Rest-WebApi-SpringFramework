package provider;

import entity.Document;
import java.util.concurrent.atomic.AtomicLong;

public class DocumentService implements IDocumentService {
	private static final String template = "Hello Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	public Document SayGreeting(String name) {
		 return new Document(counter.incrementAndGet(),
                 String.format(template, name));
	}

}
