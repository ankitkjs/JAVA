package core_java_programs;

class Add
{
	int sum(int a,int b)
	{
		return (a+b);
	}
	int sum(int a,int b,int c)
	{
		return (a+b+c);
	}
	double sum(double a,double b)
	{
		return (a+b);
	}
}

public class Method_Overloading_4 {
	public static void main(String[] args) {
		Add obj1 = new Add();
		System.out.println(obj1.sum(3, 4));
		System.out.println(obj1.sum(3, 4, 5));
		System.out.println(obj1.sum(3.52, 4.68));
	}

}
