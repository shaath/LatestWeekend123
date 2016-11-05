
public class StaticArray {

	public static void main(String[] args)
	{
		String[] course={"Selenium","Manual","UFT"};
		
		//Finding the length
		int len=course.length;
		System.out.println(len);
		
		//Read the values from Array
		
//		System.out.println(course[1]);
		
		for (int i = 0; i < course.length; i++)
		{
			System.out.println(course[i]);
		}
	}

}
