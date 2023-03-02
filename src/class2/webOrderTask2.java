package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*/**
 * Task
 * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
 * Login
 * Get title and verify it is correct
 * logout
 * close the browser
 */
public class webOrderTask2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance web driver
        WebDriver driver =new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //open up the website
        driver.manage().window().maximize();
        //user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
   //password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
    // login
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        //verify the title is "Web Orders"
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The title is correct");
        }
        else{
            System.out.println("the title is incorrect");
        }
        //logout
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(5000);

        //close the browser
        driver.quit();

    }
    }

