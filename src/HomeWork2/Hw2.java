package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
TIP for HW2:
just fill in text boxes or button, no  */
public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //send in username
        driver.findElement(By.id("email")).sendKeys("amruta");
        //send in password
        driver.findElement(By.name("pass")).sendKeys("Hello123");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_9_ht")).click();
        driver.quit();
        /*
        driver.findElement(By.name("firstname")).sendKeys("Amruta");
        driver.findElement(By.name("lastname")).sendKeys("Parande");
        driver.findElement(By.name("reg_email__")).sendKeys("amruta.parande09@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Hello123");
        driver.findElement(By.id("month")).sendKeys("Nov");
        driver.findElement(By.id("day")).sendKeys("9");
        driver.findElement(By.id("year")).sendKeys("1990");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();*/



    }

}
