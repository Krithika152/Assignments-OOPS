package week3.day1Assign4;

public class Students {
int id = 2311;
String s = "ABC";
	public void getStudentInfo(int id)
	{
		System.out.println(" The id of the student is " + id);
	}
	
	public void getStudentInfo(int id,String s)
	{
		System.out.println(" The id and name of the student is " + id + s);
	}
	
	public void getStudentInfo(String email,String phnnum)
	{
		System.out.println(" The email and phonenumber of the student is " + email+ phnnum);
	}
	
	public static void main(String args[])
	{
		Students std = new Students();
		std.getStudentInfo(2311);
		std.getStudentInfo(2311,",ABC");
		std.getStudentInfo("kk@gmail.com",",25678");
		
	}
	
	
}
