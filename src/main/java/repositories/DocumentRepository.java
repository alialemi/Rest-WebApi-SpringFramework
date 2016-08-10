package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> 
{
	
}
