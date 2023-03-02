package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create web driver installation
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
        //open website
        driver.get("https://www.amazon.com/");
        //get all the links
        //links are in <a> also called anchor tag
        //lets use locator by tagname
        List<WebElement> tags=driver.findElements(By.tagName("a"));
//in order to print
        //we need iterator
        for(WebElement tag:tags){
           String link= tag.getAttribute("href");
            System.out.println(link);
        }
    }
}
