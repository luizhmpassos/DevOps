package com.mycompany.intfullname.int_full_name;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.mycompany.intfullname.int_full_name.App;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    
	App intFullName = new App();

	public void testDezenaNula() {
		String name = intFullName.toName(505);		
		assertEquals("Quinhentos e cinco", name);	
	}
		
	public void testZero(){
		String name = intFullName.toName(0);
		assertEquals("zero", name);
	}
	
	public void testCem(){
		String name = intFullName.toName(100);
		assertEquals("cem", name);
	}
	
	public void testCentena(){
		String name = intFullName.toName(101);
		assertEquals("Cento e um", name);
	}

}
