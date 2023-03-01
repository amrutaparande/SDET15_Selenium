package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create web driver installation
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
       //open website
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
  //find the username
   WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
    username.sendKeys("Tester");
    //find the password field
         WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
   password.sendKeys("test");
    //clear the username using method clear()
        username.clear();
        //clear the password
      //  password.clear();

        //to get text username
        WebElement usernameText= driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

//get the text password which is beside the password text box
        WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText = passwordText.getText();
        System.out.println(pasText);
    }
}