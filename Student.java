package week3.day2;

public class Student extends Department {
	
	public void studentname() {
		
		System.out.println("Jeevitha");
	}

	public void studentdept() {
		
		System.out.println("Civil");
	}
	
	public void studentid() {
		
		System.out.println("09C129");
	}
	
	public static void main(String[] args) {
		
		Student data =new Student();
		data.collegename();
		data.collegecode();
		data.collegerank();
		data.deptname();
		data.studentname();
		data.studentdept();
		data.studentid();
	}
}
