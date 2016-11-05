
public class DynamicArrays {

	public static void main(String[] args)
	{
//		int[] sal=new int[10];
		Object[] sal=new Object[10];
		//finding the length of the array
		System.out.println(sal.length);
		
		//Writing the data into array
		
		sal[2]=30000;
		sal[5]="Selenium";
		sal[7]='M';
		sal[3]=true;
		
		for (int i = 0; i < sal.length; i++)
		{
			System.out.println(sal[i]);
			
		}
		
		
	}

}
