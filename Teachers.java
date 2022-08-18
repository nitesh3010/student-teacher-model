package pojo;
//import pojo.Subjects;

public class Teachers{
	
	
	private int t_id;
	private String first_name;
	private String last_name;
	private long phone;
	private String email_id;
	private int subject_id;
	
	
	
	

	public Teachers(int t_id, String first_name, String last_name, long phone, String email_id,int subject_id) {
	//	super();
		this.t_id = t_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.email_id = email_id;
		this.subject_id = subject_id;
	}
	

	

	@Override
	public String toString() {
		return "Teachers [t_id=" + t_id + ", first_name=" + first_name + ", last_name=" + last_name + ", phone=" + phone
				+ ", email_id=" + email_id + ", subject_id=" + subject_id + "]";
	}
	
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
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
	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	
}
