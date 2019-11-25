package seleniummmmmm;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2Example  {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/agiles_ahorcado/jotaesepe.jsp");
        WebElement element = driver.findElement(By.name("letraIngresada"));
        driver.manage().timeouts().implicitlyWait(1000000000, TimeUnit.SECONDS);
        element.sendKeys("m");
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        element.submit();
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        WebElement element1 = driver.findElement(By.name("letraIngresada"));
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        element1.sendKeys("a");
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        element1.submit();
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        WebElement element2 = driver.findElement(By.name("letraIngresada"));
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element2.sendKeys("r");
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element2.submit();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement element3 = driver.findElement(By.name("letraIngresada"));
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element3.sendKeys("d");
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element3.submit();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement element4 = driver.findElement(By.name("letraIngresada"));
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element4.sendKeys("o");
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element4.submit();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement element5 = driver.findElement(By.name("letraIngresada"));
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element5.sendKeys("n");
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element5.submit();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.quit();
    }
}