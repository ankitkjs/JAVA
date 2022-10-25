package core_java_programs;

class Father
{
	int add(int a,int b)
	{
		return (a+b);
	}
}

class Child extends Father
{
	int sub(int a,int b)
	{
		return (a-b);
	}
}

public class Inheritance_Demo_8 {

	public static void main(String[] args) {
		
		Father f1 = new Father();
		System.out.println(f1.add(3, 4));
		
		Child c1 = new Child();
		System.out.println(c1.add(5, 6));
		System.out.println(c1.sub(5, 4));
		
	}

}
