package core_java_programs;

abstract class Animal
{
	int age;
	void age()
	{
		System.out.println("My age is: "+age);
	}
	abstract String type();
}

class Dog extends Animal
{
	String type()
	{
		return "mammal";
	}
}

class Snake extends Animal
{
	String type()
	{
		return "reptile";
	}
}
public class Abstract_Demo_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Dog();
		Animal a2 = new Snake();
		a1.age=10;
		a2.age=4;
		System.out.println("My age is: "+a1.age+" & I am a "+a1.type());
		System.out.println("My age is: "+a2.age+" & I am a "+a2.type());
	}

}
