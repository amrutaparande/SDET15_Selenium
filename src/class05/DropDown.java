package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       //  driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
WebElement dropDown= driver.findElement(By.xpath("//select[@id='select-demo']"));
//use selecet class
        Select sel=new Select(dropDown);
        //using select class we have option to select desire option
        //select by index
       sel.selectByIndex(2);
        Thread.sleep(2000);
        //select by value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        //select by visible text
        sel.selectByVisibleText("Friday");
        Thread.sleep(1000);
        sel.selectByVisibleText("Friday");

    }
}
