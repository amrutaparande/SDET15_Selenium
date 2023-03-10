package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        WebElement createNewButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewButton.click();
        //sleep



        //fill in the first name
        WebElement firstname =driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("Amruta");
        //fill in the last name
        //  WebElement  =driver.findElement(By.cssSelector("input[name='firstname']"));
        //firstname.sendKeys("");

    }
}