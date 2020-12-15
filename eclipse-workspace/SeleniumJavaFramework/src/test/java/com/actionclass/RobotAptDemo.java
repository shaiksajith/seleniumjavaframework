package com.actionclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class RobotAptDemo {//using robot class we can control the key board actions
	
	
	
	@Test
public void validateMouseFun() throws AWTException {
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_TAB);//it clicks tav
	robot.keyPress(KeyEvent.VK_DOWN);//it clicks down arrow
	robot.keyPress(KeyEvent.VK_ENTER);//it clicks enter
	
	
}
}
