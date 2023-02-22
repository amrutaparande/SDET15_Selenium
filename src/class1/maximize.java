package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {
        // connect to the webdriver
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    //create an instance of Webdriver
        WebDriver driver=new ChromeDriver();
        //goto google.com
        driver.get("https://www.google.com/");
        //class1.maximize the window
        driver.manage().window().maximize();
        //fullscreen
        driver.manage().window().fullscreen();
        //close
        driver.close();
    }
}
