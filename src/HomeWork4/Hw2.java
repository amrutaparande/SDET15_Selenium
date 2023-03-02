package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
       List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[class='cb1-element']"));
       for(WebElement checkB : checkBoxes){
           String option= checkB.getAttribute("value");
           if(option.equalsIgnoreCase("option-4")){
               checkB.click();
           }
       }




    }
}
