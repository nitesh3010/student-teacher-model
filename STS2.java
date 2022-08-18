package pojo;

public class STS2 {
	
	private int s_id;
	private String first_name;
	private String last_name;
	private long phone;
	private String email_id;
	private String grade;
	
	
	
	public STS2(int s_id, String first_name, String last_name, long phone, String email_id, String grade) {
		super();
		this.s_id = s_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.email_id = email_id;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "STS2 [s_id=" + s_id + ", first_name=" + first_name + ", last_name=" + last_name + ", phone=" + phone
				+ ", email_id=" + email_id + ", grade=" + grade + "]";
	}
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
