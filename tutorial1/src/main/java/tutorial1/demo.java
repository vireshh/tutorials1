package tutorial1;

public class demo {
	boolean b = false;
	NewCl cl = null;
	String name = "viresh";
	boolean nameFlag = false;
	public demo()
	{
		cl = new NewCl();
	}
	
	public int judge()
	{
		
		return cl.take();
	}
	public boolean getBool()
	{
		
		return b;
	}
	
	public Object checkN()
	{
		return null;
	}
	
	public void testCheck()
	{
		if(name.equalsIgnoreCase("viresh"))
		{
			nameFlag = true;
		}
		else
		{
			nameFlag = false;
		}
		
	}
	public static void main(String [] args)
	{
		System.out.println("check in git checking in");
		System.out.println("second check in");
	}
}
