package core_java_programs;
import java.util.Scanner;
public class User_Input_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		int i = scn.nextInt();
		short s = scn.nextShort();
		long l = scn.nextLong();
		float f = scn.nextFloat();
		double d = scn.nextDouble();
		System.out.println(i+" "+s+" "+l+" "+f+" "+d);
		System.out.println(s1);
	}

}
