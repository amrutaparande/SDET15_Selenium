package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //tell your proj where the wed driver is located
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        //create an instance of the webdriver
        WebDriver driver=new ChromeDriver();
        //open the website on google.com
        driver.get("http://www.uitestpractice.com/Students/Switchto");
    //switch to the iframe which conmtains the input box
        //method:by index
        driver.switchTo().frame(0);
        WebElement textBox= driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("abcdefgh");
        //get the txt click on from parent window
        driver.switchTo().defaultContent();
        //find the text
        WebElement text= driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());
        //get the text "Enter name " in an iframe
        //we need to switch to iframe1
        driver.switchTo().frame("iframe_a");
      WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("The label is "+getLabel.getText());
//switch to main page
        driver.switchTo().defaultContent();
        //Method 3 to switch
        //clear teaxt from the text box
        WebElement frame1= driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();
        Thread.sleep(1000);
    }
}
