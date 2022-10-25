package core_java_programs;

class Student
{
	int rollno;
	String name;
	double gpa;
	Student()
	{
		System.out.println("default constructor called");
	}
	Student(int rollno,String name,double gpa)
	{
		this.rollno=rollno;
		this.name=name;
		this.gpa=gpa;
	}
}

public class Constructor_3 {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(50,"Ankit",9.05);
		//System.out.println(s1.name+":-> "+s1.rollno+":-> "+s1.gpa);
		System.out.println(s2.name+":-> "+s2.rollno+":-> "+s2.gpa);
	}

}
