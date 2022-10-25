package core_java_programs;

class A
{
	public void met1()
	{
		System.out.println("method-1 in parent class");
	}
}

class B extends A
{
	// overridden method
	
	public void met1()
	{
		System.out.println("method-1 in child class");
	}
}

public class Method_Overriding_10 {

	public static void main(String[] args) {
	
		A a = new A();
		B b = new B();
		a.met1();
		b.met1();
	}

}
