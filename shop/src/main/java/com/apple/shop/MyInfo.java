package com.apple.shop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyInfo {
	private String name;
	private int age;
	
	public void plusAge() {
		this.age = this.age + 1;
	}
}

