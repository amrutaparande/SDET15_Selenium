package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL
*/

public class XpathHw {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

       WebElement message = driver.findElement(By.xpath("//input[@id='user-message']"));
       message.sendKeys("Enter two values a & b");
       Thread.sleep(1000);

       driver.findElement(By.xpath("// button[contains(@onclick,'showInput')]")).click();
       Thread.sleep(1000);

       driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("20");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("30");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[text()='Get Total']")).click();

        String totalSum = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
        System.out.println("Sum of two numbers a & b is "+totalSum);







    }
}
