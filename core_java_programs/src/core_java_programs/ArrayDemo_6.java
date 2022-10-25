package core_java_programs;

public class ArrayDemo_6 {

	public static void main(String[] args) {
		
		// one-dimensional array
		
		int arr1[] = new int[5];
		for(int i=0;i<5;i++)
		{
			arr1[i]=(i*3);
		}
		
		// printing elements of array using normal for-loop
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		// printing elements of array using enhanced for-loop
		for(int elem:arr1)
		{
			System.out.print(elem+" ");
		}
		System.out.println();
		System.out.println();
		
		// two-dimensional array
		
		int twod[][] = new int[3][4];
		
		for(int i=0;i<twod.length;i++)
		{
			for(int j=0;j<twod[i].length;j++)
			{
				twod[i][j]=(i+j)+3;
			}
		}
		for(int i=0;i<twod.length;i++)
		{
			for(int j=0;j<twod[i].length;j++)
			{
				System.out.print(twod[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
