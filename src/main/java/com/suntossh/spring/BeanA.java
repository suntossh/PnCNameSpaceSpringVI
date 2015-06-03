package com.suntossh.spring;

public class BeanA {

	private BeanB beanB;
	
	private int intValueA;
	
	public BeanA() {
		System.out.println("Bean A Constructor");
	}

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public int getIntValueA() {
		return intValueA;
	}

	public void setIntValueA(int intValueA) {
		this.intValueA = intValueA;
	}


	
}
