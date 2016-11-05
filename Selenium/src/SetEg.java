import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetEg {

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<String>();
		//writing the data into hashset
		s.add("Selenium");
		s.add("Manual");
		s.add("UFT");
		s.add("Selenium");
		s.add("Apple");
		s.add("LoadRunner");
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String data=it.next();
			System.out.println(data);
		}

	}

}
