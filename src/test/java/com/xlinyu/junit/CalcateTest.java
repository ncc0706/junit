package com.xlinyu.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcateTest {

	Calcate calcate = null;
	
	@Before
	public void before(){
		calcate = new Calcate();
	}
	
	@Test
	public void testAdd() {
		int add = calcate.add(2, 3);
		assertEquals("加法计算错误", add, 5);
	}

	@Test
	public void testMinus() {
		int minus = calcate.minus(5, 4);
		assertEquals("减法计算出错", 1, minus);
	}

	@Test
	public void testDevice(){
		int device = calcate.device(20, 10);
		assertEquals("除法计算失败", device, 2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testExceptionDevice(){
		int device = calcate.device(20, 0);
		assertEquals("除法计算失败", device, 2);
	}
	
	@Test(timeout = 300)
	public void testTime(){
		try {
			Thread.sleep(301);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("execute ok");
	}
}
