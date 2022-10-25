package core_java_programs;

class Vehicle
{
	int year_of_manufacture;
	String name;
	String type;
	void setData(int year_of_manufacture,String name,String type)
	{
		this.year_of_manufacture = year_of_manufacture;
		this.name = name;
		this.type = type;
	}
	String getData()
	{
		String info = "Name: "+name+", Type: "+type+", Year of Manufacture:"+year_of_manufacture;
		return info;
	}
}

public class Class_and_Objects_2 {
	public static void main(String args[])
	{
		Vehicle obj1 = new Vehicle();
		Vehicle obj2 = new Vehicle();
		Vehicle obj3 = new Vehicle();
		obj1.setData(2015, "scooter", "two-wheeler");
		obj2.setData(2017, "auto-rickshaw", "three-wheeler");
		obj3.setData(2018, "car", "four-wheeler");
		System.out.println(obj1.getData());
		System.out.println(obj2.getData());
		System.out.println(obj3.getData());
	}
}
