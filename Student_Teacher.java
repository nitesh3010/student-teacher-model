package pojo;

public class Student_Teacher {
	
	private int st_id;
	private int teacher_id;
	private int student_id;
	
	
	
	public Student_Teacher(int st_id, int teacher_id, int student_id) {
	//	super();
		this.st_id = st_id;
		this.teacher_id = teacher_id;
		this.student_id = student_id;
	}

	@Override
	public String toString() {
		return "Student_Teacher [st_id=" + st_id + ", teacher_id=" + teacher_id + ", student_id=" + student_id + "]";
	}
	
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
}
