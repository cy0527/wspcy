package com.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class DivideTest {
private static Divide div=new Divide();
    //��ʼ��
   @Before
	public void init()
	{
		div.setResult(12);
	}
     //����12
     @Test
	public void testDivide() {
		div.divide(12);
		assertEquals(1,div.getResult());
	}
	//����0�����쳣
     @Test(expected=Exception.class)
     public final void dividezero()
     {
    	 div.divide(0);
     }
}
	

