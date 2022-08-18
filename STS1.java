package pojo;

public class STS1 {
	private int id;
	private String first_name;
	private String last_name;
	private long phone;
	private String email_id;
	private String subject_name;
	
	
	
	public STS1(int id, String first_name, String last_name, long phone, String email_id, String subject_name) {
	//	super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.email_id = email_id;
		this.subject_name = subject_name;
	}

	@Override
	public String toString() {
		return "STS1 [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", phone=" + phone
				+ ", email_id=" + email_id + ", subject_name=" + subject_name + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	
	
}
