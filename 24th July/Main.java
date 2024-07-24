import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String s1="2001-09-08";
		String s2="2001-06-08";
		String s3="2002-08-08";
		Student st1=new Student(10,"ann",89.9f,convertStringToDate(s1));
		Student st2=new Student(11,"bann",80.9f,convertStringToDate(s2));
		Student st3=new Student(12,"cann",69.9f,convertStringToDate(s3));
		List<Student> l=new ArrayList();
		l.add(st1);
		l.add(st2);
		l.add(st3);
		StudentService obj=new StudentService();
	obj.insertStudentDetails(l);
		List<Student> l3=obj.getStudentDetails();
for(Student l1:l3)
		{
			System.out.println(l1);
		}
	
	}
	public static LocalDate convertStringToDate(String inDate) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date=LocalDate.parse(inDate,dateFormat);
		return date;
	}
}
