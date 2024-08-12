package HomePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POM.HomePagePOM;


public class HomePage_FunctionalTest {

	WebDriver driver;
	HomePagePOM Hpom;


	@BeforeMethod
	public void LaunchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AmityWebsite_Beta\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Headless");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://amityonline.com/");
		Thread.sleep(1000);
		Hpom=new HomePagePOM(driver);

	}


	@Test (priority = 1)
	public void AmityLogo() {
		Hpom.HomePageAmityLogo();

	}


	@Test(priority = 2)
	public void ProgramButton(){
		Hpom.ProgramHeaderbutton();

	}

	@Test(priority = 3)
	public void CareerServices() throws InterruptedException{
		Hpom.CareerServicesHeaderButton();

	}


	@Test(priority = 4)
	public void AdvantagesButton(){
		Hpom.AdvantagesHeaderButton();

	}

	@Test(priority = 5)
	public void SearchButton(){
		Hpom.SearchHeaderButton();

	}

	@Test(priority = 6)
	public void CallusButton() throws InterruptedException{
		Hpom.CallusHeaderButton();

	} 

	@Test(priority = 7)
	public void StudentLoginButoon() throws InterruptedException{
		Hpom.StudentLoginHeaderButoon();
	}

	@Test(priority = 8)
	public void EnrollNowButton(){
		Hpom.EnrollNowHeaderButton();
	}


		@Test(priority = 9)
	public void ApplyNowbutton() throws InterruptedException{
		Hpom.ApplyNowbuttonHerocard();
	}


	@Test(priority = 10)
	public void Callicon() throws InterruptedException{
		Hpom.Callusicon();
	}  



	@Test (priority = 11)
	public void WhatsappIcon() throws InterruptedException{
		Hpom.WhatsappIconbutton();

	}





	@Test(priority = 12)
	public void ViewAll() {
		Hpom.ViewAllButton();
	}




	@Test (priority = 13)
	public void RequestAcall() throws InterruptedException{
		Hpom.RequestAcallButton();
	}


	@Test (priority = 14)
	public void ViewAllS() {
		Hpom.ViewAllStay();

	}




	@Test (priority = 15)
	public void ViewAllBlog() {
		Hpom.ViewAllBlogs();
	}


	@Test (priority = 16)
	public void KnowMore() throws InterruptedException {
		Hpom.KnowMores();
	}


	@Test (priority = 17)
	public void ApplyNowBottonCTA() throws InterruptedException {
		Hpom.ApplyNowBottonCTAs();

	}  


	@Test (priority = 18)
	public void ClickonShowMoreAboutus() throws InterruptedException{
		Hpom.ClickonShowMore();

	}


	@Test(priority = 19)
	public void CareerServices1() throws InterruptedException {
		Hpom.ClickonCareerServices();

	}


	@Test(priority = 20)
	public void StudentStory() throws InterruptedException {
		Hpom.StudentStories();
	}


	@Test(priority = 21)
	public void LeaderShip() throws InterruptedException {
		Hpom.Leadershipoption();
	}


	@Test(priority = 22)
	public void Corporate() throws InterruptedException {
		Hpom.CorporateOptions();
	}


	@Test(priority = 23)
	public void ContactUs() throws InterruptedException {
		Hpom.contactusoption();
	}


	@Test(priority = 24)
	public void Terms() throws InterruptedException {
		Hpom.TermsandConditions();
	}

	@Test(priority = 25)
	public void StudentSupport() throws InterruptedException {
		Hpom.StudentSupportOption();
	}


	@Test(priority = 26)
	public void Intellectualproperty() throws InterruptedException {
		Hpom.IntellectualPropertyoption();
	}


	@Test(priority = 27)
	public void UGC() throws InterruptedException {
		Hpom.UGCApprovalsOption();
	}




	@Test(priority = 28)
	public void Resource() throws InterruptedException {
		Hpom.ResourceOption();
	}



	@Test(priority = 29)
	public void Blog() throws InterruptedException {
		Hpom.BlogOption();
	}  


	@Test(priority = 30)
	public void Media() throws InterruptedException {
		Hpom.MediaOption();
	}  



	@Test(priority = 31)
	public void BCA() throws InterruptedException {

		Hpom.BCAProgram(); 

	}


	@Test(priority = 32)
	public void BCASp() throws InterruptedException {

		Hpom.BCASpProgram(); 

	}
	
	@Test(priority = 33)
	public void BCAdataAnalytics() throws InterruptedException {

		Hpom.BCAdataAnalyticsProgram(); 

	}
	
	@Test(priority = 34)
	public void BBA() throws InterruptedException {

		Hpom.BBAProgranms(); 

	}
	
	@Test(priority = 35)
	public void BAJandM() throws InterruptedException {

		Hpom.BAJandMProgram(); 

	}
	
	@Test(priority = 36)
	public void Bcom() throws InterruptedException {

		Hpom.BcomProgram(); 

	}
	
	@Test(priority = 37)
	public void BA() throws InterruptedException {

		Hpom.BAProgramns(); 

	}
	
	@Test(priority = 38)
	public void BAKannada() throws InterruptedException {

		Hpom.BAKannadaPrograns(); 

	}
	
	@Test(priority = 39)
	public void BAMalayalam() throws InterruptedException {

		Hpom.BAMalayalamProgram(); 

	}
	
	
	@Test(priority = 40)
	public void BATamil() throws InterruptedException {

		Hpom.BATamilProgranm(); 

	}
	
	@Test(priority = 41)
	public void BATelugu() throws InterruptedException {

		Hpom.BATeluguProgram(); 

	}
	
	
	@Test(priority = 42)
	public void BAHindi() throws InterruptedException {

		Hpom.BAHindiProgramn(); 

	}
	
	
	@Test(priority = 43)
	public void BcomFinance() throws InterruptedException {

		Hpom.BcomFinanceProgram(); 

	}
	
	
	
	@Test(priority = 44)
	public void BcomHonours() throws InterruptedException {

		Hpom.BcomHonoursPrograms(); 

	}
	


	@Test(priority = 45)
	public void MCAPrograms() throws InterruptedException {
		Hpom.MCANormalPrograms();
	}
	
	
	@Test(priority = 46)
	public void MCABlockchain() throws InterruptedException {
		Hpom.MCAwithspecializationinBlockchainprogram();
	}
	
	@Test(priority = 47)
	public void MCAwithspecializationinMLandAl() throws InterruptedException {
		Hpom.MCAwithspecializationinMLandAlprogram();
	}
	
	@Test(priority = 48)
	public void MCAwithspecializationinMachineLearning() throws InterruptedException {
		Hpom.MCAwithspecializationinMachineLearningProgram();
	}
	
	@Test(priority = 49)
	public void MCAwithspecializationinARandVR() throws InterruptedException {
		Hpom.MCAwithspecializationinARandVRProgram();
	}
	
	
	@Test(priority = 50)
	public void MasterofBusinessAdministration() throws InterruptedException {
		Hpom.MasterofBusinessAdministrationProgram();
	}
	
	@Test(priority = 51)
	public void MBAwithspecializationinDigitalMarketingManagement() throws InterruptedException {
		Hpom.MBAwithspecializationinDigitalMarketingManagementProgram();
	}
	
	
	@Test(priority = 52)
	public void MBAwithspecializationinHRAnalytics() throws InterruptedException {
		Hpom.MBAwithspecializationinHRAnalyticsProgram();
	}
	
	@Test(priority = 53)
	public void MBAwithspecializationinDataScience() throws InterruptedException {
		Hpom.MBAwithspecializationinDataScienceProgram();
	}
	
	@Test(priority = 54)
	public void MBAwithspecializationinBusinessAnalytics() throws InterruptedException {
		Hpom.MBAwithspecializationinBusinessAnalyticsProgram();
	}
	
	
	@Test(priority = 55)
	public void MBAwithspecializationinDigitalEntrepreneurship() throws InterruptedException {
		Hpom.MBAwithspecializationinDigitalEntrepreneurshipprogranm();
	}
	
	@Test(priority = 56)
	public void MasterofArtsJournalismandMasscommunication() throws InterruptedException {
		Hpom.MasterofArtsJournalismandMasscommunicationProgram();
	}
	
	
	@Test(priority = 57)
	public void MComwithspecializationinFintech() throws InterruptedException {
		Hpom.MComwithspecializationinFintechProgram();
	}
	
	@Test(priority = 58)
	public void MComwithspecializationinFinancialManagement() throws InterruptedException {
		Hpom.MComwithspecializationinFinancialManagementProgram();
	}
	
	
	@Test(priority = 59)
	public void MasterofArtsinPublicPolicyandGovernance() throws InterruptedException {
		Hpom.MasterofArtsinPublicPolicyandGovernanceProgram();
	}
	
	@Test(priority = 60)
	public void MasterofArtsinPsychology() throws InterruptedException {
		Hpom.MasterofArtsinPsychologyProgran();
	}
	
	
	
	@Test(priority = 61)
	public void MasterofScienceinDataScience() throws InterruptedException {
		Hpom.MasterofScienceinDataScienceProgram();
	}
	
	
	
	

	@Test (priority = 62)
	public void Printprograms() throws InterruptedException {
		Hpom.PrintprogramsList();


	}  



	@AfterMethod

	public void CloseBrowser() {
		driver.quit();
	}



}

