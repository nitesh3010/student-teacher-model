package pojo;

public class Grades {

	private int g_id;
	private String grade;
	
	
	
	public Grades(int g_id, String grade) {
		super();
		this.g_id = g_id;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Grades [g_id=" + g_id + ", grade=" + grade + "]";
	}
	
	public int getG_id() {
		return g_id;
	}
	public void setG_id(int g_id) {
		this.g_id = g_id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
