package intelliantframework.Typing;


import org.testng.annotations.Test;

import ManageDriver.Drivers;
import Utility.Retry;
import intelliantframework.pageobjects.TypingObjects;



public class Typing_Script_one extends Drivers   {
    @Test (retryAnalyzer=Retry.class)
    public void Typing_test_one()
	{
    	goto_typing();
    	TypingObjects gotoo=new TypingObjects(driver, act);
        gotoo.Score_button.click();
        gotoo.continue_button.click();
       
        gotoo.type("23445-64-6*694","133.56/34+989-","7-424.32/56430","2345.43*21+324");
        
     
    }
}
