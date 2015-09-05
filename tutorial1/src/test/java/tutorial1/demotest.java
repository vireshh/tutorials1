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
	
}

@Test
public void takeIt()
{
	
}

}
