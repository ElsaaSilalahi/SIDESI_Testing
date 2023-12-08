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

public class TambahBarang {	
WebDriver driver; 
	
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
//
//	}
//
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//	
//	}
//	
//	@And("^I click Alat Tani$")
//	public void I_click_Tani() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//		
//	}
//	@And("^I click button tambah$")
//	public void I_click_button_tambah() throws Throwable {
//
//		driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//	}
//	
//	@When("^I enter valid nama$")
//	public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//		driver.findElement(By.id("nama")).sendKeys("pompa");
//		
//	}
//	
//	@And ("^I enter jumlah$")
//	public void I_enter_jumlah() throws Throwable {
//		driver.findElement(By.id("jumlah")).sendKeys("10");
//
//		
//	}
//	@And ("^I enter gambar$")
//	public void I_enter_gambar() throws Throwable {
//		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//		fileInput.sendKeys("C:\\laragon\\www\\SIDESI_PA2\\public\\assets\\images\\about\\a1.jpg");
//		
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//	}
//}


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Alat Penyiang Gulma");
//	
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\Alat penyiang gulma.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//
//}
//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Drum air");
//	
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("12");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\drum air.jpeg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}



//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Pengukur suhu");
//	
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("4");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\ukur-ph-tanah.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}

//
//

//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Pengukur suhu");
//	
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("4");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\ukur-ph-tanah.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//	}
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Alat Pemangkas");
//	
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("2");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\Alat pemangkas.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//
//}

//


//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("16");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\mesin panen.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//
//}

//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\Alat penyiang gulma.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//
//}
//
//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("12");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\drum air.jpeg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//
//
//}

//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("1");
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\pengendali hama.jpg");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("10");	
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//

//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//
//

//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("alat pemangkas");
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\Alat pemangkas.jpg");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}



//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Pengukur suhu");
//	
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("4");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\ukur-ph-tanah.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Alat penyiang gulma");
//	
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("4");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\Alat penyiang gulma.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//


//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Drum air");
//	
//}
//
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("4");
//
//	
//}
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\drum air.jpeg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//



//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Mesin panen");
//	
//}
//
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\mesin panen.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//


//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("mesin pemipil jagung");
//	
//}
//
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\mesin pemipil jagung.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//


//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("mesin pengembur tanah");
//	
//}
//
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\pengembur tanah.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//


//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("mesin pengendali hama");
//	
//}
//
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\pengendali hama.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//

//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("mesin pengupas kopi");
//	
//}
//
//@And ("^I enter gambar$")
//public void I_enter_gambar() throws Throwable {
//	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"avatar\"]"));
//	fileInput.sendKeys("D:\\SEMESTER 4\\PKPL\\BDD\\gambar\\pengupas kopi.jpg");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Alat pemangkas");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}



//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("mesin pemipil jagung");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("pencacah ruput");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}


//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("pengembur tanah");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("pengendali hama");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("pengering biji");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//	
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("penggulung jerami");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("pengering biji");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}
 
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("pompa irigasi");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("ukur-ph-tanah");
//	
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("Alat pemangkas");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("1");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("drum air");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("3");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("gembor air");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("4");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("mesin padi");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("5");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("mesin panen");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("6");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}


//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("mesin pemipil jagung");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("7");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}


//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("pengering biji");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("11");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}



//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("penggulung jerami");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("12");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("pengupas kopi");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("14");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}

//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//
//@When("^I enter valid nama$")
//public void I_enter_valid_nama_jumlah__and_gambar() throws Throwable {
//	driver.findElement(By.id("nama")).sendKeys("pompa irigasi");
//	
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("15");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}


//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("1");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}


//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("2");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("3");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("4");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	

//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("5");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	

//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("7");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("8");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("9");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	
//




//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	
//


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("11");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	
//


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("12");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	
//


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("13");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	
//


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("14");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("password");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//}
//
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[12]/a")).click();
//}
//
//@And("^I click Alat Tani$")
//public void I_click_Tani() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"tables\"]/ul/li[1]/a")).click();
//}
//@And("^I click button tambah$")
//public void I_click_button_tambah() throws Throwable {
//	driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[1]/span/a")).click();
//}
//@And ("^I enter jumlah$")
//public void I_enter_jumlah() throws Throwable {
//	driver.findElement(By.id("jumlah")).sendKeys("15");
//
//}
//
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
//}
//}	
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//@And ("^I enter jumlah alat$")
//public void I_enter_jumlah_alat() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.id("jumlah")).sendKeys("15");
//}
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("02/10/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	

//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//@And ("^I enter jumlah alat$")
//public void I_enter_jumlah_alat() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//}
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/10/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/11/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	
//


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//@And ("^I enter jumlah alat$")
//public void I_enter_jumlah_alat() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//}
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/10/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/11/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	
//


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//@And ("^I enter jumlah alat$")
//public void I_enter_jumlah_alat() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//}
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/10/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/11/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	
//


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//@And ("^I enter jumlah alat$")
//public void I_enter_jumlah_alat() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//}
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/10/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/11/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	
//


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//@And ("^I enter jumlah alat$")
//public void I_enter_jumlah_alat() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//}
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/10/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/11/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	
//



//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//@And ("^I enter jumlah alat$")
//public void I_enter_jumlah_alat() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//}
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/10/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/11/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	
//


//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//@And ("^I enter jumlah alat$")
//public void I_enter_jumlah_alat() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//}
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/10/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/11/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	
//



//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//@And ("^I enter jumlah alat$")
//public void I_enter_jumlah_alat() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.id("jumlah")).sendKeys("10");
//}
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/10/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/11/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	
//

//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/10/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/11/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	

//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	



//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	



//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	



//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	



//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("04/05/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("11/05/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	



//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("09/09/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/03/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	



//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	



//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	



//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}	


//
//
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");	
//	
//}
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//	driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//}
//
//@Then("^I can login succesfully$")
//public void I_can_login_succesfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//	Thread.sleep(2000);
//}
//@And("^I click layanan pustaka$")
//public void I_click_layanan_pustaka() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//}
//@And("^I click menu Pertanian$")
//public void I_click_menu_Pertanian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//}
//
//@And("^I click menu pinjam alat pertanian$")
//public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//}
//@And("^I click button pinjam$")
//public void I_click_button_pinjam() throws Throwable {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//}
//
//@Then("^I enter tanggal peminjaman$")
//public void I_enter_tanggal_peminjaman() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("03/06/2023");
//}
//@Then("^I enter tanggal pengembalian$")
//public void I_enter_tanggal_pengembalian() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("10/04/2023");
//}
//@Then("^I can tambah barang succesfully$")
//public void I_can_tambah_barang_succesfully() throws Throwable {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//}
//}
}


