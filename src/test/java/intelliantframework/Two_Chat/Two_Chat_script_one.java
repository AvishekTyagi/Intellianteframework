package intelliantframework.Two_Chat;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import ManageDriver.Drivers;
import Utility.Retry;
import intelliantframework.pageobjects.ChatObjects;


public class Two_Chat_script_one extends Drivers {

	@Test (retryAnalyzer=Retry.class)
	public void Two_chat() throws IOException
	{
		  goto_two_chat();
		  ChatObjects Go_At =new ChatObjects(driver,act,stop);
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
// 2nd chat starts from here		  		
			 
		  Go_At.Mohammed_Akter.click();
		  stop.until(ExpectedConditions.elementToBeClickable(Go_At.Send));
		  Go_At.Send.click();
			
		  Go_At.click_Hi_How_can_I_help_you_Mohamed();
		  Go_At.Send.click();
		  
		  Go_At.Enter_account_no("778592821");
				
		  Go_At.click_May_I_have_your_permission_to_access_your_account_to_assist_you_today();
		  Go_At.Send.click();
		  
	      Go_At.click_perfect();	  
		  Go_At.Send.click();
			
		  pause(2);
		  Go_At.Subscription.click();
		  Go_At.Back_button.click();
			
		  Go_At.click_Your_on_Tier_2_Tier_3_has_unlimited_data_and_24_7_voice_support_for_$7_more_a_month();
		  Go_At.Send.click();
			
		  Go_At.click_Your_plan_has_50GB_of_data();	
		  Go_At.Send.click();
			
		  Go_At.click_The_difference_is_only_$7_a_month_with_Tier_C();
		  Go_At.Send.click();
			
		  Go_At.click_It_does_not();
		  Go_At.Send.click();
			 
		  Go_At.click_Thanks_for_your_loyalty_to_Moxymo_Have_a_great_day();
		  Go_At.Send.click();
			  

	}

}

