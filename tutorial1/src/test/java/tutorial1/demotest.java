package tutorial1;

import static org.junit.Assert.*;

import org.junit.Test;

public class demotest {

@Test
public void shoudReturntrue()
{
	demo demo1 = new demo();
	assertFalse(demo1.getBool());
	System.out.println("the new value");
	System.out.println("the new value 2");
}

@Test
public void takeIt()
{
	System.out.println("few new changes");
}

@Test
public void take()
{
	
}

@Test
public void t()
{
	
}
}
