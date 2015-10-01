package com.ourownjava;

import static org.junit.Assert.assertEquals;
import mockit.Mocked;

import org.junit.Test;

public class TestSubClass {
	
	private SubClass subClass;
	
	@Test
	public void shouldGetData(@Mocked final SuperClass superClass){
		subClass = new SubClass("Data");
		assertEquals("Data", subClass.getData());
	}

}
