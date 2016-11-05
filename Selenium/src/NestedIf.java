import java.util.Scanner;


public class NestedIf 
{
	public static void main(String[] args)
	{
	/*	int a=40000;
		int b=300000;
		int c=50000;*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		System.out.println("Enter c value");
		int c=sc.nextInt();
	
		if(a>b & a>c)
		{
			System.out.println("A is Greater");
		}
		else if(b>a & b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
