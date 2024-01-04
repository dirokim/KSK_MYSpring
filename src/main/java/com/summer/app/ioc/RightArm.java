package com.summer.app.ioc;

import org.springframework.stereotype.Component;

@Component
public class RightArm extends Arm{

	public void act() {
		System.out.println("오른팔");
		
	}
}
