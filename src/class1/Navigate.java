package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        //connect to webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// intiate the instance
        WebDriver driver= new ChromeDriver();
        // open google
        driver.get("https://www.google.com/");
        //navigate to facebook
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        //slow down
        Thread.sleep(2000);
        //goto facebook
        driver.navigate().forward();
        Thread.sleep(2000);


    }
}
