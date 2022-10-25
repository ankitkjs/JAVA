package core_java_programs;

class StaticDemo
{
	int empID;
	String dept;
	static String ceo="Harry";
	void setData(int empID,String dept)
	{
		this.empID = empID;
		this.dept = dept;
	}
	int getID()
	{
		return this.empID;
	}
	String getDept()
	{
		return this.dept;
	}
	static String getCeo()
	{
		return ceo;
	}
	
}
public class Static_keyword_5 {
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.setData(10, "IT");
		StaticDemo obj2 = new StaticDemo();
		obj2.setData(20, "HR");
		StaticDemo obj3 = new StaticDemo();
		obj3.setData(30, "MRKT");
		
		System.out.println(obj1.getID()+": "+obj1.getDept()+": "+StaticDemo.ceo);
		System.out.println(obj2.getID()+": "+obj2.getDept()+": "+StaticDemo.ceo);
		System.out.println(obj3.getID()+": "+obj3.getDept()+": "+StaticDemo.ceo);
	}
}
