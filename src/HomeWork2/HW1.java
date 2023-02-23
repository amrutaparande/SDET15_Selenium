package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser */
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Amruta");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Parande");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.address.street")).sendKeys("1020 Glenwood way");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Denver");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.address.state")).sendKeys("Colorado");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("800203");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("3004567890");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.ssn")).sendKeys("789789789789");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.username")).sendKeys("amrutaparande");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.password")).sendKeys("Hello123");
        Thread.sleep(3000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("Hello123");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);

        driver.quit();



    }
}
