package com.summer.app.ioc;

public class RobotMain {

	public static void main(String[] args) {
		
		Robot robot = new Robot();
		robot.getLeftArm().act();
		
	}
	
}
