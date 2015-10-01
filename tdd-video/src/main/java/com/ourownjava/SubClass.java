package com.ourownjava;

public class SubClass extends SuperClass{

	private String data;
	
	public SubClass(final String data){
		super(data);
		this.data = data;
	}

	public Object getData() {
		return data;
	}
}
