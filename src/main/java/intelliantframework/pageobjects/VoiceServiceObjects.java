package intelliantframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class VoiceServiceObjects 
{
	 WebDriver driver;
	 Actions act;
	 WebDriverWait stop;
		public VoiceServiceObjects(WebDriver driver, Actions act,  WebDriverWait stop) {
			this.driver=driver;
			this.act=act;
			this.stop=stop;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(css=".col-md-3:nth-child(4) .background-icon")
		public WebElement Scored_button;
		
		@FindBy(xpath="//button[text()='Begin']")
		public WebElement Begin_button;
		
		@FindBy(xpath="//img[@alt='Voice 1']")
		public WebElement Select_Voice_1;
		
		@FindBy(xpath="//button[text()='Start']")
		public WebElement Start_button;
		
		@FindBy(css=".btn-text")
		public WebElement Answer_button;
		
		@FindBy(css=".send-btn")
		public WebElement Send;
		
		@FindBy(xpath="//span[text()='Scroll for more options']")
	    public WebElement Scroll;
		
		@FindBy(xpath="//input[@id='S01.L01.QN01.QC3Response1']")
		WebElement Best_reply_It_can_take_a_long_time_to_reach_the_right_department;
		
		@FindBy(xpath="//input[@id='S01.L01.QN01.QC3Response2']")
		WebElement Worst_reply_It_can_take_a_long_time_to_reach_the_right_department;
		
		@FindBy(xpath="//input[@id='S01.L01.QN01.QC1Response1']")
		WebElement Best_reply_Our_call_volume_is_very_high_today;
		
		@FindBy(xpath="//input[@id='S01.L01.QN01.QC1Response2']")
		WebElement Worst_reply_Our_call_volume_is_very_high_today;
		
		@FindBy(css="input:nth-child(1)")
		WebElement Account_no_input;
		
		@FindBy(xpath="//a[text()='Knowledge Management']")
		public WebElement Knowledge_Management;
		
		@FindBy(xpath="//input[@id='search-input']")
		public WebElement Input;
		
		@FindBy(xpath="//button[@type='submit']//*[name()='svg']")
		public WebElement Search;
		
		@FindBy(css=".ps-2")
		WebElement Search_button;
		
		@FindBy(xpath="//input[@id='S03.L01.QN02.QC2Response1']")
		WebElement Thank_you_Ms_Wang_Please_let_me_review_your_bill;
		
		@FindBy(xpath="//input[@id='S05.L06.QN04.QC5Response1']")
		WebElement Best_reply_Thank_you_for_the_short_hold_You_are_currently_on_a_two_year_contract;
		

		@FindBy(xpath="//input[@id='S05.L06.QN04.QC5Response2']")
		WebElement Worst_reply_Thank_you_for_the_short_hold_You_are_currently_on_a_two_year_contract;
		
		
		@FindBy(xpath="//input[@id='S05.L06.QN04.QC2Response1']")
		WebElement Best_reply_Thank_you_for_the_short_hold_You_have_paid_your_last_three_bills_after_the_due_date;
		
		
		@FindBy(xpath="//input[@id='S05.L06.QN04.QC2Response2']")
		WebElement Worst_reply_Thank_you_for_the_short_hold_You_have_paid_your_last_three_bills_after_the_due_date;
		
		@FindBy(xpath="//input[@id='S06.L03.QN05.QC5Response1']")
		public WebElement Please_hold_while_I_look_up_refunds_on_late_payments_in_knowledge_management;
		
		@FindBy(xpath="//input[@id='S08.L01.QN06.QC2Response1']")
		public WebElement Good_news_I_can_refund_the_fee;
		
		@FindBy(xpath="//input[@id='S11.L03.QN07.QC5Response1']")
		WebElement Best_reply_I_do_not_have_that_information_available;
		
		@FindBy(xpath="//input[@id='S11.L03.QN07.QC5Response2']")
		WebElement Worst_reply_I_do_not_have_that_information_available;
		
		@FindBy(xpath="//input[@id='S11.L03.QN07.QC3Response1']")
		WebElement Best_reply_The_confirmation_number_of_your_last_payment_was_SDFFG3252;
		
		@FindBy(xpath="//input[@id='S11.L03.QN07.QC3Response2']")
		WebElement Worst_reply_The_confirmation_number_of_your_last_payment_was_SDFFG3252;
		
		@FindBy(xpath="//input[@id='S12.L02.QN08.QC2Response1']")
		public WebElement I_am_unable_to_help_you_with_autopay_today;
		
		@FindBy(xpath="//input[@id='S15.L02.QN10.QC1Response1']")
		WebElement Best_reply_Can_I_help_you_with_anything_else_today;
		
		@FindBy(xpath="//input[@id='S15.L02.QN10.QC1Response2']")
		WebElement Worst_reply_Can_I_help_you_with_anything_else_today;
		
		@FindBy(xpath="//input[@id='S15.L02.QN10.QC4Response1']")
		WebElement Best_reply_Thank_you_Have_a_wonderful_day;
		
		@FindBy(xpath="//input[@id='S15.L02.QN10.QC4Response2']")
		WebElement Worst_reply_Thank_you_Have_a_wonderful_day;
		
		@FindBy(xpath="//a[text()='Account Billing']")
		public WebElement Account_Billing_button;
		
		
		
		public void Best_it_can_take_long_time_worst_Our_call_volume_is_very_high_today()
		{
			Scroll.click();
			act.moveToElement(Best_reply_It_can_take_a_long_time_to_reach_the_right_department).build().perform();
            Best_reply_It_can_take_a_long_time_to_reach_the_right_department.click();
			try 
		    {
			  act.moveToElement(Worst_reply_Our_call_volume_is_very_high_today).build().perform();
			  Worst_reply_Our_call_volume_is_very_high_today.click();
			  
		    }
		    catch (Exception e)
		     {	
			  Scroll.click();
			  act.moveToElement(Worst_reply_Our_call_volume_is_very_high_today).build().perform();
			  Worst_reply_Our_call_volume_is_very_high_today.click();
			  
		      }
		    
			}
		
		public void Enter_account_details(String account_no)
		{
			    stop.until(ExpectedConditions.elementToBeClickable(Account_no_input));
				Account_no_input.click();
				Account_no_input.sendKeys(account_no);
				Search_button.click();
		}
		
		
		
		public void select_Thank_you_Ms_Wang_Please_let_me_review_your_bill()
		{
			Thank_you_Ms_Wang_Please_let_me_review_your_bill.click();
			stop.until(ExpectedConditions.elementToBeClickable((Send)));
			
		}
		
		public void Best_You_are_currently_on_a_two_year_contract_worst_last_three_bills_after_the_due_date()
		{
			Scroll.click();
			act.moveToElement(Best_reply_Thank_you_for_the_short_hold_You_are_currently_on_a_two_year_contract).build().perform();
			Best_reply_Thank_you_for_the_short_hold_You_are_currently_on_a_two_year_contract.click();
			try 
		    {
			  act.moveToElement(Worst_reply_Thank_you_for_the_short_hold_You_have_paid_your_last_three_bills_after_the_due_date).build().perform();
			  Worst_reply_Thank_you_for_the_short_hold_You_have_paid_your_last_three_bills_after_the_due_date.click();
		    }
		    catch (Exception e)
		     {
			  Scroll.click();
			  act.moveToElement(Worst_reply_Thank_you_for_the_short_hold_You_have_paid_your_last_three_bills_after_the_due_date).build().perform();
			  Worst_reply_Thank_you_for_the_short_hold_You_have_paid_your_last_three_bills_after_the_due_date.click();
		      }
		    
			}
		public void Select_Please_hold_while_I_look_up_refunds_on_late_payments_in_knowledge_management()
		{
			Scroll.click();
			act.moveToElement(Please_hold_while_I_look_up_refunds_on_late_payments_in_knowledge_management).build().perform();
			Please_hold_while_I_look_up_refunds_on_late_payments_in_knowledge_management.click();
		}
		
		public void Select_Best_I_do_not_have_that_information_available_worst_The_confirmation_number_of_your_last_payment_was_SDFFG3252()
		{
			Scroll.click();
			act.moveToElement(Best_reply_I_do_not_have_that_information_available).build().perform();
			Best_reply_I_do_not_have_that_information_available.click();
			try 
		    {
			  act.moveToElement(Worst_reply_The_confirmation_number_of_your_last_payment_was_SDFFG3252).build().perform();
			  Worst_reply_The_confirmation_number_of_your_last_payment_was_SDFFG3252.click();
		    }
		    catch (Exception e)
		     {
			  Scroll.click();
			  act.moveToElement(Worst_reply_The_confirmation_number_of_your_last_payment_was_SDFFG3252).build().perform();
			  Worst_reply_The_confirmation_number_of_your_last_payment_was_SDFFG3252.click();
		      }
		
		  } 
		
	    public void Select_Best_Can_I_help_you_with_anything_else_today_Worst_Thank_you_Have_a_wonderful_day()
		{
			Scroll.click();
			act.moveToElement(Best_reply_Can_I_help_you_with_anything_else_today).build().perform();
			Best_reply_Can_I_help_you_with_anything_else_today.click();
			try 
		    {
			  act.moveToElement(Worst_reply_Thank_you_Have_a_wonderful_day).build().perform();
			  Worst_reply_Thank_you_Have_a_wonderful_day.click();
		    }
		    catch (Exception e)
		     {
			  Scroll.click();
			  act.moveToElement(Worst_reply_Thank_you_Have_a_wonderful_day).build().perform();
			  Worst_reply_Thank_you_Have_a_wonderful_day.click();
		      }
		
		  } 
	    
	    public void Search_in_knowledge_management(String search)
	    {
	    	
	    	Knowledge_Management.click();
	    	stop.until(ExpectedConditions.elementToBeClickable(Input));
	    	Input.sendKeys(search);
	    	Search.click();
	    	
	    }
		
		
		
		
}

