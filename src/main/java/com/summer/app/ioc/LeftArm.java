package com.summer.app.ioc;

import org.springframework.stereotype.Component;

@Component
public class LeftArm extends Arm {

	public void act() {
		System.out.println("왼쪽팔");
	}
	
}
