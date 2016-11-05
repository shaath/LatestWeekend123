package day5;

public class org_TestSuite 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		OrgMaster om=new OrgMaster();
		//Login
		System.out.println("Login TC Execution started");
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//Emp reg
		System.out.println("Empreg TC Execution started");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Empreg("Venkat1234", "CH");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//Userreg Tc
		System.out.println("UserReg TC Execution started");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Usereg("Venkat1234 CH", "Venkat12345678", "Venkat1234566", "Venkat1234566");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		 
		//User Login
		System.out.println("UserLogin TC Execution started");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Venkat12345678", "Venkat1234566");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		
	}
	
	
}
