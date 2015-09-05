package com.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class DivideTest {
private static Divide div=new Divide();
    //初始化
   @Before
	public void init()
	{
		div.setResult(12);
	}
     //除以12
     @Test
	public void testDivide() {
		div.divide(12);
		assertEquals(1,div.getResult());
	}
	//除以0会有异常
     @Test(expected=Exception.class)
     public final void dividezero()
     {
    	 div.divide(0);
     }
}
	

