package core_java_programs;

class VarArgsDemo
{
	int sum(int ...arr)
	{
		int ans=0;
		for(int elem:arr)
		{
			ans+=elem;
		}
		return ans;
	}	
}
public class VarArgsDemo_7 {

	public static void main(String[] args) {
		
		VarArgsDemo obj = new VarArgsDemo();
		System.out.println(obj.sum());
		System.out.println(obj.sum(1));
		System.out.println(obj.sum(1,2));
		System.out.println(obj.sum(1,2,3));
		System.out.println(obj.sum(1,2,3,4));
	}

}
