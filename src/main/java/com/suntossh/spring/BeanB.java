package com.suntossh.spring;

public class BeanB {

	private int intValueB;
	
	public BeanB(int intValB) {
		System.out.println("Bean B Constructor");
		this.intValueB = intValB;
	}
	
	public void execute(){
		System.out.println("Execute method in BeanB");
		System.out.println("Value of intValue is :"+this.intValueB);
	}
}
