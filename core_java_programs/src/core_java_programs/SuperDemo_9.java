package core_java_programs;

class Parent
{
	int i=5;
	Parent()
	{
		System.out.println("parent class - default constructor");
	}
	Parent(int k)
	{
		System.out.println("parent class - parameterized constructor");
	}
}

class Children extends Parent
{
	int i=10;
	Children()
	{
		super(10);
		System.out.println("child class - default constructor");
	}
	Children(int k)
	{
		System.out.println(i);
		System.out.println(super.i);
		System.out.println("child class - parameterized constructor");
	}
}

public class SuperDemo_9 {

	public static void main(String[] args) {
		
		Children c1 = new Children();
		Children c2 = new Children(20);

	}

}
