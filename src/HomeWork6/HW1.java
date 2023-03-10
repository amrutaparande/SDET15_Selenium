package HomeWork6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.Verify that the text "Hello World!" is now displayed on the page */
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
        driver.get(" https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement start= driver.findElement(By.xpath("//button"));
        start.click();
        WebElement finish= driver.findElement(By.xpath("//div[@id='finish']"));
        finish.click();
        WebElement printing= driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));

        System.out.println("Text message displayed on page is "+ printing.getText());


    }
}
