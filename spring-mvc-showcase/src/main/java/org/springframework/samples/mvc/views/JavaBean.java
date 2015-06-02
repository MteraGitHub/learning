package org.springframework.samples.mvc.views;

import javax.validation.constraints.NotNull;

public class JavaBean {
	
	@NotNull
	private String foo;

	@NotNull
	private String fruit;

	private String test1;
	
	public String getTest1() {
		return test1;
	}

	public void setTest1(String test1) {
		this.test1 = test1;
	}

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

}
