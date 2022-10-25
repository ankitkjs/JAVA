package core_java_programs;
import java.util.*;
public class Exception_Handling_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a=8;
		int b= scn.nextInt();
		int c= scn.nextInt();
		int arr[]= {2,4,6};
		try
		{
			int div = a/b;
			System.out.println("div of "+a+" & "+b+" is: "+div);
			arr[c]=20;
			System.out.println(arr[c]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("I will always be executed.");
		}
		
		

	}

}
