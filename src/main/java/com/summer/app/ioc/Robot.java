package com.summer.app.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Robot {
		//팔 , 왼쪽 ,오른쪽
	
	@Autowired
	private LeftArm leftArm;
	@Autowired
	private RightArm rightArm;
		
	    //다리 생성자
		
	public Robot() {
		//this.leftArm = new LeftArm();
		//this.rightArm = new RightArm();	
	}
	public Robot(LeftArm leftArm,RightArm rightArm) {
		this.leftArm = leftArm;
		this.rightArm = rightArm;
	}
	
	
	
	
	
	
	public LeftArm getLeftArm() {
		return leftArm;
	}
	public void setLeftArm(LeftArm leftArm) {
		this.leftArm = leftArm;
	}
	public RightArm getRightArm() {
		return rightArm;
	}
	public void setRightArm(RightArm rightArm) {
		this.rightArm = rightArm;
	}
	
	
	
	
}
