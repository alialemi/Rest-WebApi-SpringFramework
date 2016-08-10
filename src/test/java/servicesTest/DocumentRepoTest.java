package servicesTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import entity.Document;
import junit.framework.TestCase;
import repositories.DocumentRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="classpath:META-INF/test-application-context.xml")
public class DocumentRepoTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Autowired
	private DocumentRepository repository;
	
	@Test
	public void DocumentRepositoryTest() {
		Document testDoc = new Document();
		testDoc.setContent("Test Dociment content");
		repository.save(testDoc);
		assertNotNull(testDoc.getId());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
