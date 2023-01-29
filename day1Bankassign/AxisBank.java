package week3.day1Bankassign;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println(60000);
	}
	
	public static void main(String args[])
	{
		AxisBank B1 = new AxisBank();
		B1.saving();
		B1.fixed();
		B1.deposit();
	}
}
