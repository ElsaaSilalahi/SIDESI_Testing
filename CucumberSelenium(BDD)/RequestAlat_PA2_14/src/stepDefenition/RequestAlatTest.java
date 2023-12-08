package stepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RequestAlatTest {

	/*
	 * ============================================================================
	 * -----------------------------Request Alat---------------------------------
	 * ============================================================================
	 */

//	==================================== Variasi 5 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}\
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("15"); // melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // valid
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 6 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // valid
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tanggal peminjaman merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 7 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys("1"); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // valid
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("04/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================
	
//	==================================== Variasi 8 ===========================================
	
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
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("mariasimanungkalit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Mariakalit123");
//	}
//
//	@Then("^I can login succesfully$")
//	public void I_can_login_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div[2]/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
//	}
//
//	@And("^I click layanan pustaka$")
//	public void I_click_layanan_pustaka() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
//	}
//	@And("^I click menu Pertanian$")
//	public void I_click_menu_Pertanian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a")).click();
//	}
//
//	@And("^I click menu pinjam alat pertanian$")
//	public void I_click_menu_pinjam_alat_pertanian() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/ul/li[2]/a")).click();
//	}
//	@And("^I click button pinjam$")
//	public void I_click_button_pinjam() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div[2]/div[1]/div/div/div/div[2]/ul/div/a")).click();
//	}
//	@And ("^I enter jumlah alat$")
//	public void I_enter_jumlah_alat() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.id("jumlah")).sendKeys(""); // tidak mengisi input jumah, atau melebihi stok alat yang ada
//	}
//	@Then("^I enter tanggal peminjaman$")
//	public void I_enter_tanggal_peminjaman() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_peminjaman\"]")).sendKeys("02/09/2023"); // tidak mengisi input tanggal peminjaman, atau tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I enter tanggal pengembalian$")
//	public void I_enter_tanggal_pengembalian() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tanggal_pemulangan\"]")).sendKeys("02/10/2023"); // tanggal pengembalian merupakan tanggal hari lampau dan hari ini
//	}
//	@Then("^I can tambah barang succesfully$")
//	public void I_can_tambah_barang_succesfully() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[4]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/button")).click();
//	}
	
//=====================================================================================================================================	
	
	/*
	 * ============================================================================
	 * ----------------------------- Request Alat ---------------------------------
	 * ============================================================================
	 */
}
