
public class TwoDimArray 
{

	public static void main(String[] args) 
	{
		Object[][] s=new Object[2][3];
		//Finding the length of the rows
		System.out.println(s.length);
		
		//Finding the length of the columns
		
		System.out.println(s[1].length);
		
		// Write the into the array
		
		s[0][2]="Selenium";
		s[1][1]=50000;
		
		//Reading the data from array
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
			}
		}
	}

}
