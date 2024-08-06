package POM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePagePOM {

	WebDriver driver;

	public HomePagePOM(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='amity-logo']")   //Amity Logo
	WebElement amitylogoElement;

	@FindBy(xpath = "//span[@class='mr-1 uppercase laptop:font-medium headFootSprite serviceMenu pr-5 header_menuText__KlhzO flex gap-1 items-center']") //ProgramButton
	WebElement programButtonElement;

	@FindBy(xpath = "//span[@class='mr-1 uppercase laptop:font-medium header_menuText__KlhzO'][normalize-space()='CAREER SERVICES']") //Career Services
	WebElement careerServicesButttonElement;

	@FindBy(xpath = "//span[@class='mr-1 uppercase laptop:font-medium header_menuText__KlhzO'][normalize-space()='ADVANTAGES']") //Advantages
	WebElement advanragesButtonElement;

	@FindBy(xpath = "//div[@class='header_searchIcon__bLdgL header_searchIconNew__5aGyK headFootSprite']") //SearechButton
	WebElement SearchButtonElement;

	@FindBy(xpath = "//span[@class='font-bold mr-0']")  //Call us
	WebElement callUsElement;

	@FindBy(xpath = "//button[contains(@class,'button_root__RRK9v header_mr__77w6i header_studentLogin__AsDQf headFootSprite button_w__W8vEM button_o__u2jyu')]//span[contains(@class,'uppercase font-raleway')][normalize-space()='STUDENT LOGIN']") //Student login
	WebElement StudentLoginElement;

	@FindBy(xpath = "//a[contains(@class,'button_root__RRK9v header_mr__77w6i button_y__dAepQ')]//span[contains(@class,'uppercase font-raleway')][normalize-space()='ENROLL NOW']")  //Enroll Now
	WebElement enrollNowButtonElement;

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']//div[@class='HeroCarousel_HearoCarousel__gradient__oBG4Y']//div[@class='HeroCarousel_HearoCarousel__content__0LDqL']//div//span[@class='uppercase font-raleway'][normalize-space()='Apply Now']")  //Apply Now
	WebElement applyNoWebElement;

	@FindBy(xpath = "//img[@alt='call-button']")  //Callicon
	WebElement CalliconElement;

	@FindBy(xpath = "//img[@alt='whatsapp-link']")  //Whatsapp
	WebElement whatsappIconElement;

	@FindBy(xpath = "//div[@class='styles_ctaBtn__BqEmG']//a[@class='button_root__RRK9v button_b__2Obj5 button_o__u2jyu']")  //ViewAll
	WebElement viewAllElement;

	@FindBy(xpath = "//button[@class='button_root__RRK9v BannerCard_ctaBtn__FMctQ button_w__W8vEM button_o__u2jyu']")  //Request a call
	WebElement requestaCallElement;

	@FindBy(xpath = "//a[@href='/news']//span[@class='uppercase font-raleway'][normalize-space()='View all']")  //View all Stay
	WebElement viewallStayElement;

	@FindBy(xpath = "//a[@href='/blog']//span[@class='uppercase font-raleway'][normalize-space()='View all']")  //View all blog
	WebElement viewallBlogElement;


	@FindBy(xpath = "//span[normalize-space()='KNOW MORE']")  // Know more element
	WebElement knowMorElement;

	@FindBy(xpath = "//a[@class='button_root__RRK9v BannerCard_ctaBtn__FMctQ button_y__dAepQ']//span[@class='uppercase font-raleway'][normalize-space()='Apply Now']")  // Apply Now CTA
	WebElement apllyNowCTAlElement;

	@FindBy(xpath = "//span[normalize-space()='show more']")  // show more element
	WebElement showMorElement;

	@FindBy(xpath = "//a[normalize-space()='About us']")  // About us
	WebElement aboutusElement;

	@FindBy(xpath = "//a[normalize-space()='Career services']")  // Career Services
	WebElement careerServicesElement;

	@FindBy(xpath = "//a[normalize-space()='Student stories']")  // Student Stories 
	WebElement Studentstories;

	@FindBy(xpath = "//a[normalize-space()='Leadership']")  // Leadership 
	WebElement leadershipelement;

	@FindBy(xpath = "//a[normalize-space()='Corporate']")  // Corporate 
	WebElement corporate;

	@FindBy(xpath = "//a[normalize-space()='Contact us']")  // Contact-us 
	WebElement contactus;

	@FindBy(xpath = "//a[normalize-space()='T & C']")  // T&C 
	WebElement terms;

	@FindBy(xpath = "//a[normalize-space()='Student support']")  // Student Support 
	WebElement studentSupportElement;

	@FindBy(xpath = "//a[normalize-space()='Intellectual Properties']")  // Intellectual property 
	WebElement Intellectualproperty;

	@FindBy(xpath = "//a[normalize-space()='UGC Approvals']")  // UGC Approvals
	WebElement UGC;

	@FindBy(xpath = "//a[normalize-space()='Resources']")  // Resources
	WebElement resources;

	@FindBy(xpath = "//a[normalize-space()='Blog']")  // Blog
	WebElement Blog;

	@FindBy(xpath = "//a[normalize-space()='Media']")  // Media
	WebElement media;

	//////////--------------------------UG Programs------------------------------------//////////////////////////////////////////////////

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Computer Applications']")  // Bachelor of Computer Applications
	WebElement BCAprogram;

	@FindBy(xpath = "//a[normalize-space()='BCA with specialization in Cloud & Security']")  // BCA with specialization in Cloud & Security
	WebElement BCASpec;

	@FindBy(xpath = "//a[normalize-space()='BCA with specialization in Data Analytics']")  // BCA with specialization in Data Analytics
	WebElement BCAdataAnalytics;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Business Administration']")  // Bachelor of Business Administration
	WebElement BBA;

	@FindBy(xpath = "//a[contains(text(),'Bachelor of Arts (Journalism and Mass communicatio')]")  // Bachelor of Arts (Journalism and Mass communication)
	WebElement BAJandM;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Commerce']")  // Bachelor of Commerce
	WebElement Bcom;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts']")  // Bachelor of Arts
	WebElement BA;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Art (Kannada Medium)']")  // Bachelor of Art (Kannada Medium)
	WebElement BAKannada;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Malayalam Medium)']")  // Bachelor of Arts (Malayalam Medium)
	WebElement BAMalayalam;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Tamil Medium)']")  // Bachelor of Arts (Tamil Medium)
	WebElement BATamil;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Telugu Medium)']")  // Bachelor of Arts (Telugu Medium)
	WebElement BATelugu;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Hindi Medium)']")  // Bachelor of Arts (Hindi Medium)
	WebElement BAHindi;

	@FindBy(xpath = "//a[contains(text(),'B.Com with Specialization in International Finance')]")  // B.Com with Specialization in International Finance & Accounting
	WebElement BcomFinance;

	@FindBy(xpath = "//a[normalize-space()='Bachelor Of Commerce (Honours)']")  // Bachelor Of Commerce (Honours)
	WebElement BcomHonours;

	/////////////////////--------------------------PG Program-------------------------///////////////////////////////////////////


	@FindBy(xpath = "//a[normalize-space()='Master of Computer Applications']")  //Master of Computer Applications
	WebElement MCANormal;

	@FindBy(xpath = "//a[normalize-space()='MCA with specialization in Blockchain']")  //MCA with specialization in Blockchain
	WebElement MCAwithspecializationinBlockchain;

	@FindBy(xpath = "//a[normalize-space()='MCA with specialization in ML & Al']")  //MCA with specialization in ML & Al
	WebElement MCAwithspecializationinMLandAl;

	@FindBy(xpath = "//a[normalize-space()='MCA with specialization in Machine Learning']")  //MCA with specialization in Machine Learning
	WebElement MCAwithspecializationinMachineLearning;

	@FindBy(xpath = "//a[normalize-space()='MCA with specialization in AR & VR']")  //MCA with specialization in AR & VR
	WebElement MCAwithspecializationinARandVR;

	@FindBy(xpath = "//a[normalize-space()='Master of Business Administration']")  //Master of Business Administration
	WebElement MasterofBusinessAdministration;

	@FindBy(xpath = "//a[contains(text(),'MBA with specialization in Digital Marketing Manag')]")  //MBA with specialization in Digital Marketing Management
	WebElement MBAwithspecializationinDigitalMarketingManagement;

	@FindBy(xpath = "//a[normalize-space()='MBA with specialization in HR Analytics']")  //MBA with specialization in HR Analytics
	WebElement MBAwithspecializationinHRAnalytics;

	@FindBy(xpath = "//a[normalize-space()='MBA with specialization in Data Science']")  //MBA with specialization in Data Science
	WebElement MBAwithspecializationinDataScience;

	@FindBy(xpath = "//a[normalize-space()='MBA with specialization in Business Analytics']")  //MBA with specialization in Business Analytics
	WebElement MBAwithspecializationinBusinessAnalytics;

	@FindBy(xpath = "//a[contains(text(),'MBA with specialization in Digital Entrepreneurshi')]")  //MBA with specialization in Digital Entrepreneurship
	WebElement MBAwithspecializationinDigitalEntrepreneurship;

	@FindBy(xpath = "//a[normalize-space()='Master of Arts (Journalism and Mass communication)']")  //Master of Arts (Journalism and Mass communication)
	WebElement MasterofArtsJournalismandMasscommunication;

	@FindBy(xpath = "//a[normalize-space()='M.Com with specialization in Fintech']")  //M.Com with specialization in Fintech
	WebElement MComwithspecializationinFintech;

	@FindBy(xpath = "//a[normalize-space()='M.Com with specialization in Financial Management']")  //M.Com with specialization in Financial Management
	WebElement MComwithspecializationinFinancialManagement;

	@FindBy(xpath = "//a[normalize-space()='Master of Arts in Public Policy & Governance']")  //Master of Arts in Public Policy & Governance
	WebElement MasterofArtsinPublicPolicyandGovernance;

	@FindBy(xpath = "//a[normalize-space()='Master of Arts in Psychology']")  //Master of Arts in Psychology
	WebElement MasterofArtsinPsychology;

	@FindBy(xpath = "//a[normalize-space()='Master of Science in Data Science']")  ///Master of Science in Data Science
	WebElement MasterofScienceinDataScience;

	//-----------------------------------------Methods---------------------------------------------------------------------------------------------------------

	public void HomePageAmityLogo() {

		Assert.assertTrue(amitylogoElement.isDisplayed(), "Logo is not displayed");
		if(amitylogoElement.isDisplayed()) {
			System.out.println("Amity Logo displayed");
		}else {
			System.out.println("Amity Logo is not Displayed");
		}

	}

	public void ProgramHeaderbutton(){
		Assert.assertTrue(programButtonElement.isEnabled(), "Program Button is not enabled");
		if(programButtonElement.isEnabled()) {
			System.out.println("Program button is working");
		}else {
			System.out.println("Program button is not working");
		}
		programButtonElement.click();	
	}


	public void CareerServicesHeaderButton() {

		Assert.assertTrue(careerServicesButttonElement.isEnabled(), "Career services button is not enabled");
		if(careerServicesButttonElement.isEnabled()) {
			System.out.println("CareerServices button is working");
		}else {
			System.out.println("CareerServices button is not working");
		}
		careerServicesButttonElement.click();

		driver.close();	
	}


	public void AdvantagesHeaderButton(){
		Assert.assertTrue(advanragesButtonElement.isEnabled(), "Advantages button is not enabled");
		if(advanragesButtonElement.isEnabled()) {
			System.out.println("Advantages button is working");
		}else {
			System.out.println("Advantages button is not working");
		}
		advanragesButtonElement.click();

	}

	public void SearchHeaderButton() {
		Assert.assertTrue(SearchButtonElement.isEnabled(), "Search Button is not enabled");
		if(SearchButtonElement.isEnabled()) {
			System.out.println("Search button is working");
		}else {
			System.out.println("Search button is not working");
		}
		SearchButtonElement.click();

		driver.findElement(By.xpath("//div[contains(@class,'header_menuContainer__00BgW')]//input[contains(@type,'text')]")).sendKeys("Master Of Business Administration");

	}

	public void CallusHeaderButton() throws InterruptedException{
		Assert.assertTrue(callUsElement.isEnabled(), "Call us button is not enabled");
		if(callUsElement.isEnabled()) {
			System.out.println("Call us button is working");
		}else {
			System.out.println("Call us button is not working");
		}

		callUsElement.click();
		Thread.sleep(2000);
		String handle2 = driver.getWindowHandle();
		driver.switchTo().window(handle2);
		driver.findElement(By.xpath("//div[@class='border border-blu bg-white padding-0-imp Modal_dialog__e3Pgf']//*[name()='svg']"));

	} 


	public void SearchLoginHeaderButoon() throws InterruptedException{
		Assert.assertTrue(StudentLoginElement.isEnabled(), "Student Login not working");
		StudentLoginElement.click();
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		WebElement Studentlogin = driver.findElement(By.xpath("//*[text()='Student Login']"));
		if(Studentlogin.getText().equals("Student Login")) {
			System.out.println("Student login click pass");
		}else {
			System.out.println("student login click is failed");
		}


	}

	public void EnrollNowHeaderButton() {
		Assert.assertTrue(enrollNowButtonElement.isEnabled(), "Enroll now button is not working");
		enrollNowButtonElement.click();
		String currenturl = driver.getCurrentUrl();
		String Expectedurl = "https://application.amityonline.com/admission/home/signup";
		if(currenturl.equals(Expectedurl)) {
			System.out.println("Enroll Now URL is correct");
		}else {
			System.out.println("Enroll Now URL is not correct");
		}


	}

	public void ApplyNowbuttonHerocard() throws InterruptedException{
		Thread.sleep(2000);
		Assert.assertTrue(applyNoWebElement.isEnabled(), "Apply now button not working");
		applyNoWebElement.click();
		String handle3 = driver.getWindowHandle();
		driver.switchTo().window(handle3);
		Thread.sleep(2000);
		WebElement apply = driver.findElement(By.xpath("//h2[@class='ConnectModal_Modal__RightContainerTitle__WO56D']"));
		if(apply.getText().equals("Connect With Our Counsellor")) {
			System.out.println("Apply Now button click verified");
		}else {
			System.out.println("Apply Now button click not verified");
		}
	}

	public void Callusicon() throws InterruptedException{
		Assert.assertTrue(CalliconElement.isEnabled(), "Call icon button not working");
		CalliconElement.click();
		Thread.sleep(2000);
		String handle4 = driver.getWindowHandle();
		driver.switchTo().window(handle4);
		WebElement clickcloseusicon = driver.findElement(By.xpath("//div[@class='border border-blu bg-white padding-0-imp Modal_dialog__e3Pgf']//*[name()='svg']"));
		if(clickcloseusicon.isEnabled()) {
			System.out.println("Call-us icon POP-UP is displayed");
		}else {
			System.out.println("Call-us icon POP-UP is not displayed");
		}

		clickcloseusicon.click();

	}  

	public void WhatsappIconbutton() throws InterruptedException{
		Assert.assertTrue(whatsappIconElement.isEnabled(), "Whatsapp icon button not working");
		whatsappIconElement.click();
		Thread.sleep(2000);
		Set<String> windowhandle = driver.getWindowHandles();
		List<String> handle5 = new ArrayList<String>();
		handle5.addAll(windowhandle);
		Thread.sleep(1000);
		driver.switchTo().window(handle5.get(1));
		String ExpectedWhatsappurl = "https://api.whatsapp.com/send/?phone=%2B918527901901&text=Hi&type=phone_number&app_absent=0&utm_campaign=Bot&utm_source=Website";
		String ActualURL = driver.getCurrentUrl();
		if(ActualURL.equals(ExpectedWhatsappurl)) {
			System.out.println("Whatsapp click URL verified");
		}else {
			System.out.println("Whatsapp click URL not verified");
		}


	}

	public void ViewAllButton(){
		Assert.assertTrue(viewAllElement.isEnabled(), "View all button is not working");
		Actions act2=new Actions(driver);
		act2.moveToElement(viewAllElement).click().perform();
		String expextedURL = "https://amityonline.com/programs";
		if(driver.getCurrentUrl().equals(expextedURL)) {
			System.out.println("View all button url verified.");
		}
		else {
			System.out.println("View all button url not verified.");
		}


	}

	public void RequestAcallButton() throws InterruptedException{
		Assert.assertTrue(requestaCallElement.isEnabled(), "Request a call button is not working");
		Actions act=new Actions(driver);
		act.moveToElement(requestaCallElement).click().perform();
		String handle6 = driver.getWindowHandle();
		driver.switchTo().window(handle6);
		Thread.sleep(2000);
		WebElement apply2 = driver.findElement(By.xpath("//h2[@class='ConnectModal_Modal__RightContainerTitle__WO56D']"));
		if(apply2.getText().equals("Connect With Our Counsellor")) {
			System.out.println("Request a call click verified");
		}else {
			System.out.println("Request a call click not verified");
		}


	}

	public void ViewAllStay() {
		Assert.assertTrue(viewallStayElement.isEnabled(), "ViewallStay not enabled");
		Actions act3=new Actions(driver);
		act3.moveToElement(viewallStayElement).click().perform();
		String expectedurl2 = "https://amityonline.com/news";
		if(driver.getCurrentUrl().equals(expectedurl2)) {
			System.out.println("View all-Stay Informed with Our Top news Stories url verified");
		}else {
			System.out.println("View all-Stay Informed with Our Top news Stories url not verified");
		}

	}

	public void ViewAllBlogs() {
		Assert.assertTrue(viewallBlogElement.isEnabled(), "View All blog button is not enabled");
		Actions act4=new Actions(driver);
		act4.moveToElement(viewallBlogElement).click().perform();
		String expurl = "https://amityonline.com/blog";
		if(driver.getCurrentUrl().equals(expurl)) {
			System.out.println("View All-Latest blog from Amity Online’s world url is verified");
		}else {
			System.out.println("View All-Latest blog from Amity Online’s world url is not verified");
		}

	}

	public void KnowMores() throws InterruptedException {
		Assert.assertTrue(knowMorElement.isEnabled(), "Know More-Building nation through education is not enabled");
		Actions act5=new Actions(driver);
		act5.moveToElement(knowMorElement).click().perform();
		Thread.sleep(2000);
		String expectedknowmore = "https://amityonline.com/leadership";
		if(driver.getCurrentUrl().equals(expectedknowmore)) {
			System.out.println("Know More-Building nation through education url is verified");
		}else {
			System.out.println("Know More-Building nation through education url is not verified");
		}
	}

	public void ApplyNowBottonCTAs() throws InterruptedException {
		Assert.assertTrue(apllyNowCTAlElement.isEnabled(), "Apply Now botton CTA is not enabled");
		Actions act6=new Actions(driver);
		act6.moveToElement(apllyNowCTAlElement).click().perform();
		Thread.sleep(2000);
		Set<String> windowhandle9 = driver.getWindowHandles();
		List<String> handle9 = new ArrayList<String>();
		handle9.addAll(windowhandle9);
		driver.switchTo().window(handle9.get(1));
		String applynowbottomexpectedURL = "https://application.amityonline.com/admission/home/signup";
		if(driver.getCurrentUrl().equals(applynowbottomexpectedURL)) {
			System.out.println("Apply Now bottom CTA verified");
		}else {
			System.out.println("Apply Now bottom CTA not verified");
			driver.close();
		}

	}  


	public void ClickonShowMore() throws InterruptedException{
		Assert.assertTrue(showMorElement.isEnabled(), "Show more button is now enabled");
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		/////////---------------------------About-us-----------------------///////////////////////////////		

		Assert.assertTrue(aboutusElement.isEnabled(), "About-us is nto enabled");
		Actions act8=new Actions(driver);
		act8.moveToElement(aboutusElement).click().perform();
		Thread.sleep(2000);

		String expabtus = "https://amityonline.com/about-us";
		if(driver.getCurrentUrl().equals(expabtus)) {
			System.out.println("About us option is working");
		}else {
			System.out.println("About us option is not working");
		}	
	}


	public void ClickonCareerServices() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(careerServicesElement.isEnabled(), "Career service option is not enabled");
		Actions act9=new Actions(driver);
		act9.moveToElement(careerServicesElement).click().perform();
		Thread.sleep(2000);
		Set<String> windowhandlecareer = driver.getWindowHandles();
		List<String> handlecareer = new ArrayList<String>();
		handlecareer.addAll(windowhandlecareer);
		driver.switchTo().window(handlecareer.get(1));
		String careerserviceexpurl = "https://amityonline.com/career-services";
		if(driver.getCurrentUrl().equals(careerserviceexpurl)) {
			System.out.println("Career services URL verified");
		}else {
			System.out.println("Career services URL is not verified");

		}
		driver.close();
	}



	public void StudentStories() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(Studentstories.isEnabled(), "Student stories option is not enabled");
		Actions act10=new Actions(driver);
		act10.moveToElement(Studentstories).click().perform();
		Thread.sleep(2000);
		String Studentstoriesexpurl = "https://amityonline.com/student-story";
		if(driver.getCurrentUrl().equals(Studentstoriesexpurl)) {
			System.out.println("Student stories url is verified");
		}else {
			System.out.println("Student stories url is not verified");
		}
	}

	public void Leadershipoption() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(leadershipelement.isEnabled(), "Leadership option is not enabled");
		Actions act11=new Actions(driver);
		act11.moveToElement(leadershipelement).click().perform();
		Thread.sleep(2000);
		String leadershipexpurl = "https://amityonline.com/leadership";
		if(driver.getCurrentUrl().equals(leadershipexpurl)) {
			System.out.println("Leadership URL is verified");
		}else {
			System.out.println("Leadership URL is not verified");
		}
	}

	public void CorporateOptions() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(corporate.isEnabled(), "Corporate option is not enabled");
		Actions act12=new Actions(driver);
		act12.moveToElement(corporate).click().perform();
		Thread.sleep(2000);
		String Corporateexpurl = "https://amityonline.com/corporates";
		if(driver.getCurrentUrl().equals(Corporateexpurl)) {
			System.out.println("Corporate URL is verified");
		}else {
			System.out.println("corporate URL is not verified");
		}

	}

	public void contactusoption() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(contactus.isEnabled(), "Contact us option is not enabled");
		Actions act13=new Actions(driver);
		act13.moveToElement(contactus).click().perform();
		Thread.sleep(2000);
		String contactusexpurl = "https://amityonline.com/contact-us";
		if(driver.getCurrentUrl().equals(contactusexpurl)) {
			System.out.println("Contact us  URL is verified");
		}else {
			System.out.println("Contact us URL is not verified");
		}
	}

	public void TermsandConditions() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(terms.isEnabled(), "Terms & Conditions option is not enabled");
		Actions act14=new Actions(driver);
		act14.moveToElement(terms).click().perform();
		Thread.sleep(2000);
		String termsexpurl = "https://amityonline.com/terms-and-conditions";
		if(driver.getCurrentUrl().equals(termsexpurl)) {
			System.out.println("Terms & Conditions URL is verified");
		}else {
			System.out.println("Terms & Conditions URL is not verified");
		}
	}

	public void StudentSupportOption() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(studentSupportElement.isEnabled(), "Terms & Conditions option is not enabled");
		Actions act15=new Actions(driver);
		act15.moveToElement(studentSupportElement).click().perform();
		Thread.sleep(2000);
		String studentexpurl = "https://amitysupport.freshdesk.com/support/home";
		if(driver.getCurrentUrl().equals(studentexpurl)) {
			System.out.println("Student supoport URL is verified");
		}else {
			System.out.println("Student support URL is not verified");
		}
	}

	public void IntellectualPropertyoption() throws InterruptedException {
		Actions act7=new Actions(driver);
		Thread.sleep(2000);
		act7.moveToElement(showMorElement).click().perform();
		Assert.assertTrue(Intellectualproperty.isEnabled(), "Terms & Conditions option is not enabled");
		Actions act16=new Actions(driver);
		act16.moveToElement(Intellectualproperty).click().perform();
		Thread.sleep(2000);
		String intellectualexpurl = "https://amityonline.com/ip-listing";
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals(intellectualexpurl)) {
			System.out.println("Intellectual property URL is verified");
		}else {
			System.out.println("Intellectual property URL is not verified");
		}
	}

	public void UGCApprovalsOption() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(UGC.isEnabled(), "UGC option is not enabled");
		Actions act17=new Actions(driver);
		act17.moveToElement(UGC).click().perform();
		Thread.sleep(2000);
		String UGCexpurl = "https://amityonline.com/ugc_regulations/";
		if(driver.getCurrentUrl().equals(UGCexpurl)) {
			System.out.println("UGC approvals URL is verified");
		}else {
			System.out.println("UGC approvals URL is not verified");
		}
	}

	public void ResourceOption() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(resources.isEnabled(), "Resource option is not enabled");
		Actions act18=new Actions(driver);
		act18.moveToElement(resources).click().perform();
		Thread.sleep(3000);
		String resourcesexpurl = "https://amityonline.com/#";
		if(driver.getCurrentUrl().equals(resourcesexpurl)) {
			System.out.println("Resources approvals URL is verified");
		}else {
			System.out.println("Resources approvals URL is not verified");
		} 
	}

	public void BlogOption() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		Assert.assertTrue(Blog.isEnabled(), "Blog option is not enabled");
		Actions act19=new Actions(driver);
		act19.moveToElement(Blog).click().perform();
		Thread.sleep(2000);
		String Blogexpurl = "https://amityonline.com/blog";
		if(driver.getCurrentUrl().equals(Blogexpurl)) {
			System.out.println("Blog URL is verified");
		}else {
			System.out.println("Blog URL is not verified");
		}
	}

	public void MediaOption() throws InterruptedException {
		Actions act7=new Actions(driver);
		Thread.sleep(2000);
		act7.moveToElement(showMorElement).click().perform();
		WebElement Media1 = driver.findElement(By.xpath("//a[normalize-space()='Media']"));
		Actions act21=new Actions(driver);
		Thread.sleep(2000);
		act21.moveToElement(Media1).click().perform();
		Thread.sleep(2000);
		String mediaexpurl = "https://amityonline.com/news";
		if(driver.getCurrentUrl().equals(mediaexpurl)) {
			System.out.println("Media URL is verified");
		}else {
			System.out.println("Media URL is not verified");
		}
	}

	//-------------------------------------------------------UG Programs----------------------------------------------------------------------------------------

	// Bachelor of Computer Applications
	public void UGProgramList() throws InterruptedException {
		
		//Bachelor of Computer Applications
		Actions act7=new Actions(driver);
		Thread.sleep(2000);
		act7.moveToElement(showMorElement).click().perform();
		Actions act50=new Actions(driver);
		Thread.sleep(2000);
		 act50.moveToElement(BCAprogram).click().perform();
		 Thread.sleep(2000);
		String ExpBCAurl = "https://amityonline.com/bachelor-of-computer-applications-online";
		if(driver.getCurrentUrl().equals(ExpBCAurl)) {
			System.out.println("BCA program url is verified");
		}else {
			System.out.println("BCA program url is not verified");
		}
		driver.navigate().back();

		
		//BCA with specialization in Cloud & Security
		WebElement BCASp = driver.findElement(By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[2]/div[1]/ul[2]/li[3]/a[1]"));
		Actions act51=new Actions(driver);
		Thread.sleep(2000);
		act51.moveToElement(BCASp).click().perform();
		Thread.sleep(2000);
		String ExpBCASpurl = "https://amityonline.com/bca-cloud-security-online";
		if(driver.getCurrentUrl().equals(ExpBCASpurl)) {
			System.out.println("BCASpec program url is verified");
		}else {
			System.out.println("BCASpec program url is not verified");
		}
		driver.navigate().back();
		
		//BCA with specialization in Data Analytics
		Thread.sleep(2000);
		WebElement BCAdataAnalytics = driver.findElement(By.xpath("//a[normalize-space()='BCA with specialization in Data Analytics']"));
		Actions act52=new Actions(driver);
		Thread.sleep(2000);
		act52.moveToElement(BCAdataAnalytics).click().perform();
		Thread.sleep(2000);
		String ExpBCAdataAnalytics = "https://amityonline.com/bca-data-analytics-online";
		if(driver.getCurrentUrl().equals(ExpBCAdataAnalytics)) {
			System.out.println("BCAdataAnalytics program url is verified");
		}else {
			System.out.println("BCAdataAnalytics program url is not verified");
		}
		driver.navigate().back();
		
		
		//Bachelor of Business Administration
		Thread.sleep(2000);
		WebElement BBA = driver.findElement(By.xpath("//a[normalize-space()='Bachelor of Business Administration']"));
		Actions act53=new Actions(driver);
		Thread.sleep(2000);
		act53.moveToElement(BBA).click().perform();
		Thread.sleep(2000);
		String ExpBBA = "https://amityonline.com/bachelor-of-business-administration-online";
		if(driver.getCurrentUrl().equals(ExpBBA)) {
			System.out.println("BBA program url is verified");
		}else {
			System.out.println("BBA program url is not verified");
		}
		driver.navigate().back();
		
		
		
		//Bachelor of Arts (Journalism and Mass communication)
		Thread.sleep(2000);
		
		WebElement	BAJandM=driver.findElement(By.xpath("//a[contains(text(),'Bachelor of Arts (Journalism and Mass communicatio')]"));
		Assert.assertTrue(BAJandM.isEnabled(), "BAJandM is not enabled");
		Actions act54=new Actions(driver);
		Thread.sleep(2000);
		act54.moveToElement(BAJandM).click().perform();
		Thread.sleep(2000);
		String ExpBAJandM = "https://amityonline.com/bachelor-of-arts-journalism-and-mass-communication-online";
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals(ExpBAJandM)) {
			System.out.println("BAJandM program url is verified");
		}else {
			System.out.println("BAJandM program url is not verified");
		}
		driver.navigate().back();
		
		
		//Bachelor of Commerce
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M18.2648 2')]")).click();   // TimeConnect model pop-up
		
		WebElement Bcom = driver.findElement(By.xpath("//a[normalize-space()='Bachelor of Commerce']"));
		Actions act55=new Actions(driver);
		Thread.sleep(2000);
		act55.moveToElement(Bcom).click().perform();
		Thread.sleep(2000);
		String ExpBcom = "https://amityonline.com/bachelor-of-commerce-online";
		if(driver.getCurrentUrl().equals(ExpBcom)) {
			System.out.println("Bcom program url is verified");
		}else {
		}
		driver.navigate().back();

		//Bachelor of Arts
		Thread.sleep(2000);
		WebElement BA = driver.findElement(By.xpath("//a[normalize-space()='Bachelor of Arts']"));
		Actions act56=new Actions(driver);
		Thread.sleep(2000);
		act56.moveToElement(BA).click().perform();
		Thread.sleep(2000);
		String ExpBA = "https://amityonline.com/bachelor-of-arts-online";
		if(driver.getCurrentUrl().equals(ExpBA)) {
			System.out.println("BA program url is verified");
		}else {
			System.out.println("BA program url is not verified");
		}

		driver.navigate().back();
		
		//Bachelor of Art (Kannada Medium)
		Thread.sleep(2000);
		WebElement BAKannada = driver.findElement(By.xpath("//a[normalize-space()='Bachelor of Art (Kannada Medium)']"));
		Actions act57=new Actions(driver);
		Thread.sleep(2000);
		act57.moveToElement(BAKannada).click().perform();
		Thread.sleep(2000);
		String ExpBAKannada = "https://amityonline.com/bachelor-of-arts-kannada-online";
		if(driver.getCurrentUrl().equals(ExpBAKannada)) {
			System.out.println("BAKannada program url is verified");
		}else {
			System.out.println("BAKannada program url is not verified");
		}

		driver.navigate().back();
		
		
		
		//Bachelor of Arts (Malayalam Medium)
		Thread.sleep(2000);
		WebElement BAMalayalam = driver.findElement(By.xpath("//a[normalize-space()='Bachelor of Arts (Malayalam Medium)']"));
		Actions act58=new Actions(driver);
		Thread.sleep(2000);
		act58.moveToElement(BAMalayalam).click().perform();
		Thread.sleep(2000);
		String ExpBAMalayalam = "https://amityonline.com/bachelor-of-arts-malayalam-online";
		if(driver.getCurrentUrl().equals(ExpBAMalayalam)) {
			System.out.println("BAMalayalam program url is verified");
		}else {
			System.out.println("BAMalayalam program url is not verified");
		}

		driver.navigate().back();
		
		//Bachelor of Arts (Tamil Medium)
		Thread.sleep(2000);
		WebElement BATamil = driver.findElement(By.xpath("//a[normalize-space()='Bachelor of Arts (Tamil Medium)']"));
		Actions act59=new Actions(driver);
		Thread.sleep(2000);
		act59.moveToElement(BATamil).click().perform();
		Thread.sleep(2000);
		String ExpBATamil = "https://amityonline.com/bachelor-of-arts-tamil-online";
		if(driver.getCurrentUrl().equals(ExpBATamil)) {
			System.out.println("BATamil program url is verified");
		}else {
			System.out.println("BATamil program url is not verified");
		}

		driver.navigate().back();
		
		
		//Bachelor of Arts (Telugu Medium)
		Thread.sleep(2000);
		WebElement BATelugu = driver.findElement(By.xpath("//a[normalize-space()='Bachelor of Arts (Telugu Medium)']"));
		Actions act60=new Actions(driver);
		Thread.sleep(2000);
		act60.moveToElement(BATelugu).click().perform();
		Thread.sleep(2000);
		String ExpBATelugu = "https://amityonline.com/bachelor-of-arts-telugu-online";
		if(driver.getCurrentUrl().equals(ExpBATelugu)) {
			System.out.println("BATelugu program url is verified");
		}else {
			System.out.println("BATelugu program url is not verified");
		}

		driver.navigate().back();
		
		//Bachelor of Arts (Hindi Medium)
		Thread.sleep(2000);
		WebElement BAHindi = driver.findElement(By.xpath("//a[normalize-space()='Bachelor of Arts (Hindi Medium)']"));
		Actions act61=new Actions(driver);
		Thread.sleep(2000);
		act61.moveToElement(BAHindi).click().perform();
		Thread.sleep(2000);
		String ExpBAHindi = "https://amityonline.com/bachelor-of-arts-hindi-medium-online";
		if(driver.getCurrentUrl().equals(ExpBAHindi)) {
			System.out.println("BAHindi program url is verified");
		}else {
			System.out.println("BAHindi program url is not verified");
		}

		driver.navigate().back();
		
		
		//B.Com with Specialization in International Finance & Accounting
		Thread.sleep(2000);
		WebElement BcomFinance = driver.findElement(By.xpath("//a[contains(text(),'B.Com with Specialization in International Finance')]"));
		Actions act62=new Actions(driver);
		Thread.sleep(2000);
		act62.moveToElement(BcomFinance).click().perform();
		Thread.sleep(2000);
		String ExpBcomFinance = "https://amityonline.com/bcom-internationalfinance";
		if(driver.getCurrentUrl().equals(ExpBcomFinance)) {
			System.out.println("BcomFinance program url is verified");
		}else {
			System.out.println("BcomFinance program url is not verified");
		}

		driver.navigate().back();
		
		
		//Bachelor Of Commerce (Honours)
		Thread.sleep(2000);
		WebElement BcomHonours = driver.findElement(By.xpath("//a[normalize-space()='Bachelor Of Commerce (Honours)']"));
		Actions act63=new Actions(driver);
		Thread.sleep(2000);
		act63.moveToElement(BcomHonours).click().perform();
		Thread.sleep(2000);
		String ExpBcomHonours = "https://amityonline.com/bachelor-of-commerce-honours";
		if(driver.getCurrentUrl().equals(ExpBcomHonours)) {
			System.out.println("BcomHonours program url is verified");
		}else {
			System.out.println("BcomHonours program url is not verified");
		}

		driver.navigate().back(); 
		
	}

//-------------------------------------------------------PG Programs----------------------------------------------------------------------------------------

	//Master of Computer Applications

	public void PGProgramlist() throws InterruptedException {
		
		Actions act7=new Actions(driver);
		Thread.sleep(2000);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		WebElement MCANormal = driver.findElement(By.xpath("//a[normalize-space()='Master of Computer Applications']"));
		Actions act64=new Actions(driver);
		Thread.sleep(2000);
		act64.moveToElement(MCANormal).click().perform();
		Thread.sleep(2000);
		String ExpMCANormal = "https://amityonline.com/master-of-computer-applications-online";
		if(driver.getCurrentUrl().equals(ExpMCANormal)) {
			System.out.println("MCANormal program url is verified");
		}else {
			System.out.println("MCANormal program url is not verified");
		}

		driver.navigate().back();
		
//	 	MCA with specialization in Blockchain
		Thread.sleep(2000);
		WebElement MCAwithspecializationinBlockchain = driver.findElement(By.xpath("//a[normalize-space()='MCA with specialization in Blockchain']"));
		Actions act65=new Actions(driver);
		Thread.sleep(2000);
		act65.moveToElement(MCAwithspecializationinBlockchain).click().perform();
		Thread.sleep(2000);
		String ExpMCAwithspecializationinBlockchain = "https://amityonline.com/mca-blockchain-online";
		if(driver.getCurrentUrl().equals(ExpMCAwithspecializationinBlockchain)) {
			System.out.println("MCAwithspecializationinBlockchain program url is verified");
		}else {
			System.out.println("MCAwithspecializationinBlockchain program url is not verified");
		}

		driver.navigate().back();
		
		
		//MCA with specialization in ML & Al
		Thread.sleep(2000);
		WebElement MCAwithspecializationinMLandAl = driver.findElement(By.xpath("//a[normalize-space()='MCA with specialization in ML & Al']"));
		Actions act66=new Actions(driver);
		Thread.sleep(2000);
		act66.moveToElement(MCAwithspecializationinMLandAl).click().perform();
		Thread.sleep(2000);
		String ExpMCAwithspecializationinMLandAl = "https://amityonline.com/mca-machine-learning-and-artificial-intelligence-online";
		if(driver.getCurrentUrl().equals(ExpMCAwithspecializationinMLandAl)) {
			System.out.println("MCAwithspecializationinMLandAl program url is verified");
		}else {
			System.out.println("MCAwithspecializationinMLandAl program url is not verified");
		}

		driver.navigate().back();
		
		
		//MCA with specialization in Machine Learning
		Thread.sleep(2000);
		WebElement MCAwithspecializationinMachineLearning = driver.findElement(By.xpath("//a[normalize-space()='MCA with specialization in Machine Learning']"));
		Actions act67=new Actions(driver);
		Thread.sleep(2000);
		act67.moveToElement(MCAwithspecializationinMachineLearning).click().perform();
		Thread.sleep(2000);
		String ExpMCAwithspecializationinMachineLearning = "https://amityonline.com/mca-machine-learning-online";
		if(driver.getCurrentUrl().equals(ExpMCAwithspecializationinMachineLearning)) {
			System.out.println("MCAwithspecializationinMachineLearning program url is verified");
		}else {
			System.out.println("MCAwithspecializationinMachineLearning program url is not verified");
		}

		driver.navigate().back();
		Thread.sleep(2000);
		WebElement timeconnectpopup = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M18.2648 2')]"));
		timeconnectpopup.click();
		
		//MCA with specialization in AR & VR
		
		WebElement MCAwithspecializationinARandVR = driver.findElement(By.xpath("//a[normalize-space()='MCA with specialization in AR & VR']"));
		Actions act68=new Actions(driver);
		Thread.sleep(2000);
		act68.moveToElement(MCAwithspecializationinARandVR).click().perform();
		Thread.sleep(2000);
		String ExpMCAwithspecializationinARandVR = "https://amityonline.com/mca-virtualreality-online";
		if(driver.getCurrentUrl().equals(ExpMCAwithspecializationinARandVR)) {
			System.out.println("MCAwithspecializationinARandVR program url is verified");
		}else {
			System.out.println("MCAwithspecializationinARandVR program url is not verified");
		}

		driver.navigate().back();
		
		//Master of Business Administration
		Thread.sleep(2000);
		WebElement MasterofBusinessAdministration = driver.findElement(By.xpath("//a[normalize-space()='Master of Business Administration']"));
		Actions act69=new Actions(driver);
		Thread.sleep(2000);
		act69.moveToElement(MasterofBusinessAdministration).click().perform();
		Thread.sleep(2000);
		String ExpMasterofBusinessAdministration = "https://amityonline.com/master-of-business-administration-online";
		if(driver.getCurrentUrl().equals(ExpMasterofBusinessAdministration)) {
			System.out.println("MasterofBusinessAdministration program url is verified");
		}else {
			System.out.println("MasterofBusinessAdministration program url is not verified");
		}

		driver.navigate().back();
		
//		MBA with specialization in Digital Marketing Management
		Thread.sleep(2000);
		WebElement MBAwithspecializationinDigitalMarketingManagement = driver.findElement(By.xpath("//a[contains(text(),'MBA with specialization in Digital Marketing Manag')]"));
		Actions act70=new Actions(driver);
		Thread.sleep(2000);
		act70.moveToElement(MBAwithspecializationinDigitalMarketingManagement).click().perform();
		Thread.sleep(2000);
		String ExpMBAwithspecializationinDigitalMarketingManagement = "https://amityonline.com/mba-digital-marketing-management-online";
		if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinDigitalMarketingManagement)) {
			System.out.println("MBAwithspecializationinDigitalMarketingManagement program url is verified");
		}else {
			System.out.println("MBAwithspecializationinDigitalMarketingManagement program url is not verified");
		}

		driver.navigate().back();
		
		
		//MBA with specialization in HR Analytics
		Thread.sleep(2000);
		WebElement MBAwithspecializationinHRAnalytics = driver.findElement(By.xpath("//a[normalize-space()='MBA with specialization in HR Analytics']"));
		Actions act71=new Actions(driver);
		Thread.sleep(2000);
		act71.moveToElement(MBAwithspecializationinHRAnalytics).click().perform();
		Thread.sleep(2000);
		String ExpMBAwithspecializationinHRAnalytics = "https://amityonline.com/mba-human-resources-hr-analytics-online";
		if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinHRAnalytics)) {
			System.out.println("MBAwithspecializationinHRAnalytics program url is verified");
		}else {
			System.out.println("MBAwithspecializationinHRAnalytics program url is not verified");
		}

		driver.navigate().back();
		
		
		//MBA with specialization in Data Science
		Thread.sleep(2000);
		WebElement MBAwithspecializationinDataScience = driver.findElement(By.xpath("//a[normalize-space()='MBA with specialization in Data Science']"));
		Actions act72=new Actions(driver);
		Thread.sleep(2000);
		act72.moveToElement(MBAwithspecializationinDataScience).click().perform();
		Thread.sleep(2000);
		String ExpMBAwithspecializationinDataScience = "https://amityonline.com/mba-data-science-online";
		if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinDataScience)) {
			System.out.println("MBAwithspecializationinDataScience program url is verified");
		}else {
			System.out.println("MBAwithspecializationinDataScience program url is not verified");
		}

		driver.navigate().back();
		
		//MBA with specialization in Business Analytics
		Thread.sleep(2000);
		WebElement MBAwithspecializationinBusinessAnalytics = driver.findElement(By.xpath("//a[normalize-space()='MBA with specialization in Business Analytics']"));
		Actions act73=new Actions(driver);
		Thread.sleep(2000);
		act73.moveToElement(MBAwithspecializationinBusinessAnalytics).click().perform();
		Thread.sleep(2000);
		String ExpMBAwithspecializationinBusinessAnalytics = "https://amityonline.com/mba-business-analytics-online";
		if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinBusinessAnalytics)) {
			System.out.println("MBAwithspecializationinBusinessAnalytics program url is verified");
		}else {
			System.out.println("MBAwithspecializationinBusinessAnalytics program url is not verified");
		}

		driver.navigate().back();
		
		//MBA with specialization in Digital Entrepreneurship
		Thread.sleep(2000);
		WebElement MBAwithspecializationinDigitalEntrepreneurship = driver.findElement(By.xpath("//a[contains(text(),'MBA with specialization in Digital Entrepreneurshi')]"));
		Actions act74=new Actions(driver);
		Thread.sleep(2000);
		act74.moveToElement(MBAwithspecializationinDigitalEntrepreneurship).click().perform();
		Thread.sleep(2000);
		String ExpMBAwithspecializationinDigitalEntrepreneurship = "https://amityonline.com/mba-digital-entrepreneurship-online";
		if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinDigitalEntrepreneurship)) {
			System.out.println("MBAwithspecializationinDigitalEntrepreneurship program url is verified");
		}else {
			System.out.println("MBAwithspecializationinDigitalEntrepreneurship program url is not verified");
		}

		driver.navigate().back();
		
		//Master of Arts (Journalism and Mass communication)
		Thread.sleep(2000);
		WebElement MasterofArtsJournalismandMasscommunication = driver.findElement(By.xpath("//a[normalize-space()='Master of Arts (Journalism and Mass communication)']"));
		Actions act75=new Actions(driver);
		Thread.sleep(2000);
		act75.moveToElement(MasterofArtsJournalismandMasscommunication).click().perform();
		Thread.sleep(2000);
		String ExpMasterofArtsJournalismandMasscommunication = "https://amityonline.com/master-of-arts-journalism-and-mass-communication-online";
		if(driver.getCurrentUrl().equals(ExpMasterofArtsJournalismandMasscommunication)) {
			System.out.println("MasterofArtsJournalismandMasscommunication program url is verified");
		}else {
			System.out.println("MasterofArtsJournalismandMasscommunication program url is not verified");
		}

		driver.navigate().back();
		
		
		//M.Com with specialization in Fintech
		Thread.sleep(2000);
		WebElement MComwithspecializationinFintech = driver.findElement(By.xpath("//a[normalize-space()='M.Com with specialization in Fintech']"));
		Actions act76=new Actions(driver);
		Thread.sleep(2000);
		act76.moveToElement(MComwithspecializationinFintech).click().perform();
		Thread.sleep(2000);
		String ExpMComwithspecializationinFintech = "https://amityonline.com/mcom-fintech-online";
		if(driver.getCurrentUrl().equals(ExpMComwithspecializationinFintech)) {
			System.out.println("MComwithspecializationinFintech program url is verified");
		}else {
			System.out.println("MComwithspecializationinFintech program url is not verified");
		}

		driver.navigate().back();
		
		
		//M.Com with specialization in Financial Management
		Thread.sleep(2000);
		WebElement MComwithspecializationinFinancialManagement = driver.findElement(By.xpath("//a[normalize-space()='M.Com with specialization in Financial Management']"));
		Actions act77=new Actions(driver);
		Thread.sleep(2000);
		act77.moveToElement(MComwithspecializationinFinancialManagement).click().perform();
		Thread.sleep(2000);
		String ExpMComwithspecializationinFinancialManagement = "https://amityonline.com/master-of-commerce-financial-management-online";
		if(driver.getCurrentUrl().equals(ExpMComwithspecializationinFinancialManagement)) {
			System.out.println("MComwithspecializationinFinancialManagement program url is verified");
		}else {
			System.out.println("MComwithspecializationinFinancialManagement program url is not verified");
		}

		driver.navigate().back();
		
		
		//Master of Arts in Public Policy & Governance
		Thread.sleep(2000);
		WebElement MasterofArtsinPublicPolicyandGovernance = driver.findElement(By.xpath("//a[normalize-space()='Master of Arts in Public Policy & Governance']"));
		Actions act78=new Actions(driver);
		Thread.sleep(2000);
		act78.moveToElement(MasterofArtsinPublicPolicyandGovernance).click().perform();
		Thread.sleep(2000);
		String ExpMasterofArtsinPublicPolicyandGovernance = "https://amityonline.com/ma-public-policy";
		if(driver.getCurrentUrl().equals(ExpMasterofArtsinPublicPolicyandGovernance)) {
			System.out.println("MasterofArtsinPublicPolicyandGovernance program url is verified");
		}else {
			System.out.println("MasterofArtsinPublicPolicyandGovernance program url is not verified");
		}

		driver.navigate().back();
		
		
		//Master of Arts in Psychology
		Thread.sleep(2000);
		WebElement MasterofArtsinPsychology = driver.findElement(By.xpath("//a[normalize-space()='Master of Arts in Psychology']"));
		Actions act79=new Actions(driver);
		Thread.sleep(2000);
		act79.moveToElement(MasterofArtsinPsychology).click().perform();
		Thread.sleep(3000);
		String ExpMasterofArtsinPsychology = "https://amityonline.com/ma-in-psychology";
		if(driver.getCurrentUrl().equals(ExpMasterofArtsinPsychology)) {
			System.out.println("MasterofArtsinPsychology program url is verified");
		}else {
			System.out.println("MasterofArtsinPsychology program url is not verified");
		}

		driver.navigate().back();
		
		//Master of Science in Data Science
		Thread.sleep(2000);
		WebElement MasterofScienceinDataScience = driver.findElement(By.xpath("//a[normalize-space()='Master of Science in Data Science']"));
		Actions act80=new Actions(driver);
		Thread.sleep(2000);
		act80.moveToElement(MasterofScienceinDataScience).click().perform();
		Thread.sleep(2000);
		String ExpMasterofScienceinDataScience = "https://amityonline.com/msc-in-data-science";
		if(driver.getCurrentUrl().equals(ExpMasterofScienceinDataScience)) {
			System.out.println("MasterofScienceinDataScience program url is verified");
		}else {
			System.out.println("MasterofScienceinDataScience program url is not verified");
		
		
		}
		
		
	
		
	}

	public void PrintprogramsList() throws InterruptedException {

		WebElement Showmorebutton = driver.findElement(By.xpath("//span[normalize-space()='show more']"));
		Thread.sleep(2000);
		Actions act7=new Actions(driver);
		act7.moveToElement(Showmorebutton).click().perform();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='styles_subMenuItem__GXmwt w-fit']"));
		int countofelements = elements.size();
		System.out.println("Programs Count :-  "  + (elements.size()-2));
		Thread.sleep(2000);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		for(int i=2; i<countofelements; i++) {
			String PrintPrograms = elements.get(i).getText();
			System.out.println(PrintPrograms);
		}


	}
 













}



