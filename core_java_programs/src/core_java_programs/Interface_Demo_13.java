package core_java_programs;

interface Sample
{
	int i=10;		// by default it is public,static,final
	void met1();	// by default it is public,abstract
	void met2();
	default void met3()	// default method
	{
		System.out.println("In met-3");
	}
}

class SampleClass implements Sample
{
	public void met1()
	{
		System.out.println("method-1 implemented: "+i);
	}
	public void met2()
	{
		System.out.println("method-2 implemented: "+i);
	}
}
public class Interface_Demo_13 {
	public static void main(String[] args) {
		Sample obj = new SampleClass();
		obj.met1();
		obj.met2();
		obj.met3();
	}

}
