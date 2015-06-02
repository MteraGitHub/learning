package org.springframework.samples.mvc.views;

import javax.validation.constraints.NotNull;

public class JavaBean {
	
	@NotNull
	private String foo;

	@NotNull
	private String fruit;

	private String test2;
	
	public String getTest2() {
		return test2;
	}

	public void setTest2(String test2) {
		this.test2 = test2;
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
