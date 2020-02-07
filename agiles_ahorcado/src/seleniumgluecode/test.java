package seleniumgluecode;
//import java.util.concurrent.TimeUnit;

//import javax.servlet.http.HttpSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class test {
    public static WebDriver driver;
    @Given("^user is on gamepage$")
    public void user_is_on_homepage() throws Throwable {     
    	System.setProperty("webdriver.chrome.driver", "./externals/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/agiles_ahorcado/jotaesepe.jsp");
        //driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
        //driver.get("http://automationpractice.com/index.php");
    }
    
    @When("^user puts a right letter$")
    public void user_puts_a_right_letter() throws Throwable {
    	WebElement element = driver.findElement(By.name("letraIngresada"));
    	Thread.sleep(1000);
    	element.sendKeys("m");
    	Thread.sleep(1000);
    	element.submit();
    }
    
    @When("^user keeps putting right letters until the word is completed$")
    public void user_keeps_putting_right_letters() throws Throwable {
    	WebElement element1 = driver.findElement(By.name("letraIngresada"));
    	Thread.sleep(1000);
        element1.sendKeys("a");
        Thread.sleep(1000);
        element1.submit();
        WebElement element2 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element2.sendKeys("r");
        Thread.sleep(1000);
        element2.submit();
        WebElement element3 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element3.sendKeys("d");
        Thread.sleep(1000);
        element3.submit();
        WebElement element4 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element4.sendKeys("o");
        Thread.sleep(1000);
        element4.submit();
        WebElement element5 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element5.sendKeys("n");
        Thread.sleep(1000);
        element5.submit();   
    }
    
    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
    	String exp_message = "Juego Ganado";
    	//System.out.println("antes: "+driver.findElement(By.name("juegoGanado")));
    	WebElement element = driver.findElement(By.name("juegoGanado"));
        Assert.assertEquals(exp_message, element.getText());
        //driver.quit();  
    }    
    
    @When("^user puts a wrong letter$")
    public void user_puts_a_wrong_letter() throws Throwable {
    	WebElement element = driver.findElement(By.name("letraIngresada"));
    	Thread.sleep(1000);
    	element.sendKeys("e");
    	Thread.sleep(1000);
    	element.submit();
    }
    
    @When("^user keeps putting wrong letters until lose$")
    public void user_keeps_putting_wrong_letters() throws Throwable {
    	WebElement element1 = driver.findElement(By.name("letraIngresada"));
    	Thread.sleep(1000);
        element1.sendKeys("u");
        Thread.sleep(1000);
        element1.submit();
        WebElement element2 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element2.sendKeys("i");
        Thread.sleep(1000);
        element2.submit();
        WebElement element3 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element3.sendKeys("s");
        Thread.sleep(1000);
        element3.submit();
        WebElement element4 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element4.sendKeys("t");
        Thread.sleep(1000);
        element4.submit();
        WebElement element5 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element5.sendKeys("l");
        Thread.sleep(1000);
        element5.submit();   
    }
    
    @Then("^failed message is displayed$")
    public void failed_message_is_displayed() throws Throwable {
    	String exp_message = "Juego Perdido";
    	//System.out.println("antes: "+driver.findElement(By.name("juegoGanado")));
    	WebElement element = driver.findElement(By.name("juegoGanado"));
        Assert.assertEquals(exp_message, element.getText());
        //driver.quit();  
    }
    
    @When("^user puts right and wrong letters until the word is completed$")
    public void user_puts_right_and_wrong_letters_until_win() throws Throwable {
    	WebElement element1 = driver.findElement(By.name("letraIngresada"));
    	Thread.sleep(1000);
        element1.sendKeys("u");
        Thread.sleep(1000);
        element1.submit();
        WebElement element6 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element6.sendKeys("m");
        Thread.sleep(1000);
        element6.submit(); 
        WebElement element7 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element7.sendKeys("a");
        Thread.sleep(1000);
        element7.submit(); 
        WebElement element2 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element2.sendKeys("i");
        Thread.sleep(1000);
        element2.submit();
        WebElement element3 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element3.sendKeys("s");
        Thread.sleep(1000);
        element3.submit();
        WebElement element8 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element8.sendKeys("r");
        Thread.sleep(1000);
        element8.submit(); 
        WebElement element4 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element4.sendKeys("t");
        Thread.sleep(1000);
        element4.submit();
        WebElement element5 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element5.sendKeys("d");
        Thread.sleep(1000);
        element5.submit(); 
        WebElement element9 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element9.sendKeys("l");
        Thread.sleep(1000);
        element9.submit();  
        WebElement element10 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element10.sendKeys("o");
        Thread.sleep(1000);
        element10.submit(); 
        WebElement element11 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element11.sendKeys("n");
        Thread.sleep(1000);
        element11.submit(); 
    }
    
    @When("^user puts right and wrong letters until lose$")
    public void user_puts_right_and_wrong_letters_until_lose() throws Throwable {
    	WebElement element1 = driver.findElement(By.name("letraIngresada"));
    	Thread.sleep(1000);
        element1.sendKeys("u");
        Thread.sleep(1000);
        element1.submit();
        WebElement element6 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element6.sendKeys("m");
        Thread.sleep(1000);
        element6.submit(); 
        WebElement element7 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element7.sendKeys("a");
        Thread.sleep(1000);
        element7.submit(); 
        WebElement element2 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element2.sendKeys("i");
        Thread.sleep(1000);
        element2.submit();
        WebElement element3 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element3.sendKeys("s");
        Thread.sleep(1000);
        element3.submit();
        WebElement element8 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element8.sendKeys("r");
        Thread.sleep(1000);
        element8.submit(); 
        WebElement element4 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element4.sendKeys("t");
        Thread.sleep(1000);
        element4.submit();
        WebElement element5 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element5.sendKeys("d");
        Thread.sleep(1000);
        element5.submit(); 
        WebElement element9 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element9.sendKeys("l");
        Thread.sleep(1000);
        element9.submit();  
        WebElement element10 = driver.findElement(By.name("letraIngresada"));
        Thread.sleep(1000);
        element10.sendKeys("e");
        Thread.sleep(1000);
        element10.submit();   
    }
}