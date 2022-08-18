package test;

import java.sql.SQLException;




import java.util.List;
import java.util.Scanner;
import dao.GradesDAO;
import dao.GradesDAOImpl;
import dao.STS1DAO;
import dao.STS1DAOImpl;
import dao.STS2DAO;
import dao.STS2DAOImpl;
import dao.STS3DAO;
import dao.STS3DAOImpl;
import dao.Student_TeacherDAO;
import dao.Student_TeacherDAOImpl;
import dao.StudentsDAO;
import dao.StudentsDAOImpl;
import dao.SubjectsDAO;
import dao.SubjectsDAOImpl;
import dao.TeachersDAO;
import dao.TeachersDAOImpl;
import pojo.Grades;
import pojo.STS1;
import pojo.STS2;
import pojo.STS3;
import pojo.Student_Teacher;
import pojo.Students;
import pojo.Subjects;
import pojo.Teachers;
import jdbc.Database;



public class test {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);  // Switch
		
		Scanner sc1=new Scanner(System.in); // case 1 Switch1 SUBJECTS
		Scanner sc2=new Scanner(System.in); // case 1
		
		Scanner sc3=new Scanner(System.in); // case 2 Switch2 TEACHERS
		Scanner sc4=new Scanner(System.in); // case 2
		
		Scanner sc5=new Scanner(System.in); // case 3 Switch3 STUDENT_TEACHERS
		Scanner sc6=new Scanner(System.in); // case 3
		
		Scanner sc7=new Scanner(System.in); // case 4 Switch4 STUDENTS
		Scanner sc8=new Scanner(System.in); // case 4
		
		Scanner sc9=new Scanner(System.in); // case 5 Switch5 STS1
		Scanner sc10=new Scanner(System.in); // case 5
		
		Scanner sc11=new Scanner(System.in); // case 6 Switch6 STS2
		Scanner sc12=new Scanner(System.in); // case 6
		
		Scanner sc13=new Scanner(System.in); // case 7 Switch7 STS3
		Scanner sc14=new Scanner(System.in); // case 7
		
		Scanner sc15=new Scanner(System.in); // case 8 Switch8 EXIT
		Scanner sc16=new Scanner(System.in); // case 8
		
		boolean flag=true;
		
		while(flag==true) {
			
			System.out.println("");
			
			System.out.println("1 Subjects");
			System.out.println("2 Teachers");
			System.out.println("3 Student_Teacher");
			System.out.println("4 Students");
			System.out.println("5 Grades");
			System.out.println("6 Get Teachers and Subject details through teacher id");
			System.out.println("7 Get Studends and Grade details through student id");
			System.out.println("8 Get Subject, Teachers, Students and Grade details through student st_id");
			System.out.println("9 Exit");
			
			int Switch = sc.nextInt();
			switch(Switch) {
			
			case 1:  //////////////////// SUBJECTS ///////////////////
				
				
				boolean flag1=true;
				while(flag1==true) {
					System.out.println("");
					
					System.out.println("1 retrive through id");
					System.out.println("2 retrive all");
//					System.out.println("3 insert");
//					System.out.println("4 update");
//					System.out.println("5 delete");
					System.out.println("3 exist");
					
					int Switch1=sc1.nextInt();
					
					switch(Switch1) {
					case 1:
						System.out.println("Enter id");
						int id=sc2.nextInt();
						SubjectsDAO subjectsDAO=new SubjectsDAOImpl();
						
						 Subjects subject = subjectsDAO.get(id);
						 System.out.println(subject);
						 
						break;
						
					case 2:
						System.out.println("List of Subjects");
						List<Subjects> subjects;
						SubjectsDAO subjectsDAO2 = new SubjectsDAOImpl(); 
						subjects = subjectsDAO2.getAll();
						for(Subjects subjects2 : subjects) {
							System.out.println(subjects2);
						}
						break;
						
					case 3:
						flag1=false;
						System.out.println("Exit");
						break;
						
					
					}
				}
				
				break;
				
			case 2:  //////////////////// TEACHERS ///////////////////
				boolean flag2=true;
				while(flag2==true) {
					
					System.out.println("");
					
					System.out.println("1 retrive through t_id");
					System.out.println("2 retrive all");
					System.out.println("3 update");
					System.out.println("4 retrive subjects details through teachers id");
					System.out.println("5 exist");
					
					int Switch2=sc3.nextInt();
					switch(Switch2) {
					case 1:
						System.out.println("Enter t_id");
						int t_id=sc4.nextInt();
						TeachersDAO teachersDAO=new TeachersDAOImpl();
						
						Teachers teacher=teachersDAO.get(t_id);
						System.out.println(teacher);
						
						break;
						
					case 2:
						System.out.println("List of Teachers");
						List<Teachers> teachers;
						TeachersDAO teachersDAO2=new TeachersDAOImpl();
						teachers = teachersDAO2.getALL();
						for(Teachers teacher2: teachers) {
							System.out.println(teacher2);
						}
						
						break;
						
					case 3:
						System.out.println("Enter t_id");
						int T_ID=sc4.nextInt();
						System.out.println("Enter first name");
						String FN=sc4.next();
						System.out.println("Enter last name");
						String LN=sc4.next();
						System.out.println("Enter phone");
						long P=sc4.nextLong();
						System.out.println("Enter email id");
						String E_ID=sc4.next();
						System.out.println("Enter subject id");
						int S_ID=sc4.nextInt();
		
						
						TeachersDAO teachersDAO3 = new TeachersDAOImpl(); 
						Teachers teacher3 = new Teachers(T_ID,FN, LN, P, E_ID,S_ID);
						teachersDAO3.update(teacher3);
						System.out.println(teacher3);
						break;
						
					case 4:
						System.out.println("valid");
						break;
						
					case 5:
						flag2=false;
						System.out.println("Exit");
						break;
						
					}
					
				}
				
				break;
				
			case 3:  //////////////////// STUDENTS_TEACHERS ///////////////////
				boolean flag3=true;
				while(flag3==true) {
				System.out.println(" ");
				System.out.println("1 retrive through st_id");
				System.out.println("2 retrive all");
				System.out.println("3 insert");
				System.out.println("4 update");
				System.out.println("5 delete");
				System.out.println("6 exist");
				
				int Switch3=sc5.nextInt();
				switch(Switch3) {
				case 1:
					System.out.println("Enter st_id");
					int st_id=sc6.nextInt();
					Student_TeacherDAO student_teacherDAO=new Student_TeacherDAOImpl();
					
					Student_Teacher s_t=student_teacherDAO.get(st_id);
					System.out.println(s_t);
					break;
					
				case 2:
					System.out.println("List of Students_Teachers");
					List<Student_Teacher> s_t2;
					Student_TeacherDAO student_teacherDAO2=new Student_TeacherDAOImpl();
					s_t2 = student_teacherDAO2.getAll();
					for(Student_Teacher student_teacher2: s_t2) {
						System.out.println(student_teacher2);
					}
					break;
					
				case 3:
					System.out.println("Enter st_id");
					int ST_ID3=sc6.nextInt();
					System.out.println("Enter teacher id");
					int T_ID3=sc6.nextInt();
					System.out.println("Enter student id");
					int S_ID3=sc6.nextInt();
					
					
					Student_TeacherDAO student_teacherDAO3 = new Student_TeacherDAOImpl(); 
					Student_Teacher st_id3 = new Student_Teacher(ST_ID3, T_ID3, S_ID3);
					int result = student_teacherDAO3.insert(st_id3);
					System.out.println(result);
					break;
					
				case 4:
					System.out.println("Enter st_id");
					int ST_ID=sc6.nextInt();
					System.out.println("Enter teacher id");
					int T_ID=sc6.nextInt();
					System.out.println("Enter student id");
					int S_ID=sc6.nextInt();
					
	
					
					Student_TeacherDAO student_teacherDAO4 = new Student_TeacherDAOImpl(); 
					Student_Teacher s_t4 = new Student_Teacher(ST_ID,T_ID,S_ID);
					student_teacherDAO4.update(s_t4);
					System.out.println(s_t4);
					break;
					
				case 5:
					System.out.println("Enter s_id");
					int S_ID6=sc2.nextInt();
					
					Student_TeacherDAO student_teacherDAO6 = new Student_TeacherDAOImpl(); 
					Student_Teacher s_t6 = student_teacherDAO6.get(S_ID6);
					
					System.out.println(s_t6);
					
					int result2 = student_teacherDAO6.delete(s_t6);
					System.out.println(result2);
					break;
					
			
				case 6:
					flag3=false;
					System.out.println("Exit");
					break;
				}
				
				}
				
				break;
				
			case 4:  //////////////////// STUDENTS ///////////////////
				boolean flag4=true;
				while(flag4==true) {
					System.out.println("");
					System.out.println("1 retrive through s_id");
					System.out.println("2 retrive all");
					System.out.println("3 insert");
					System.out.println("4 update");
					System.out.println("5 delete");
					System.out.println("6 exist");
					
					int Switch4=sc7.nextInt();
					switch(Switch4) {
					case 1:
						System.out.println("Enter s_id");
						int s_id=sc8.nextInt();
						StudentsDAO studentsDAO=new StudentsDAOImpl();
						
						Students student=studentsDAO.get(s_id);
						System.out.println(student);
						
						break;
						
					case 2:
						System.out.println("List of Students");
						List<Students> students;
						StudentsDAO studentsDAO2 = new StudentsDAOImpl(); 
						students = studentsDAO2.getAll();
						for(Students students2 : students) {
							System.out.println(students2);
						}
						break;
					
					case 3:
						System.out.println("Enter s_id");
						int S_ID8=sc8.nextInt();
						System.out.println("Enter first name");
						String FN8=sc8.next();
						System.out.println("Enter last name");
						String LN8=sc8.next();
						System.out.println("Enter phone");
						long P8=sc8.nextLong();
						System.out.println("Enter email id");
						String E_ID8=sc8.next();
						System.out.println("Enter grade id");
						int G_ID8=sc8.nextInt();
						
						
						StudentsDAO studentsDAO8 = new StudentsDAOImpl(); 
						Students student8 = new Students(S_ID8, FN8, LN8, P8, E_ID8, G_ID8);
						int result = studentsDAO8.insert(student8);
						System.out.println(result);
						break;
						
					case 4:
						System.out.println("Enter s_id");
						int S_ID=sc8.nextInt();
						System.out.println("Enter first name");
						String FN=sc8.next();
						System.out.println("Enter last name");
						String LN=sc8.next();
						System.out.println("Enter phone");
						long P=sc8.nextLong();
						System.out.println("Enter email id");
						String E_ID=sc8.next();
						System.out.println("Enter grade id");
						int G_ID=sc8.nextInt();
		
						
						StudentsDAO studentsDAO4 = new StudentsDAOImpl(); 
						Students student4 = new Students(S_ID,FN, LN, P, E_ID,G_ID);
						studentsDAO4.update(student4);
						System.out.println(student4);
						break;
						
					case 5:
						System.out.println("Enter s_id");
						int S_ID_8=sc2.nextInt();
						
						StudentsDAO studentsDAO_8 = new StudentsDAOImpl(); 
						Students s_t8 = studentsDAO_8.get(S_ID_8);
						
						System.out.println(s_t8);
						
						int result2 = studentsDAO_8.delete(s_t8);
						System.out.println(result2);
						break;
						
					
					case 6:
						flag4=false;
						System.out.println("Exit");
						break;
					}
				}
				
				break;
				
			case 5:  //////////////////// GRADES ///////////////////
				
				boolean flag5=true;
				while(flag5==true) {
					System.out.println("");
					System.out.println("1 retrive through s_id");
					System.out.println("2 retrive all");
					System.out.println("3 exist");
					
					
					int Switch5=sc9.nextInt();
					switch(Switch5) {
					case 1:
						System.out.println("Enter g_id");
						int g_id=sc10.nextInt();
						
						GradesDAO gradesDAO=new GradesDAOImpl();
						Grades grade=gradesDAO.get(g_id);
						System.out.println(grade);
						
						break;
						
					case 2:
						System.out.println("List of Grades");
						List<Grades> grades;
						GradesDAO gradesDAO2 = new GradesDAOImpl(); 
						grades = gradesDAO2.getAll();
						for(Grades grades2 : grades) {
							System.out.println(grades2);
						}
						break;
						
					case 3:
						flag5=false;
						System.out.println("Exit");
						break;
						
					
					}
					
				}
				
				break;
				
			case 6:  //////////////////// STS1 ///////////////////

				boolean flag6=true;
				while(flag6==true) {
					System.out.println("");
					System.out.println("1 retrive through t_id");
					System.out.println("2 retrive all");
					System.out.println("3 exist");
					
					
					int Switch6=sc11.nextInt();
					switch(Switch6) {
					case 1:
						System.out.println("Enter t_id");
						int t_id=sc12.nextInt();
						
						STS1DAO sts1DAO=new STS1DAOImpl();
						STS1 sts1=sts1DAO.get(t_id);
						System.out.println(sts1);
						
						break;
						
					case 2:
						System.out.println("List of All");
						List<STS1> sts1_2;
						STS1DAO sts1DAO2=new STS1DAOImpl(); 
						sts1_2 = sts1DAO2.getAll();
						for(STS1 sts2 : sts1_2) {
							System.out.println(sts2);
						}
						break;
						
					case 3:
						flag6=false;
						System.out.println("Exit");
						break;
						
					
					}
					
				}
				break;
				
			case 7:  //////////////////// STS2 ///////////////////
				
				boolean flag7=true;
				while(flag7==true) {
					System.out.println("");
					System.out.println("1 retrive through s_id");
					System.out.println("2 retrive all");
					System.out.println("3 exist");
					
					
					int Switch7=sc13.nextInt();
					switch(Switch7) {
					case 1:
						System.out.println("Enter s_id");
						int s_id=sc12.nextInt();
						
						STS2DAO sts2DAO=new STS2DAOImpl();
						STS2 sts2_2=sts2DAO.get(s_id);
						System.out.println(sts2_2);
						
						break;
						
					case 2:
						System.out.println("List of All");
						List<STS2> sts2_2_2;
						STS2DAO sts2DAO2=new STS2DAOImpl(); 
						sts2_2_2 = sts2DAO2.getAll();
						for(STS2 sts2 : sts2_2_2) {
							System.out.println(sts2);
						}
						break;
						
					case 3:
						flag7=false;
						System.out.println("Exit");
						break;
						
					
					}
					
				}
				
				break;
				
			case 8:  //////////////////// STS3 ///////////////////
				boolean flag8=true;
				while(flag8==true) {
					System.out.println("");
					System.out.println("1 retrive through st_id");
					System.out.println("2 retrive all");
					System.out.println("3 exist");
					
					
					int Switch8=sc14.nextInt();
					switch(Switch8) {
					case 1:
						System.out.println("Enter st_id");
						int st_id=sc15.nextInt();
						
						STS3DAO sts3DAO=new STS3DAOImpl();
						STS3 sts3_2=sts3DAO.get(st_id);
						System.out.println(sts3_2);
						
						break;
						
					case 2:
						System.out.println("List of All");
						List<STS3> sts3_2_3;
						STS3DAO sts3DAO3=new STS3DAOImpl(); 
						sts3_2_3 = sts3DAO3.getAll();
						for(STS3 sts3 : sts3_2_3) {
							System.out.println(sts3);
						}
						break;
						
					case 3:
						flag8=false;
						System.out.println("Exit");
						break;
						
					
					}
					
				}
				break;
				
			case 9:  //////////////////// EXIT ///////////////////
				flag=false;
				System.out.println("Exit");
				break;
			}
			
		}
		
	}

}
