package intelliantframework.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ChatObjects {
 WebDriver driver;
 Actions act;
 WebDriverWait stop;
	public ChatObjects(WebDriver driver, Actions act, WebDriverWait stop) {
		this.driver=driver;
		this.act=act;
		this.stop=stop;
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(css=".col-md-3:nth-child(4) .background-icon") 
    public WebElement Score_test;
	
    
    @FindBy(xpath="(//img[contains(@alt,'Charlene Atkins')])[2]")
    public WebElement Charlene_Atkins;
    
    @FindBy(xpath="(//img[contains(@alt,'Mohammed Akter')])[2]")
    public WebElement Mohammed_Akter;
    
    @FindBy(css=".send-btn") 
    public WebElement Send;
    
    @FindBy(xpath="//span[text()='Scroll for more options']")
    public WebElement Scroll;
    
    @FindBy(xpath="//p[text()='Thanks. What seems to be the problem?']")
     WebElement Thanks_What_seems_to_be_the_problem;
    
    @FindBy(xpath="//p[text()='Can you give me a more specific reeson?']")
     WebElement Can_you_give_me_a_more_specific_reeson;
    
    @FindBy(xpath="//p[text()='Are you sure there is nothing wrong at all with the product?']")
     WebElement Are_you_sure_there_is_nothing_wrong_at_all_with_the_product;
    
    @FindBy(xpath="(//p[contains(text(),\"I'm sorry. We try to make returns easy. I want to \")])[1]")
    public WebElement I_m_Sorry_we_try_to_make_returns_east_I_want_to;
    
    @FindBy(xpath="//a[text()='Knowledge Management']")
    public WebElement Knowledge_Management;
    
    @FindBy(xpath="//input[@id='search-input']")
    public WebElement Input;
    
    @FindBy(xpath="//button[@type='submit']//*[name()='svg']")
    public WebElement Search;
    
    @FindBy(xpath="//p[text()='Back to Chat']")
    public WebElement Back_button;
    
    @FindBy(xpath="//p[text()='Thank you for your patience. You can return the item for any reason within 90 days of purchase.']")
     WebElement Thank_you_for_your_patience_You_can_return_the_item_for_any_reason_within_90_days_of_purchase;
	
    @FindBy(xpath="//p[text()='I need your permission to assess your account, your order number, and email address. I will email you everything you need.']")
    WebElement I_need_your_permission_to_assess_your_account_your_order_number_and_email_address_I_will_email_you_everything_you_need;

    @FindBy(xpath="//a[text()='Account']")
    public WebElement Account;
    
    @FindBy(xpath="//input[@aria-label='Please enter OTP character 1']")
    public WebElement input_otp;
    
    @FindBy(xpath="//button[text()='Send']")
    public WebElement Send_button;
    
    @FindBy(xpath="//p[text()='The email I just sent provides detailed instructins on how to package and ship your return item.']")
    WebElement The_email_I_just_sent_provides_detailed_instructins_on_how_to_package_and_ship_your_return_item;
    
    @FindBy(xpath="//p[text()='It is so easy! The refund will be processed 3 days after we receive the item.']")
    WebElement It_is_so_easy_The_refund_will_be_processed_3_days_after_we_receive_the_item;
    
    @FindBy(xpath="//p[text()='So the sooner you send the item back, the sooner you will get your refund.']")
    public WebElement So_the_sooner_you_send_the_item_back_the_sooner_you_will_get_your_refund;
    
    @FindBy(xpath="//p[text()='Of course! Can I help you with anything else today?']")
    WebElement Of_course_Can_I_help_you_with_anything_else_today;
    
    @FindBy(xpath="//p[text()='Of course. Have a good day Charlene!']")
    public WebElement Of_course_Have_a_good_day_Charlene;
    
    @FindBy(xpath="//p[text()='Hi. How can I help you, Mohamed?']")
    WebElement Hi_How_can_I_help_you_Mohamed;
    
    @FindBy(xpath="//p[text()='May I have your permission to access your account to assist you today?']")
    WebElement May_I_have_your_permission_to_access_your_account_to_assist_you_today;
    
    @FindBy(xpath="//p[contains(text(),'Perfect.')]")
    WebElement perfect;
    
    @FindBy(xpath="//a[text()='Subscription']")
    public WebElement Subscription; 
    
    @FindBy(xpath="//p[text()='Your on Tier 2. Tier 3 has unlimited data and 24/7 voice support for $7 more a month.']")
    WebElement Your_on_Tier_2_Tier_3_has_unlimited_data_and_24_7_voice_support_for_$7_more_a_month;
    
    @FindBy(xpath="//p[text()='Your plan has 50GB of data.']")
    WebElement Your_plan_has_50GB_of_data;
    
    @FindBy(xpath="//p[text()='The difference is only $7 a month with Tier C.']")
    WebElement The_difference_is_only_$7_a_month_with_Tier_C;
    
    @FindBy(xpath="//p[contains(text(),'It doesn')]")
    WebElement It_does_not;
    
    @FindBy(xpath="//p[normalize-space()='Thanks for your loyalty to Moxymo. Have a great day.']")
    WebElement Thanks_for_your_loyalty_to_Moxymo_Have_a_great_day;
    
    
    public void click_Thanks_What_seems_to_be_the_problem()
    {
      Scroll.click();
  	  if(Thanks_What_seems_to_be_the_problem.isDisplayed())
  	  {
  		Thanks_What_seems_to_be_the_problem.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(Thanks_What_seems_to_be_the_problem).build().perform(); 
  	  Thanks_What_seems_to_be_the_problem.click();  
  	  }
    }
    
    public void click_Can_you_give_me_a_more_specific_reeson()
    {
      Scroll.click();
  	  if(Can_you_give_me_a_more_specific_reeson.isDisplayed())
  	  {
  		Can_you_give_me_a_more_specific_reeson.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(Can_you_give_me_a_more_specific_reeson).build().perform(); 
  	  Can_you_give_me_a_more_specific_reeson.click();  
  	  }
    }
    
    public void click_Are_you_sure_there_is_nothing_wrong_at_all_with_the_product()
    {
      Scroll.click();
  	 
  	  if(Are_you_sure_there_is_nothing_wrong_at_all_with_the_product.isDisplayed())
  	  {
  		Are_you_sure_there_is_nothing_wrong_at_all_with_the_product.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(Are_you_sure_there_is_nothing_wrong_at_all_with_the_product).build().perform(); 
  	  Are_you_sure_there_is_nothing_wrong_at_all_with_the_product.click();  
  	  }
    }
    
    public void click_Thank_you_for_your_patience_You_can_return_the_item_for_any_reason_within_90_days_of_purchase()
    {
      Scroll.click();
  	  if(Thank_you_for_your_patience_You_can_return_the_item_for_any_reason_within_90_days_of_purchase.isDisplayed())
  	  {
  		Thank_you_for_your_patience_You_can_return_the_item_for_any_reason_within_90_days_of_purchase.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(Thank_you_for_your_patience_You_can_return_the_item_for_any_reason_within_90_days_of_purchase).build().perform(); 
    	Thank_you_for_your_patience_You_can_return_the_item_for_any_reason_within_90_days_of_purchase.click();  
  	  }
    }
    
    public void click_I_need_your_permission_to_assess_your_account_your_order_number_and_email_address_I_will_email_you_everything_you_need()
    {
      Scroll.click();
  	 if(I_need_your_permission_to_assess_your_account_your_order_number_and_email_address_I_will_email_you_everything_you_need.isDisplayed())
  	  {
  		I_need_your_permission_to_assess_your_account_your_order_number_and_email_address_I_will_email_you_everything_you_need.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(I_need_your_permission_to_assess_your_account_your_order_number_and_email_address_I_will_email_you_everything_you_need).build().perform(); 
  	  I_need_your_permission_to_assess_your_account_your_order_number_and_email_address_I_will_email_you_everything_you_need.click();  
  	  }
    }
    
    public void click_The_email_I_just_sent_provides_detailed_instructins_on_how_to_package_and_ship_your_return_item()
    {
      Scroll.click();
  	  if(The_email_I_just_sent_provides_detailed_instructins_on_how_to_package_and_ship_your_return_item.isDisplayed())
  	  {
  		The_email_I_just_sent_provides_detailed_instructins_on_how_to_package_and_ship_your_return_item.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(The_email_I_just_sent_provides_detailed_instructins_on_how_to_package_and_ship_your_return_item).build().perform(); 
  	The_email_I_just_sent_provides_detailed_instructins_on_how_to_package_and_ship_your_return_item.click();  
  	  }
    }
    
    public void click_It_is_so_easy_The_refund_will_be_processed_3_days_after_we_receive_the_item()
    {
    	Scroll.click();    	  
    	  if(It_is_so_easy_The_refund_will_be_processed_3_days_after_we_receive_the_item.isDisplayed())
    	  {
    		  It_is_so_easy_The_refund_will_be_processed_3_days_after_we_receive_the_item.click();  
    	  }
    	  else
    	  {
    	  act.moveToElement(It_is_so_easy_The_refund_will_be_processed_3_days_after_we_receive_the_item).build().perform(); 
    	  It_is_so_easy_The_refund_will_be_processed_3_days_after_we_receive_the_item.click();  
    	  }
    }
    public void click_Of_course_Can_I_help_you_with_anything_else_today()
    {
    	Scroll.click();    	 
    	  if( Of_course_Can_I_help_you_with_anything_else_today.isDisplayed())
    	  {
    		  Of_course_Can_I_help_you_with_anything_else_today.click();  
    	  }
    	  else
    	  {
    	  act.moveToElement(Of_course_Can_I_help_you_with_anything_else_today).build().perform(); 
    	  Of_course_Can_I_help_you_with_anything_else_today.click();  
    	  }
    }
    public void click_Hi_How_can_I_help_you_Mohamed()
    {
    	Scroll.click();	  
  	  if(Hi_How_can_I_help_you_Mohamed.isDisplayed())
  	  {
  		Hi_How_can_I_help_you_Mohamed.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(Hi_How_can_I_help_you_Mohamed).build().perform(); 
  	  Hi_How_can_I_help_you_Mohamed.click();  
  	  }
    }
    
    public void click_May_I_have_your_permission_to_access_your_account_to_assist_you_today()
    {
    	Scroll.click();
    	  if(May_I_have_your_permission_to_access_your_account_to_assist_you_today.isDisplayed())
    	  {
    		  May_I_have_your_permission_to_access_your_account_to_assist_you_today.click();  
    	  }
    	  else
    	  {
    	  act.moveToElement(May_I_have_your_permission_to_access_your_account_to_assist_you_today).build().perform(); 
    	  May_I_have_your_permission_to_access_your_account_to_assist_you_today.click();  
    	  }
    }
    public void click_perfect()
    {
    	Scroll.click();   	  
    	  if(perfect.isDisplayed())
    	  {
    		  perfect.click();  
    	  }
    	  else
    	  {
    	  act.moveToElement(perfect).build().perform(); 
    	  perfect.click();  
    	  }
    }
    
    public void click_Your_on_Tier_2_Tier_3_has_unlimited_data_and_24_7_voice_support_for_$7_more_a_month()
    {
    	Scroll.click(); 	 
  	  if(Your_on_Tier_2_Tier_3_has_unlimited_data_and_24_7_voice_support_for_$7_more_a_month.isDisplayed())
  	  {
  		Your_on_Tier_2_Tier_3_has_unlimited_data_and_24_7_voice_support_for_$7_more_a_month.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(Your_on_Tier_2_Tier_3_has_unlimited_data_and_24_7_voice_support_for_$7_more_a_month).build().perform(); 
  	  Your_on_Tier_2_Tier_3_has_unlimited_data_and_24_7_voice_support_for_$7_more_a_month.click();  
  	  }
    }
    public void click_Your_plan_has_50GB_of_data()
    {
    	Scroll.click();
  	  if(Your_plan_has_50GB_of_data.isDisplayed())
  	  {
  		Your_plan_has_50GB_of_data.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(Your_plan_has_50GB_of_data).build().perform(); 
  	  Your_plan_has_50GB_of_data.click();  
  	  }
    }  
    public void click_The_difference_is_only_$7_a_month_with_Tier_C()
    {
    	Scroll.click(); 	  
  	  if(The_difference_is_only_$7_a_month_with_Tier_C.isDisplayed())
  	  {
  		The_difference_is_only_$7_a_month_with_Tier_C.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(The_difference_is_only_$7_a_month_with_Tier_C).build().perform(); 
  	The_difference_is_only_$7_a_month_with_Tier_C.click();  
  	  }
    }
    public void click_It_does_not()
    {
    	Scroll.click(); 	  
  	  if(It_does_not.isDisplayed())
  	  {
  		It_does_not.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(It_does_not).build().perform(); 
     	It_does_not.click();  
  	  }
    }
    public void click_Thanks_for_your_loyalty_to_Moxymo_Have_a_great_day()
    {
    	Scroll.click(); 	  
  	  if(Thanks_for_your_loyalty_to_Moxymo_Have_a_great_day.isDisplayed())
  	  {
  		Thanks_for_your_loyalty_to_Moxymo_Have_a_great_day.click();  
  	  }
  	  else
  	  {
  	  act.moveToElement(Thanks_for_your_loyalty_to_Moxymo_Have_a_great_day).build().perform(); 
     	Thanks_for_your_loyalty_to_Moxymo_Have_a_great_day.click();  
  	  }
    }
    
    public void Search_in_knowledge_management(String search)
    {
    	Knowledge_Management.click();
    	Input.sendKeys(search);
    	Search.click();
    	Back_button.click();
    }
    public void Enter_order_no(String number)
    {
     Account.click();
     stop.until(ExpectedConditions.elementToBeClickable(input_otp));
	 input_otp.sendKeys(number);
   	 Search.click();
   	 Send_button.click();
   	 Back_button.click();
    }
    public void Enter_account_no(String number)
    {
     stop.until(ExpectedConditions.elementToBeClickable(input_otp));
	 input_otp.sendKeys(number);
   	 Search.click();
   	 Back_button.click();
    }
    
}

