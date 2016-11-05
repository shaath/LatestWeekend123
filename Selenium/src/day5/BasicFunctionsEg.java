package day5;

public class BasicFunctionsEg {

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicFunctionsEg fun=new BasicFunctionsEg();
		fun.function3();
		res=fun.function4();
		System.out.println(res);
	}

	//static Function without returning any value
	
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	
	//static Function with returning value
	
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
		
	}
	//non static function without returning value
	
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//non static function with returning values
	
	public String function4()
	{
		System.out.println("This is function4 code");
		return "Fail";
	}
}
