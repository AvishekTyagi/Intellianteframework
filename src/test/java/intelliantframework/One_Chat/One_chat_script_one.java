package intelliantframework.One_Chat;


import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import ManageDriver.Drivers;
import Utility.Retry;
import intelliantframework.pageobjects.ChatObjects;


public class One_chat_script_one extends Drivers {
 
	@Test (retryAnalyzer=Retry.class)
	public void one_chat() throws IOException
	{	   
	 	
	  goto_one_chat();
	  ChatObjects Go_At =new ChatObjects(driver, act , stop);
	  Go_At.Score_test.click();
	  Go_At.Charlene_Atkins.click();
	  stop.until(ExpectedConditions.elementToBeClickable(Go_At.Send));
	  Go_At.Send.click();
	  
	  Go_At.click_Thanks_What_seems_to_be_the_problem();
	  Go_At.Send.click();
			
	  Go_At.click_Can_you_give_me_a_more_specific_reeson();
	  Go_At.Send.click();
			
	  Go_At.click_Are_you_sure_there_is_nothing_wrong_at_all_with_the_product();
	  Go_At.Send.click();
			 
	  Go_At.I_m_Sorry_we_try_to_make_returns_east_I_want_to.click();
	  Go_At.Send.click();
			
	  pause(2);
	  
	  Go_At.Search_in_knowledge_management("Return process");		
	  
	  Go_At.click_Thank_you_for_your_patience_You_can_return_the_item_for_any_reason_within_90_days_of_purchase();
	  Go_At.Send.click();		
	  
	  Go_At.click_I_need_your_permission_to_assess_your_account_your_order_number_and_email_address_I_will_email_you_everything_you_need();
      Go_At.Send.click();		
			
      Go_At.Enter_order_no("5846301978");
			
	  Go_At.click_The_email_I_just_sent_provides_detailed_instructins_on_how_to_package_and_ship_your_return_item();
	  Go_At.Send.click();
	  
	  Go_At.click_It_is_so_easy_The_refund_will_be_processed_3_days_after_we_receive_the_item();
	  Go_At.Send.click();
	  
	  Go_At.So_the_sooner_you_send_the_item_back_the_sooner_you_will_get_your_refund.click();
	  Go_At.Send.click();	
	  
	  Go_At.click_Of_course_Can_I_help_you_with_anything_else_today();
	  Go_At.Send.click();	
			
	  Go_At.Of_course_Have_a_good_day_Charlene.click();
	  Go_At.Send.click();
	  	
					

	}

}
