package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SigninGmailSteps {

	public static WebDriver driver;

	@Given("Browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@And("User is on Signin page")
	public void user_is_on_signin_page() {

		driver.navigate().to("https://accounts.google.com/");
	}

	@When("user enters username")
	public void user_enters_username_and_password() {

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gunjalv1800@gmail.com");
		// EnterText(lEmailID, EmailID);
	}

	@And("Click on email next button")
	public void click_on_Emailnext_button() {

		driver.findElement(By.xpath(" //*[@id=\"identifierNext\"]/div/button")).click();
	}

	@Then("user enters password")
	public void user_enters_password() throws InterruptedException {

		Thread.sleep(3000);
		// EnterText(lPassword, Password);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gunjalvarsha@123");
		Thread.sleep(2000);

	}

	@And("Click on password next button")
	public void click_on_next2_button() {

		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
	}

	@Then("User Signin Successfully")
	public void user_clicked_on_view_apps_and_gmail() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("successfully signin ");
	}

	@Given("homepage is open")
	public void homepage_is_open() {

		driver.navigate().to("https://mail.google.com/mail/");
		System.out.println("User is on HomePage");

	}

	@And("User click on compose button")
	public void user_click_on_compose_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		Thread.sleep(2000);
		System.out.println("user click on Compose button");
	}

	@Then("New Message window will open")
	public void new_message_window_will_open() {

		System.out.println("New Message window will open");
	}

	@And("User will enter Email Id in To option")
	public void user_will_enter_email_in_to_option() throws InterruptedException {

		Thread.sleep(4000);
		// driver.findElement(By.xpath("//textarea[@id=':93']"));
		// System.out.println("To option is displayed");
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("vrsh1339@gmail.com");

//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//textarea[@id=':94']"));
//		System.out.println("Cc option is displayed");
//
//		driver.findElement(By.xpath("//textarea[@id=':95']"));
//		System.out.println("Bcc option is displayed");
//
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys("Message");
		;
		System.out.println("SubjectBox is displayed");

	}

	@Then("user writes mail in Emailbody")
	public void user_writes_mail_in_emailbody() {

		driver.findElement(By.xpath("//div[@class='Ar Au']")).sendKeys("Hello Good Morning...PFA,");
	}

	@Then("User send that mail")
	public void user_send_that_mail() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3 T-I-JW']")).click();
		System.out.println("Mail successfully Sent..");
	}

}