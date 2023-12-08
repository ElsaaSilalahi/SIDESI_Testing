package stepDefinition;

import org.openqa.selenium.Dimension;
import java.io.Serializable;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginRegisterTest {
	/*
	 * ============================================================================
	 * -----------------------------Login Test ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Scenario 1---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 1---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(3000);
//	}
//	
//	@And("^I click menu layanan pustaka$")
//	public void I_click_menu_layanan_pustaka() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]")).click();
//		Thread.sleep(2000);
//	}
//	
//	@And("^I click pertanian$")
//	public void I_click_pertanian() throws Throwable {
//		driver.findElement(By.xpath("/html/body/section/header/div[2]/div/div/div[2]/nav/div/ul/li[4]/ul/li[3]/a")).click();
//		Thread.sleep(2000);
//	}
//	
//	@And("^I click pinjam alat pertanian$")
//	public void I_click_pinjam_alat_pertanian() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]")).click();
//		Thread.sleep(2000);
//	}
	
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom2(WebElement element) throws Throwable { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 Thread.sleep(2000);
//	}
//	
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) throws Throwable { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 Thread.sleep(2000);
//	} http://127.0.0.1:8000/show_barang/1
//	
//	@Given("^I access button pinjam$")
//	public void I_access_button_pinjam() throws Throwable {
//		driver.get("http://127.0.0.1:8000/show_barang/1");	
//		Thread.sleep(3000);
//	}
//	
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) throws Throwable { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 Thread.sleep(2000);
//	}
//	
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom2(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollDown = arguments[0].scrollHeight", element); 
////	 Thread.sleep(2000);
//	}
//	
//	@And("^I enter inputan pinjam alat$")
//	public void I_enter_inputan_pinjam_alat() throws Throwable {
//		driver.findElement(By.id("jumlah")).sendKeys("1");
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[3]/input")).sendKeys("2023-06-04");
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[4]/input")).sendKeys("2023-06-06");
//	}
	
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		driver.findElement(By.xpath("	/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div")).click();
//	}
	
//	/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a
//	/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div
//	/html/body/section/div[4]/div/div/section[2]/div[1]/div/a
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 2---------------------------------
	 * ============================================================================
	 */
//	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("password");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 3---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("kristina@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("kristina123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 4---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("samuelsibuea@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sibueapunya13");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 5---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("kristina@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("kristina123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 6---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("siskamaria@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("siskakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 7---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("elsasilalahi@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("elsapunya12");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 8---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("jetrosipahutar@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipahutarjetro");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 9---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("josuasipahutar@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("josua123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 10---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("angelmanurung@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("angelica123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 11---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yessisipahutar@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipahutareci");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 12---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("hiskiaparhusip@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("hiskiamantul");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 13---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("exxon@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipahutarexxon");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 14---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yohanatambunan@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("siskakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 15---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("nancy@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("nancypunya");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 16---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mesya@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("mesyaangelica123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 17---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("juanmunthe@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("munthejuan");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 18---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("estersinaga@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sinagapunya");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 19---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("amandas@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("amandasimbolon123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 20---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("siosiahaan@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sio2023");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 21---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariagiawa@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("mariakece");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 22---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("dafnejuntak@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("dafnepunya");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 23---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("suandika@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("suandikanapit");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 24---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("Maryono@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("titisandewa");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 25---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("renovagltm@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("itsreno4");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Scenario 1---------------------------------
	 * ============================================================================
	 */

//	=======================================================================================================================================

	/*
	 * ============================================================================
	 * -----------------------------Scenario 2---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 1---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yosevyns@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("arepin");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 2---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("pss");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 3---------------------------------
	 * ============================================================================
	 */
//	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("kristina@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("krist3");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 4---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("samuelsibuea@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sibueaya13");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 5---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("kristina@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("krisa123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 6---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("siskamaria@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("siskait123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 7---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("elsasilalahi@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("elsapa12");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 8---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("jetrosipahutar@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("siprjetro");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 9---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("josuasipahutar@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("jua123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 10---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("angelmanurung@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("angea123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 11---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yessisipahutar@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipaareci");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 12---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("hiskiaparhusip@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("hiskantul");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 13---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("exxon@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sitarexxon");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 14---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yohanatambunan@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("siskit123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 15---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("nancy@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("nancya");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 16---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mesya@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("mesyaaica123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 17---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("juanmunthe@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("muntan");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 18---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("estersinaga@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sinanya");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 19---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("amandas@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("amanmbolon123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 20---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("siosiahaan@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sio3");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 21---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariagiawa@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("akece");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 22---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("dafnejuntak@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("dafne");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 23---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("suandika@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("dikanapit");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 24---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("Maryono@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sandewa");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 25---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("renovagltm@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("reno4");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Login---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Scenario 2---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Scenario 3---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 1---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yosevyy@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipahutarepin");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 2---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("adminmin@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("password");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 3---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("kristinaana@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("kristina123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 4---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("muelbuea@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sibueapunya13");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 5---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("kristin@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("kristina123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 6---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("siskaria@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("siskakalit123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 7---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("elsasilala@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("elsapunya12");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 8---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("jetrosipahut@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipahutarjetro");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 9---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("josuafsd@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("josua123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 10---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("angelnurung@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("angelica123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 11---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yesiipahutar@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipahutareci");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 12---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("hisaparhusip@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("hiskiamantul");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 13---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("exxxoon@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipahutarexxon");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 14---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yohanabunan@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("siskakalit123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 15---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("nancefey@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("nancypunya");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 16---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("megfda@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("mesyaangelica123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 17---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("juannthe@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("munthejuan");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 18---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("estersa@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sinagapunya");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 19---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("amas@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("amandasimbolon123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 20---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("sosaan@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sio2023");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 21---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariawa@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("mariakece");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 22---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("dfnejuak@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("dafnepunya");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 23---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("suhka@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("suandikanapit");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 24---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("Mano@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("titisandewa");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 25---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_invalid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("renagltm@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("itsreno4");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Scenario 3---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Scenario 4---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 1---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yosyy@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("hutarepin");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 2---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("adminmin@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("paword");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 3---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("kristinaana@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("kria123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 4---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("muelbuea@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sibueya13");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 5---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("kristin@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("krista23");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 6---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("siskaria@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sisalit123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 7---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("elsasilala@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("elpunya12");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 8---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("jetrosipahut@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipahutarje");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 9---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("josuafsd@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("jos123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 10---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("angelnurung@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("angeli23");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 11---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yesiipahutar@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("siutareci");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 12---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("hisaparhusip@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("hiskitul");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 13---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("exxxoon@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sipahutxon");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 14---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("yohanabunan@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("siskakal");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 15---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("nancefey@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("nanunya");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 16---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("megfda@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("mesyaaica123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 17---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("juannthe@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("munjuan");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 18---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("estersa@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sinagnya");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 19---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("amas@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("amandaslon123");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 20---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("sosaan@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sio23");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 21---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariawa@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("marece");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 22---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("dfnejuak@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("dafneya");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 23---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("suhka@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("suananapit");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 24---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//		
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("Mano@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("titandewa");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login 25---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");	
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("renagltm@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("iteno4");
//	}
//
//	@Then("^I can not login succesfully$")
//	public void I_can_not_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Login ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Scenario 4---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Login Test ---------------------------------
	 * ============================================================================
	 */

//	===========================================================================================================================

	/*
	 * ============================================================================
	 * -----------------------------Registrasi Test
	 * ---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration");		 
//	}
//
//	@When("^I enter valid namalengkap alamat username nohp email and password$")
//	public void I_enter_valid_namalengkap_alamat_username_nohp_email_and__password() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Sambo Sibuea");
//		driver.findElement(By.id("alamat")).sendKeys("Tarutung");
//		driver.findElement(By.id("username")).sendKeys("samboSibuea");
//		driver.findElement(By.id("nohp")).sendKeys("082132103749");
//		driver.findElement(By.id("email")).sendKeys("samuelsibuea@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sibueapunya13");
//	}
//
//	// Scroll to the element before clicking it
//	public void scrollElementToBottom(WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element);
//    }
//
//	@Then("^I click the submit button$")
//	public void I_click_the_submit_button() throws Throwable {
//		Thread.sleep(20000); // Delay of 2 seconds
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/form/div[7]/button")).click();
//		
//	}
	/*
	 * ============================================================================
	 * -----------------------------Register 4---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Register Test ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Register 1---------------------------------
	 * ============================================================================
	 */

	
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username nohp email and password$")
//	 public void I_enter_valid_namalengkap_alamat_username_nohp_email_and__password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Kristin Panjaitan");
//	 driver.findElement(By.id("alamat")).sendKeys("Tarutung");
//	 driver.findElement(By.id("username")).sendKeys("kristinpan");
//	 driver.findElement(By.id("nohp")).sendKeys("082132101912");
//	 driver.findElement(By.id("email")).sendKeys("kristin_pjtn@gmail.com");
//	 driver.findElement(By.id("password")).sendKeys("kristinPjtn"); }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can registrasi succesfully$") 
//	 public void I_can_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(10000); // Delay of 2 seconds
//	 driver.findElement(By.id("button_register")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Register 2---------------------------------
	 * ============================================================================
	 */
//			WebDriver driver;
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/registration");		 
//			}
//
//			@When("^I enter valid namalengkap alamat username nohp email and password$")
//			public void I_enter_valid_namalengkap_alamat_username_nohp_email_and__password() throws Throwable {
//				driver.findElement(By.id("namalengkap")).sendKeys("Sambo Sibuea");
//				driver.findElement(By.id("alamat")).sendKeys("Tarutung");
//				driver.findElement(By.id("username")).sendKeys("samboSibuea");
//				driver.findElement(By.id("nohp")).sendKeys("082132103749");
//				driver.findElement(By.id("email")).sendKeys("samuelsibuea@gmail.com");
//				driver.findElement(By.id("password")).sendKeys("sibueapunya13");
//			}
//
//			// Scroll to the element before clicking it
//			public void scrollElementToBottom(WebElement element) {
//		        JavascriptExecutor js = (JavascriptExecutor) driver;
//		        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element);
//		    }
//
//			@Then("^I click the submit button$")
//			public void I_click_the_submit_button() throws Throwable {
//				Thread.sleep(20000); // Delay of 2 seconds
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/form/div[7]/button")).click();	
//			}
	/*
	 * ============================================================================
	 * -----------------------------Register ---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Register 2---------------------------------
	 * ============================================================================
	 */

	
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username nohp email and password$")
//	 public void I_enter_valid_namalengkap_alamat_username_nohp_email_and__password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Kristin Panjaitan");
//	 driver.findElement(By.id("alamat")).sendKeys("Tarutung");
//	 driver.findElement(By.id("username")).sendKeys("kristinpan");
//	 driver.findElement(By.id("nohp")).sendKeys("082132101912");
//	 driver.findElement(By.id("email")).sendKeys("kristin_pjtn@gmail.com");
//	 driver.findElement(By.id("password")).sendKeys("kristinPjtn"); }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can registrasi succesfully$") 
//	 public void I_can_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(10000); // Delay of 2 seconds
//	 driver.findElement(By.id("button_register")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */

	/*
	 * ============================================================================
	 * -----------------------------Register 3---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username nohp email and invalid password$")
//	 public void I_enter_valid_namalengkap_alamat_username_nohp_email_and_invalid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Kris Panjaitan");
//	 driver.findElement(By.id("alamat")).sendKeys("Sipoholon");
//	 driver.findElement(By.id("username")).sendKeys("krisjt12");
//	 driver.findElement(By.id("nohp")).sendKeys("082132101912");
//	 driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
//	 driver.findElement(By.id("password")).sendKeys("2w"); }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(10000); // Delay of 2 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
		 
			/*
			 * ============================================================================
			 * -----------------------------Register 4---------------------------------
			 * ============================================================================
			 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username nohp email and invalid password$")
//	 public void I_enter_valid_namalengkap_alamat_username_nohp_email_and_invalid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Kris Panjaitan");
//	 driver.findElement(By.id("alamat")).sendKeys("Sipoholon");
//	 driver.findElement(By.id("username")).sendKeys("krisjt12");
//	 driver.findElement(By.id("nohp")).sendKeys("082132101912");
//	 driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
////	 driver.findElement(By.id("password")).sendKeys("2w"); 
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(10000); // Delay of 2 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

			/*
			 * ============================================================================
			 * -----------------------------Register---------------------------------
			 * ============================================================================
			 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 5---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username nohp invalid email and valid password$")
//	 public void I_enter_valid_namalengkap_alamat_username_nohp_invalid_email_and_valid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Kris Panjaitan");
//	 driver.findElement(By.id("alamat")).sendKeys("Sipoholon");
//	 driver.findElement(By.id("username")).sendKeys("krisjt12");
//	 driver.findElement(By.id("nohp")).sendKeys("082132101912");
//	 driver.findElement(By.id("email")).sendKeys("kristpjtngmail.com");
//	 driver.findElement(By.id("password")).sendKeys("Ajndfgh2w"); 
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(10000); // Delay of 2 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 6---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username nohp invalid email and valid password$")
//	 public void I_enter_valid_namalengkap_alamat_username_nohp_invalid_email_and_valid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Kris Panjaitan");
//	 driver.findElement(By.id("alamat")).sendKeys("Sipoholon");
//	 driver.findElement(By.id("username")).sendKeys("krisjt12");
//	 driver.findElement(By.id("nohp")).sendKeys("082132101912");
////	 driver.findElement(By.id("email")).sendKeys("kristpjtngmail.com");
//	 driver.findElement(By.id("password")).sendKeys("Ajndfgh2w"); 
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(10000); // Delay of 2 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 7---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username nohp email and password$")
//	 public void I_enter_valid_namalengkap_alamat_username_nohp_email_and__password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	 driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	 driver.findElement(By.id("username")).sendKeys("krisjt123");
//	 driver.findElement(By.id("nohp")).sendKeys("082132101912");
//	 driver.findElement(By.id("email")).sendKeys("kristpjtngmail.com");
//	 driver.findElement(By.id("password")).sendKeys("234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can registrasi succesfully$") 
//	 public void I_can_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(10000); // Delay of 10 seconds
//	 driver.findElement(By.id("button_register")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 8---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username nohp email and password$")
//	 public void I_enter_valid_namalengkap_alamat_username_nohp_email_and__password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	 driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	 driver.findElement(By.id("username")).sendKeys("krisjt123");
//	 driver.findElement(By.id("nohp")).sendKeys("082132101912");
////	 driver.findElement(By.id("email")).sendKeys("kristpjtngmail.com");
////	 driver.findElement(By.id("password")).sendKeys("234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can registrasi succesfully$") 
//	 public void I_can_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(10000); // Delay of 10 seconds
//	 driver.findElement(By.id("button_register")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 9---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid nama lengkap alamat username invalid nohp valid email and password$")
//	 public void I_enter_valid_nama_lengkap_alamat_username_invalid_nohp_valid_email_and_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Handrisna Panjaitan");
//	 driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	 driver.findElement(By.id("username")).sendKeys("Handkrisjt123");
//	 driver.findElement(By.id("nohp")).sendKeys("0821");
//	 driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
//	 driver.findElement(By.id("password")).sendKeys("Andrea234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("button_register")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 10---------------------------------
	 * ============================================================================
	 */
	
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid nama lengkap alamat username invalid nohp valid email and password$")
//	 public void I_enter_valid_nama_lengkap_alamat_username_invalid_nohp_valid_email_and_password() throws Throwable {
//		 driver.findElement(By.id("namalengkap")).sendKeys("Cinta Panjaitan");
//		 driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//		 driver.findElement(By.id("username")).sendKeys("Cintat123");
////		 driver.findElement(By.id("nohp")).sendKeys("0821");
//		 driver.findElement(By.id("email")).sendKeys("cintauligmail.com");
//		 driver.findElement(By.id("password")).sendKeys("Cinta234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable { 
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 11---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid nama lengkap alamat username invalid nohp email and invalid password$")
//	 public void I_enter_valid_nama_lengkap_alamat_username_invalid_nohp_email_and_invalid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
//	 driver.findElement(By.id("username")).sendKeys("krisjt123");
//	 driver.findElement(By.id("nohp")).sendKeys("082132");
//	 driver.findElement(By.id("email")).sendKeys("Andianjay@gmail.com");
//	 driver.findElement(By.id("password")).sendKeys("234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	 
		/*
		 * ============================================================================
		 * -----------------------------Register 12---------------------------------
		 * ============================================================================
		 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid nama lengkap alamat username invalid nohp email and invalid password$")
//	 public void I_enter_valid_nama_lengkap_alamat_username_invalid_nohp_email_and_invalid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
//	 driver.findElement(By.id("username")).sendKeys("krisjt123");
////	 driver.findElement(By.id("nohp")).sendKeys("082132");
//	 driver.findElement(By.id("email")).sendKeys("Andianjay@gmail.com");
////	 driver.findElement(By.id("password")).sendKeys("234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

		/*
		 * ============================================================================
		 * -----------------------------Register---------------------------------
		 * ============================================================================
		 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 13---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username invalid nohp invalid email and password$")
//	 public void I_enter_valid_namalengkap_alamat_username_invalid_nohp_invalid_email_and_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
//	 driver.findElement(By.id("username")).sendKeys("krisjt123");
//	 driver.findElement(By.id("nohp")).sendKeys("0821323");
//	 driver.findElement(By.id("email")).sendKeys("Andianjaygmail.com");
//	 driver.findElement(By.id("password")).sendKeys("Andikus234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 14---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username invalid nohp invalid email and password$")
//	 public void I_enter_valid_namalengkap_alamat_username_invalid_nohp_invalid_email_and_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
//	 driver.findElement(By.id("username")).sendKeys("krisjt123");
//	 driver.findElement(By.id("nohp")).sendKeys("0821323");
//	 driver.findElement(By.id("email")).sendKeys("Andianjaygmail.com");
//	 driver.findElement(By.id("password")).sendKeys("Andikus234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	 
		/*
		 * ============================================================================
		 * -----------------------------Register 15---------------------------------
		 * ============================================================================
		 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username invalid nohp invalid email and invalid password$")
//	 public void I_enter_valid_namalengkap_alamat_username_invalid_nohp_invalid_email_and_invalid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
//	 driver.findElement(By.id("username")).sendKeys("krisjt123");
//	 driver.findElement(By.id("nohp")).sendKeys("0821323");
//	 driver.findElement(By.id("email")).sendKeys("Andianjay@gmailcom");
//	 driver.findElement(By.id("password")).sendKeys("234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

		/*
		 * ============================================================================
		 * -----------------------------Register---------------------------------
		 * ============================================================================
		 */
		 
			/*
			 * ============================================================================
			 * -----------------------------Register 16---------------------------------
			 * ============================================================================
			 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat username invalid nohp invalid email and invalid password$")
//	 public void I_enter_valid_namalengkap_alamat_username_invalid_nohp_invalid_email_and_invalid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
//	 driver.findElement(By.id("username")).sendKeys("krisjt123");
////	 driver.findElement(By.id("nohp")).sendKeys("0821323");
////	 driver.findElement(By.id("email")).sendKeys("Andianjay@gmailcom");
////	 driver.findElement(By.id("password")).sendKeys("234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

			/*
			 * ============================================================================
			 * -----------------------------Register---------------------------------
			 * ============================================================================
			 */

	/*
	 * ============================================================================
	 * -----------------------------Register 17---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat invalid username nohp email and password$")
//	 public void I_enter_valid_namalengkap_alamat_invalid_username_nohp_email_and_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
//	 driver.findElement(By.id("username")).sendKeys("t123");
//	 driver.findElement(By.id("nohp")).sendKeys("082132312322");
//	 driver.findElement(By.id("email")).sendKeys("Andianjay@gmail.com");
//	 driver.findElement(By.id("password")).sendKeys("Andikus234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	
	/*
	 * ============================================================================
	 * -----------------------------Register 18---------------------------------
	 * ============================================================================
	 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(2000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat invalid username nohp email and password$")
//	 public void I_enter_valid_namalengkap_alamat_invalid_username_nohp_email_and_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
////	 driver.findElement(By.id("username")).sendKeys("t123");
//	 driver.findElement(By.id("nohp")).sendKeys("082132312322");
//	 driver.findElement(By.id("email")).sendKeys("Andianjay@gmail.com");
//	 driver.findElement(By.id("password")).sendKeys("Andikus234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */
	 
		/*
		 * ============================================================================
		 * -----------------------------Register 19---------------------------------
		 * ============================================================================
		 */
//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(3000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat invalid username nohp email and invalid password$")
//	 public void I_enter_valid_namalengkap_alamat_invalid_username_nohp_email_and_invalid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
//	 driver.findElement(By.id("username")).sendKeys("Ah123");
//	 driver.findElement(By.id("nohp")).sendKeys("082132312322");
//	 driver.findElement(By.id("email")).sendKeys("Andianjay@gmail.com");
//	 driver.findElement(By.id("password")).sendKeys("A234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

		/*
		 * ============================================================================
		 * -----------------------------Register---------------------------------
		 * ============================================================================
		 */

			/*
			 * ============================================================================
			 * -----------------------------Register 20---------------------------------
			 * ============================================================================
			 */

//	 WebDriver driver;
//	 
//	 @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	  
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	  
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 driver.get("http://127.0.0.1:8000/registration"); 
//	 Thread.sleep(3000); // Delay of 2 seconds
//	 }
//	 
//	 @When("^I enter valid namalengkap alamat invalid username nohp email and invalid password$")
//	 public void I_enter_valid_namalengkap_alamat_invalid_username_nohp_email_and_invalid_password() throws Throwable {
//	 driver.findElement(By.id("namalengkap")).sendKeys("Andi Kusuma");
//	 driver.findElement(By.id("alamat")).sendKeys("Jakarta");
//	 driver.findElement(By.id("username")).sendKeys("Ah123");
//	 driver.findElement(By.id("nohp")).sendKeys("082132312322");
//	 driver.findElement(By.id("email")).sendKeys("Andianjay@gmail.com");
//	 driver.findElement(By.id("password")).sendKeys("A234");
//	 }
//	 
//	 // Scroll to the element before clicking it public void
//	 public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	 }
//	 
//	 @Then("^I can not registrasi succesfully$") 
//	 public void I_can_not_registrasi_succesfully() throws Throwable {
//	 Thread.sleep(5000); // Delay of 10 seconds
//	 driver.findElement(By.id("register_button")).click();
//	}

			/*
			 * ============================================================================
			 * -----------------------------Register---------------------------------
			 * ============================================================================
			 */

	/*
	 * ============================================================================
	 * -----------------------------Register 21---------------------------------
	 * ============================================================================
	 */

//WebDriver driver;
//
//@Given("^open chrome and start application$") public void
//open_chrome_and_start_application() throws Throwable {
//
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver(); 
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/registration"); 
//Thread.sleep(3000); // Delay of 2 seconds
//}
//
//@When("^I enter registration input$")
//public void I_enter_registration_input() throws Throwable {
//driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//driver.findElement(By.id("username")).sendKeys("123");
//driver.findElement(By.id("nohp")).sendKeys("082109986785");
//driver.findElement(By.id("email")).sendKeys("kristpjtn@gmailcom");
//driver.findElement(By.id("password")).sendKeys("Agdfgdfh34");
//}
//		
//// Scroll to the element before clicking it public void
//public void scrollElementToBottom(WebElement element) { 
// JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//}
//
//@Then("^I can not registrasi succesfully$") 
//public void I_can_not_registrasi_succesfully() throws Throwable { 
//Thread.sleep(10000); // Delay of 10 seconds
//driver.findElement(By.id("register_button")).click();
//}

	/*
	 * ============================================================================
	 * -----------------------------Register---------------------------------
	 * ============================================================================
	 */

/*
 * ============================================================================
 * -----------------------------Register 22---------------------------------
 * ============================================================================
 */

//WebDriver driver;
//
//@Given("^open chrome and start application$") public void
//open_chrome_and_start_application() throws Throwable {
//
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver(); 
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/registration"); 
//Thread.sleep(3000); // Delay of 2 seconds
//}
//
//@When("^I enter registration input$")
//public void I_enter_registration_input() throws Throwable {
//driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
////driver.findElement(By.id("username")).sendKeys("123");
//driver.findElement(By.id("nohp")).sendKeys("082109986785");
////driver.findElement(By.id("email")).sendKeys("kristpjtn@gmailcom");
//driver.findElement(By.id("password")).sendKeys("Agdfgdfh34");
//}
//		
//// Scroll to the element before clicking it public void
//public void scrollElementToBottom(WebElement element) { 
// JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//}
//
//@Then("^I can not registrasi succesfully$") 
//public void I_can_not_registrasi_succesfully() throws Throwable { 
//Thread.sleep(10000); // Delay of 10 seconds
//driver.findElement(By.id("register_button")).click();
//}

/*
 * ============================================================================
 * -----------------------------Register---------------------------------
 * ============================================================================
 */

/*
 * ============================================================================
 * -----------------------------Register 23---------------------------------
 * ============================================================================
 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("123");
//	driver.findElement(By.id("nohp")).sendKeys("082109986785");
//	driver.findElement(By.id("email")).sendKeys("kristpjtn@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("A34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(10000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}


/*
 * ============================================================================
 * -----------------------------Register---------------------------------
 * ============================================================================
 */

/*
 * ============================================================================
 * -----------------------------Register 24---------------------------------
 * ============================================================================
 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
////	driver.findElement(By.id("username")).sendKeys("123");
//	driver.findElement(By.id("nohp")).sendKeys("082109986785");
////	driver.findElement(By.id("email")).sendKeys("kristpjtn@gmailcom");
////	driver.findElement(By.id("password")).sendKeys("A34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(10000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}

/*
 * ============================================================================
 * -----------------------------Register---------------------------------
 * ============================================================================
 */

/*
 * ============================================================================
 * -----------------------------Register 25---------------------------------
 * ============================================================================
 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("123");
//	driver.findElement(By.id("nohp")).sendKeys("0821099");
//	driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Adfgfdg34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(5000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}

/*
 * ============================================================================
 * -----------------------------Register---------------------------------
 * ============================================================================
 */

/*
 * ============================================================================
 * -----------------------------Register 26---------------------------------
 * ============================================================================
 */

	//WebDriver driver;
	//
	//@Given("^open chrome and start application$") public void
	//open_chrome_and_start_application() throws Throwable {
	//
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	//
	//driver = new ChromeDriver(); 
	//driver.manage().window().maximize();
	//driver.get("http://127.0.0.1:8000/registration"); 
	//Thread.sleep(3000); // Delay of 2 seconds
	//}
	//
	//@When("^I enter registration input$")
	//public void I_enter_registration_input() throws Throwable {
	//driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
	////driver.findElement(By.id("username")).sendKeys("123");
	////driver.findElement(By.id("nohp")).sendKeys("082109986785");
	//driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
	//driver.findElement(By.id("password")).sendKeys("Ajbsdhfds34");
	//}
//			
	//// Scroll to the element before clicking it public void
	//public void scrollElementToBottom(WebElement element) { 
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
	//}
	//
	//@Then("^I can not registrasi succesfully$") 
	//public void I_can_not_registrasi_succesfully() throws Throwable { 
	//Thread.sleep(5000); // Delay of 10 seconds
	//driver.findElement(By.id("register_button")).click();
	//}

/*
 * ============================================================================
 * -----------------------------Register---------------------------------
 * ============================================================================
 */

/*
 * ============================================================================
 * -----------------------------Register 27---------------------------------
 * ============================================================================
 */

	//WebDriver driver;
	//
	//@Given("^open chrome and start application$") public void
	//open_chrome_and_start_application() throws Throwable {
	//
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	//
	//driver = new ChromeDriver(); 
	//driver.manage().window().maximize();
	//driver.get("http://127.0.0.1:8000/registration"); 
	//Thread.sleep(3000); // Delay of 2 seconds
	//}
	//
	//@When("^I enter registration input$")
	//public void I_enter_registration_input() throws Throwable {
	//driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
	//driver.findElement(By.id("username")).sendKeys("123");
	//driver.findElement(By.id("nohp")).sendKeys("08210");
	//driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
	//driver.findElement(By.id("password")).sendKeys("A34");
	//}
//			
	//// Scroll to the element before clicking it public void
	//public void scrollElementToBottom(WebElement element) { 
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
	//}
	//
	//@Then("^I can not registrasi succesfully$") 
	//public void I_can_not_registrasi_succesfully() throws Throwable { 
	//Thread.sleep(5000); // Delay of 10 seconds
	//driver.findElement(By.id("register_button")).click();
	//}

/*
 * ============================================================================
 * -----------------------------Register---------------------------------
 * ============================================================================
 */


/*
 * ============================================================================
 * -----------------------------Register 28---------------------------------
 * ============================================================================
 */

	//WebDriver driver;
	//
	//@Given("^open chrome and start application$") public void
	//open_chrome_and_start_application() throws Throwable {
	//
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	//
	//driver = new ChromeDriver(); 
	//driver.manage().window().maximize();
	//driver.get("http://127.0.0.1:8000/registration"); 
	//Thread.sleep(3000); // Delay of 2 seconds
	//}
	//
	//@When("^I enter registration input$")
	//public void I_enter_registration_input() throws Throwable {
	//driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
	////driver.findElement(By.id("username")).sendKeys("123");
	////driver.findElement(By.id("nohp")).sendKeys("082109986785");
	//driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
	////driver.findElement(By.id("password")).sendKeys("A34");
	//}
//			
	//// Scroll to the element before clicking it public void
	//public void scrollElementToBottom(WebElement element) { 
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
	//}
	//
	//@Then("^I can not registrasi succesfully$") 
	//public void I_can_not_registrasi_succesfully() throws Throwable { 
	//Thread.sleep(10000); // Delay of 10 seconds
	//driver.findElement(By.id("register_button")).click();
	//}

/*
 * ============================================================================
 * -----------------------------Register---------------------------------
 * ============================================================================
 */
	

/*
 * ============================================================================
 * -----------------------------Register 29---------------------------------
 * ============================================================================
 */

	//WebDriver driver;
	//
	//@Given("^open chrome and start application$") public void
	//open_chrome_and_start_application() throws Throwable {
	//
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	//
	//driver = new ChromeDriver(); 
	//driver.manage().window().maximize();
	//driver.get("http://127.0.0.1:8000/registration"); 
	//Thread.sleep(3000); // Delay of 2 seconds
	//}
	//
	//@When("^I enter registration input$")
	//public void I_enter_registration_input() throws Throwable {
	//driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
	//driver.findElement(By.id("username")).sendKeys("123");
	//driver.findElement(By.id("nohp")).sendKeys("0821785");
	//driver.findElement(By.id("email")).sendKeys("kristpjtn@gmailcom");
	//driver.findElement(By.id("password")).sendKeys("Akjbgv34");
	//}
//			
	//// Scroll to the element before clicking it public void
	//public void scrollElementToBottom(WebElement element) { 
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
	//}
	//
	//@Then("^I can not registrasi succesfully$") 
	//public void I_can_not_registrasi_succesfully() throws Throwable { 
	//Thread.sleep(10000); // Delay of 10 seconds
	//driver.findElement(By.id("register_button")).click();
	//}

/*
 * ============================================================================
 * -----------------------------Register---------------------------------
 * ============================================================================
 */
	

/*
 * ============================================================================
 * -----------------------------Register 30---------------------------------
 * ============================================================================
 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	//driver.findElement(By.id("username")).sendKeys("123");
//	//driver.findElement(By.id("nohp")).sendKeys("082109986785");
//	//driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(10000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 31---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
	//	
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
	//	
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	//	
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
	//	
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//		driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//		driver.findElement(By.id("username")).sendKeys("123");
//		driver.findElement(By.id("nohp")).sendKeys("082105");
//		driver.findElement(By.id("email")).sendKeys("kristpjtn@gmailcom");
//		driver.findElement(By.id("password")).sendKeys("Am34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
	//	
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(10000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}

	/*
	 * ============================================================================
	 * -----------------------------Register 32---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
//		
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
//		
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//		driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//		//driver.findElement(By.id("username")).sendKeys("123");
//		//driver.findElement(By.id("nohp")).sendKeys("082109986785");
//		//driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
//		//driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
//		
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(7000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}

	/*
	 * ============================================================================
	 * -----------------------------Register 33---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
//		
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
//		
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//		driver.findElement(By.id("alamat")).sendKeys("35");
//		driver.findElement(By.id("username")).sendKeys("Krintina123");
//		driver.findElement(By.id("nohp")).sendKeys("082109986785");
//		driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
//		
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(10000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}

	/*
	 * ============================================================================
	 * -----------------------------Register 34---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
//		
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
//		
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Kristina Panjaitan");
//		//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//		driver.findElement(By.id("username")).sendKeys("Kristcount1");
//		driver.findElement(By.id("nohp")).sendKeys("082109986785");
//		driver.findElement(By.id("email")).sendKeys("kristinapjt@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Kristina34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
//		
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(10000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}

	/*
	 * ============================================================================
	 * -----------------------------Register 35---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
//		
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
//		
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
////		driver.findElement(By.id("alamat")).sendKeys("%");
//		driver.findElement(By.id("username")).sendKeys("Krinaa123");
//		driver.findElement(By.id("nohp")).sendKeys("082109986785");
//		driver.findElement(By.id("email")).sendKeys("kristinapjt@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("A34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
//		
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(7000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}

	/*
	 * ============================================================================
	 * -----------------------------Register 36---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
//		
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
//		
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//		//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//		driver.findElement(By.id("username")).sendKeys("Abdfgb123");
//		driver.findElement(By.id("nohp")).sendKeys("082109986785");
//		driver.findElement(By.id("email")).sendKeys("kristpj@gmail.com");
//		//driver.findElement(By.id("password")).sendKeys("A34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
//		
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(10000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}


	/*
	 * ============================================================================
	 * -----------------------------Register 37---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
//		
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
//		
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Kristina Panjaitan");
//		driver.findElement(By.id("alamat")).sendKeys(" ");
//		driver.findElement(By.id("username")).sendKeys("Kristinaa123");
//		driver.findElement(By.id("nohp")).sendKeys("082109986785");
//		driver.findElement(By.id("email")).sendKeys("kristinaa@gmailcom");
//		driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
//		
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(7000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}

	/*
	 * ============================================================================
	 * -----------------------------Register 38---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
	//	
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
	//	
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	//	
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
	//	
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//		//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//		driver.findElement(By.id("username")).sendKeys("Akrisnaa123");
//		driver.findElement(By.id("nohp")).sendKeys("082109986785");
//		//driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
	//	
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(10000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}


	/*
	 * ============================================================================
	 * -----------------------------Register 39---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
//		
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
//		
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//		driver.findElement(By.id("alamat")).sendKeys(" ");
//		driver.findElement(By.id("username")).sendKeys("Kristinaa13");
//		driver.findElement(By.id("nohp")).sendKeys("082109986785");
//		driver.findElement(By.id("email")).sendKeys("kristinaa@gmailcom");
//		driver.findElement(By.id("password")).sendKeys("m34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
//		
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(10000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}

	/*
	 * ============================================================================
	 * -----------------------------Register 40---------------------------------
	 * ============================================================================
	 */

//		WebDriver driver;
//		
//		@Given("^open chrome and start application$") public void
//		open_chrome_and_start_application() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/registration"); 
//		Thread.sleep(3000); // Delay of 2 seconds
//		}
//		
//		@When("^I enter registration input$")
//		public void I_enter_registration_input() throws Throwable {
//		driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//		//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//		driver.findElement(By.id("username")).sendKeys("Krisnaa123");
//		driver.findElement(By.id("nohp")).sendKeys("082109986785");
//		//driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
//		//driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//		}
//				
//		// Scroll to the element before clicking it public void
//		public void scrollElementToBottom(WebElement element) { 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//		}
//		
//		@Then("^I can not registrasi succesfully$") 
//		public void I_can_not_registrasi_succesfully() throws Throwable { 
//		Thread.sleep(10000); // Delay of 10 seconds
//		driver.findElement(By.id("register_button")).click();
//		}

	/*
	 * ============================================================================
	 * -----------------------------Register 41---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("a123");
//	driver.findElement(By.id("nohp")).sendKeys("0821095");
//	driver.findElement(By.id("email")).sendKeys("Kristin@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(5000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	

	/*
	 * ============================================================================
	 * -----------------------------Register 42---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Kristina Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Krisnaa123");
//	driver.findElement(By.id("nohp")).sendKeys("0821095");
//	driver.findElement(By.id("email")).sendKeys("kristina@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Am34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	

	/*
	 * ============================================================================
	 * -----------------------------Register 43---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Kristinaa123");
//	driver.findElement(By.id("nohp")).sendKeys("08210");
//	driver.findElement(By.id("email")).sendKeys("kristpjtn@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	

	/*
	 * ============================================================================
	 * -----------------------------Register 44---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Krisnaa123");
//	driver.findElement(By.id("nohp")).sendKeys("0821095");
//	driver.findElement(By.id("email")).sendKeys("kristpjtn@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Ak4");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(7000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	

	/*
	 * ============================================================================
	 * -----------------------------Register 45---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("K123");
//	driver.findElement(By.id("nohp")).sendKeys("082109986785");
//	driver.findElement(By.id("email")).sendKeys("kristinaa@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	

	/*
	 * ============================================================================
	 * -----------------------------Register 46---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Kr23");
//	driver.findElement(By.id("nohp")).sendKeys("082109986785");
//	driver.findElement(By.id("email")).sendKeys("kristpjtn@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("km34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	

	/*
	 * ============================================================================
	 * -----------------------------Register 47---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Kristina Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Kr23");
//	driver.findElement(By.id("nohp")).sendKeys("082109986785");
//	driver.findElement(By.id("email")).sendKeys("kristpjtn@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Akbgvgkm34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	

	/*
	 * ============================================================================
	 * -----------------------------Register 48---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Krisn");
//	driver.findElement(By.id("nohp")).sendKeys("082109986785");
//	driver.findElement(By.id("email")).sendKeys("kristinaa@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Akbg4");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register 49---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Kristina Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Kr13");
//	driver.findElement(By.id("nohp")).sendKeys("0810995");
//	driver.findElement(By.id("email")).sendKeys("kristinaa@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Akmghhb34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}

	/*
	 * ============================================================================
	 * -----------------------------Register 51---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Kr123");
//	driver.findElement(By.id("nohp")).sendKeys("08285");
//	driver.findElement(By.id("email")).sendKeys("kristinaa@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Amjbsdfhbd34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 52---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	//driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Kg123");
//	driver.findElement(By.id("nohp")).sendKeys("08285");
//	driver.findElement(By.id("email")).sendKeys("kristinaa@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Am34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Register 53---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Kri");
//	driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Kristina123");
//	driver.findElement(By.id("nohp")).sendKeys("082853567889");
//	driver.findElement(By.id("email")).sendKeys("kristin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Kristin34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Register 54---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Kristin56");
//	driver.findElement(By.id("nohp")).sendKeys("082856698745");
//	driver.findElement(By.id("email")).sendKeys("kristins@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("A!34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(7000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 55---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Krisna Panjaitan");
//	driver.findElement(By.id("alamat")).sendKeys("Siborong-borong");
//	driver.findElement(By.id("username")).sendKeys("Kristina56");
//	driver.findElement(By.id("nohp")).sendKeys("082856691230");
//	driver.findElement(By.id("email")).sendKeys("kristinaa@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Kristins34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(7000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 56---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("1");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsasllhi123");
//	driver.findElement(By.id("nohp")).sendKeys("082856691290");
//	driver.findElement(By.id("email")).sendKeys("kristinaa@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Am34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 57---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("12");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsasllhi");
//	driver.findElement(By.id("nohp")).sendKeys("08285");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsacute34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(7000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 58---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsasllhi");
//	driver.findElement(By.id("nohp")).sendKeys("082845");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Am34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(7000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 59---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsasllhi");
//	driver.findElement(By.id("nohp")).sendKeys("082845");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsacute34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 60---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsasllhi");
//	driver.findElement(By.id("nohp")).sendKeys("082845");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("E34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(7000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 61---------------------------------
	 * ============================================================================
	 */

//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("082845546786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsacute34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(7000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 62---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("082845546786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Ee34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}	
	
	/*
	 * ============================================================================
	 * -----------------------------Register 63---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("E12");
//	driver.findElement(By.id("nohp")).sendKeys("082845546786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 64---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("082845546786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Ee34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 65---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("0828");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsacute34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 66---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("082886");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("ye34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 67---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("0826");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsacute34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 68---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
//	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("082886");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("El34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 69---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsacute12");
//	driver.findElement(By.id("nohp")).sendKeys("082845546786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsacute34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 70---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsasllhi12");
//	driver.findElement(By.id("nohp")).sendKeys("082845546786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("E34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 71---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsacute12");
//	driver.findElement(By.id("nohp")).sendKeys("082845546786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 72---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsacute12");
//	driver.findElement(By.id("nohp")).sendKeys("082845546786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("El34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 73---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsacute12");
//	driver.findElement(By.id("nohp")).sendKeys("08286");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 74---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsacute12");
//	driver.findElement(By.id("nohp")).sendKeys("0826");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Ehi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 75---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsacute12");
//	driver.findElement(By.id("nohp")).sendKeys("082786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 76---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsacute12");
//	driver.findElement(By.id("nohp")).sendKeys("082786");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Ehi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 77---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("El2");
//	driver.findElement(By.id("nohp")).sendKeys("082678894565");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsalss34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 78---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Ele12");
//	driver.findElement(By.id("nohp")).sendKeys("082678894565");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("lsa34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 79---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("lsa12");
//	driver.findElement(By.id("nohp")).sendKeys("082678894565");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("sllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 80---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Elsacute12");
//	driver.findElement(By.id("nohp")).sendKeys("06");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 81---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("Ee12");
//	driver.findElement(By.id("nohp")).sendKeys("06");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	
	/*
	 * ============================================================================
	 * -----------------------------Register 82---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
////	driver.findElement(By.id("username")).sendKeys("Ee12");
////	driver.findElement(By.id("nohp")).sendKeys("06");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	
	/*
	 * ============================================================================
	 * -----------------------------Register 83---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("122335");
//	driver.findElement(By.id("nohp")).sendKeys("wedsf");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 84---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("adsfdfdg");
//	driver.findElement(By.id("nohp")).sendKeys("1232545658678798");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Register 85---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("Elsa Cute");
////	driver.findElement(By.id("alamat")).sendKeys("Adian Baja");
//	driver.findElement(By.id("username")).sendKeys("@#!#$!");
//	driver.findElement(By.id("nohp")).sendKeys("!@#$%^7");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Register 86---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("E");
//	driver.findElement(By.id("alamat")).sendKeys("A");
//	driver.findElement(By.id("username")).sendKeys("El2");
//	driver.findElement(By.id("nohp")).sendKeys("06");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("E34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 87---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("");
//	driver.findElement(By.id("alamat")).sendKeys("");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("06");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("!!");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Register 88---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("");
////	driver.findElement(By.id("alamat")).sendKeys("");
////	driver.findElement(By.id("username")).sendKeys("12");
////	driver.findElement(By.id("nohp")).sendKeys("06");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
////	driver.findElement(By.id("password")).sendKeys("!!");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 89---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("");
////	driver.findElement(By.id("alamat")).sendKeys("");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("06");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
////	driver.findElement(By.id("password")).sendKeys("!!");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 90---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("");
////	driver.findElement(By.id("alamat")).sendKeys("");
//	driver.findElement(By.id("username")).sendKeys("12");
//	driver.findElement(By.id("nohp")).sendKeys("!@#");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("AKU2");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Register 91---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("    ");
//	driver.findElement(By.id("alamat")).sendKeys("");
//	driver.findElement(By.id("username")).sendKeys("El12");
//	driver.findElement(By.id("nohp")).sendKeys("06");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	/*
	 * ============================================================================
	 * -----------------------------Register 92---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("    ");
//	driver.findElement(By.id("alamat")).sendKeys("");
//	driver.findElement(By.id("username")).sendKeys("ElISA");
//	driver.findElement(By.id("nohp")).sendKeys("06534645747");
//	driver.findElement(By.id("email")).sendKeys("elsasllhigmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 93---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("    ");
//	driver.findElement(By.id("alamat")).sendKeys("");
//	driver.findElement(By.id("username")).sendKeys("ElA");
//	driver.findElement(By.id("nohp")).sendKeys("065347");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 94---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys(" ");
//	driver.findElement(By.id("alamat")).sendKeys("  ");
//	driver.findElement(By.id("username")).sendKeys("ETDA");
//	driver.findElement(By.id("nohp")).sendKeys("06534354weer7");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 95---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys(" ");
////	driver.findElement(By.id("alamat")).sendKeys("  ");
////	driver.findElement(By.id("username")).sendKeys("ETDA");
////	driver.findElement(By.id("nohp")).sendKeys("06534354weer7");
////	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Elsasllhi34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 96---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys(" ");
//	driver.findElement(By.id("alamat")).sendKeys("  ");
//	driver.findElement(By.id("username")).sendKeys("	");
//	driver.findElement(By.id("nohp")).sendKeys("	");
//	driver.findElement(By.id("email")).sendKeys("	");
//	driver.findElement(By.id("password")).sendKeys("	");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	/*
	 * ============================================================================
	 * -----------------------------Register 97---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("@ ");
//	driver.findElement(By.id("alamat")).sendKeys(" as ");
//	driver.findElement(By.id("username")).sendKeys("we2");
//	driver.findElement(By.id("nohp")).sendKeys("w2");
//	driver.findElement(By.id("email")).sendKeys("dsfjndf@.com");
//	driver.findElement(By.id("password")).sendKeys("sda");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	
	/*
	 * ============================================================================
	 * -----------------------------Register 98---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("    ");
//	driver.findElement(By.id("alamat")).sendKeys("");
//	driver.findElement(By.id("username")).sendKeys("ElA2");
//	driver.findElement(By.id("nohp")).sendKeys("06534647");
//	driver.findElement(By.id("email")).sendKeys("elsasllhigmailcom");
//	driver.findElement(By.id("password")).sendKeys("Eli34");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	
	/*
	 * ============================================================================
	 * -----------------------------Register 99---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
//	driver.findElement(By.id("namalengkap")).sendKeys("");
//	driver.findElement(By.id("alamat")).sendKeys("");
//	driver.findElement(By.id("username")).sendKeys("ElA");
//	driver.findElement(By.id("nohp")).sendKeys("0653747");
//	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
//	driver.findElement(By.id("password")).sendKeys("Els4");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
	
	/*
	 * ============================================================================
	 * -----------------------------Register 100---------------------------------
	 * ============================================================================
	 */
	
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$") public void
//	open_chrome_and_start_application() throws Throwable {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/registration"); 
//	Thread.sleep(3000); // Delay of 2 seconds
//	}
//	
//	@When("^I enter registration input$")
//	public void I_enter_registration_input() throws Throwable {
////	driver.findElement(By.id("namalengkap")).sendKeys("");
////	driver.findElement(By.id("alamat")).sendKeys("");
////	driver.findElement(By.id("username")).sendKeys("ElA");
////	driver.findElement(By.id("nohp")).sendKeys("0653747");
////	driver.findElement(By.id("email")).sendKeys("elsasllhi@gmailcom");
////	driver.findElement(By.id("password")).sendKeys("Els4");
//	}
//			
//	// Scroll to the element before clicking it public void
//	public void scrollElementToBottom(WebElement element) { 
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element); 
//	}
//	
//	@Then("^I can not registrasi succesfully$") 
//	public void I_can_not_registrasi_succesfully() throws Throwable { 
//	Thread.sleep(3000); // Delay of 10 seconds
//	driver.findElement(By.id("register_button")).click();
//	}
	
/*
 * ============================================================================
 * -----------------------------Register---------------------------------
 * ============================================================================
 */
	

}
	
	




