package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancellationAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //  driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        //click on button for simple alert
driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
//use switchTo
        Alert alert= driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
      //click on the prompt alert button
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        //switch focus to alert
        alert .sendKeys("abcdefg");
        Thread.sleep(1000);
        //accept it
        alert.accept();
        Thread.sleep(2000);

    }
}
