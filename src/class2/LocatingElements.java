package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance web driver
        WebDriver driver =new ChromeDriver();
        //open fb.com
        driver.get("https://www.facebook.com/");
        //send in username
        driver.findElement(By.id("email")).sendKeys("amu");
        //send in password
        driver.findElement(By.name("pass")).sendKeys("Welcome");
        //create on button new account
      //  driver.findElement(By.linkText("Create new account")).click();
//create a click on forgotten password
      driver.findElement(By.partialLinkText("Forgot password?")).click();
driver.quit();
    }
}
