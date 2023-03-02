package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
       WebElement checkBoxSelected = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
       boolean selected =checkBoxSelected.isSelected();

        System.out.println("Checkbox is selected : "+selected);
        if(!selected){
            checkBoxSelected.click();
        }
        selected=checkBoxSelected.isSelected();
        System.out.println("Checkbox is selected : "+selected);

    }
}
