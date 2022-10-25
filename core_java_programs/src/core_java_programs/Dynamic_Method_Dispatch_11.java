package core_java_programs;

class P
{
	void met1()
	{
		System.out.println("in parent - method1");
	}
	void met2()
	{
		System.out.println("in parent - method2");
	}
}

class C extends P
{
	void met2()
	{
		System.out.println("in child - method2");
	}
	void met3()
	{
		System.out.println("in child - method3");
	}
}

public class Dynamic_Method_Dispatch_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P obj = new C();	// dynamic method dispatch
		obj.met1();
		obj.met2();
		//obj.met3();			// cannot call met3() using obj

	}

}
