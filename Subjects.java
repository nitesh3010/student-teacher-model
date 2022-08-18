package pojo;

//import pojo.Teachers;

public class Subjects {
	
	private int id;
	private String subject_name;
	
	
	
	public Subjects(int id, String subject_name) {
	//	super();
		this.id = id;
		this.subject_name = subject_name;
	}

	

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", subject_name=" + subject_name + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	
	
	
}


