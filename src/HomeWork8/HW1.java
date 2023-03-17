package HomeWork8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

username=Admin
password=Hum@nhrm123

2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it

make sure that ur code is dynamic i.e
changing the id doesnt effect the logic or xpath
*/
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
       username.sendKeys("Admin");
       WebElement password = driver.findElement(By.xpath(" //input[@name='txtPassword']"));
       password.sendKeys("Hum@nhrm123");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
        List <WebElement> checkBox = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for(int i=0;i<checkBox.size();i++){
            String empId = checkBox.get(i).getText();
            if(empId.equalsIgnoreCase("52387A")){
             WebElement checkIt = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
           checkIt.click();
            }
        }




    }
}
