package entity;

public class Document {
	private final long id;
	private final String content;

	public Document(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public long getId() {
		return id;
	}
	
	
}
