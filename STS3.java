package pojo;

public class STS3 {
	private int st_id;
	private int t_id;
	private String first_name;
	private String last_name;
	private long phone;
	private String email_id;
	private String subject_name;
	private int s_id;
	private String first_name2;
	private String last_name2;
	private long phone2;
	private String email_id2;
	private String grade;
	
	
	
	
	
	public STS3(int st_id, int t_id, String first_name, String last_name, long phone, String email_id,
			String subject_name, int s_id, String first_name2, String last_name2, long phone2, String email_id2,
			String grade) {
		super();
		this.st_id = st_id;
		this.t_id = t_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.email_id = email_id;
		this.subject_name = subject_name;
		this.s_id = s_id;
		this.first_name2 = first_name2;
		this.last_name2 = last_name2;
		this.phone2 = phone2;
		this.email_id2 = email_id2;
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "STS3 [st_id=" + st_id + ", t_id=" + t_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", phone=" + phone + ", email_id=" + email_id + ", subject_name=" + subject_name + ", s_id=" + s_id
				+ ", first_name2=" + first_name2 + ", last_name2=" + last_name2 + ", phone2=" + phone2 + ", email_id2="
				+ email_id2 + ", grade=" + grade + "]";
	}
	
	
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
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
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getFirst_name2() {
		return first_name2;
	}
	public void setFirst_name2(String first_name2) {
		this.first_name2 = first_name2;
	}
	public String getLast_name2() {
		return last_name2;
	}
	public void setLast_name2(String last_name2) {
		this.last_name2 = last_name2;
	}
	public long getPhone2() {
		return phone2;
	}
	public void setPhone2(long phone2) {
		this.phone2 = phone2;
	}
	public String getEmail_id2() {
		return email_id2;
	}
	public void setEmail_id2(String email_id2) {
		this.email_id2 = email_id2;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
