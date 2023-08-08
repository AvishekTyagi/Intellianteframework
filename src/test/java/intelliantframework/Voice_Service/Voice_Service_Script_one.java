package intelliantframework.Voice_Service;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import ManageDriver.Drivers;
import Utility.Retry;
import intelliantframework.pageobjects.VoiceServiceObjects;


public class Voice_Service_Script_one extends Drivers{
    @Test (retryAnalyzer=Retry.class)
	public void Voice_one()
	{
		goto_VoiceService();
		VoiceServiceObjects Go_At= new VoiceServiceObjects(driver, act, stop);
		
		Go_At.Scored_button.click();
		Go_At.Begin_button.click();
		Go_At.Select_Voice_1.click();
		Go_At.Start_button.click();
		Go_At.Answer_button.click();
		
	    Go_At.Best_it_can_take_long_time_worst_Our_call_volume_is_very_high_today();
	    pause(1);
	    Go_At.Send.click();
		
		Go_At.Enter_account_details("9074051");
		
		Go_At.select_Thank_you_Ms_Wang_Please_let_me_review_your_bill();
		pause(1);
		Go_At.Send.click();
		
	    Go_At.Account_Billing_button.click();
		Go_At.Best_You_are_currently_on_a_two_year_contract_worst_last_three_bills_after_the_due_date();
		pause(1);
		Go_At.Send.click();
		
        Go_At.Select_Please_hold_while_I_look_up_refunds_on_late_payments_in_knowledge_management();
        pause(1);
        Go_At.Send.click();
        
        Go_At.Search_in_knowledge_management("Refund a late payment");
        
        Go_At.Good_news_I_can_refund_the_fee.click();
        stop.until(ExpectedConditions.elementToBeClickable(Go_At.Send));
        Go_At.Send.click();
		
        Go_At.Account_Billing_button.click();
		Go_At.Select_Best_I_do_not_have_that_information_available_worst_The_confirmation_number_of_your_last_payment_was_SDFFG3252();
		pause(1);
		Go_At.Send.click();
		
		Go_At.I_am_unable_to_help_you_with_autopay_today.click();
		pause(1);
		Go_At.Send.click();  
		
		Go_At.Select_Best_Can_I_help_you_with_anything_else_today_Worst_Thank_you_Have_a_wonderful_day();
		pause(1);
		Go_At.Send.click();
		
		
		
  
	}

}
