package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance web driver
        WebDriver driver =new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //open up the website
        driver.manage().window().maximize();
        //send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
    //send password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
   //click on log in button
        driver.findElement(By.className("button")).click();
    }
}
