package HomePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POM.HomePagePOM;


public class HomePage_FunctionalTest {

	WebDriver driver;
	HomePagePOM Hpom;


	@BeforeMethod
	public void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AmityWebsite_Beta\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://amityonline.com/");
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
	public void CareerServices() {
		Hpom.CareerServicesHeaderButton();

	}


	@Test(priority = 4)
	public void AdvantagesButton(){
		Hpom.AdvantagesHeaderButton();

	}

	@Test(priority = 5)
	public void SearchButton() {
		Hpom.SearchHeaderButton();

	}

	@Test(priority = 6)
	public void CallusButton() throws InterruptedException{
		Hpom.CallusHeaderButton();

	} 

	@Test(priority = 7)
	public void StudentLoginButoon() throws InterruptedException{
		Hpom.SearchLoginHeaderButoon();



	}

	@Test(priority = 8)
	public void EnrollNowButton() {
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
	public void UGProgram() throws InterruptedException {

		Hpom.UGProgramList(); 

	}


	@Test(priority = 32)
	public void PGPrograms() throws InterruptedException {
		Hpom.PGProgramlist();
	}


	@Test (priority = 33)
	public void Printprograms() throws InterruptedException {
		Hpom.PrintprogramsList();


	}



	@AfterMethod

	public void CloseBrowser() {
		driver.quit();
	}



}

