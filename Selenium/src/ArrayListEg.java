import java.util.ArrayList;


public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		
		x.add("Selenium");
		x.add(300000);
		x.add('M');
		x.add(true);
		x.add("Selenium");
		x.add(7, "Sharath");
		
		
		//Finding the length of the arraylist
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
			
		}
		

	}

}
