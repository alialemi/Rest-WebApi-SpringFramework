package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCUMENT")
public class Document {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DOCUMENT_ID")
	private long id;
    
	@Column(name="DOCUMENT_CONTENT")
    private String content;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
    
}
