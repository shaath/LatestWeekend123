package day5;

public class UserRegTC {

	public static void main(String[] args) throws InterruptedException 
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Usereg("Sandeep G", "Sandeep1234566", "Venkat1234566", "Venkat1234566");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		 

	}

}
