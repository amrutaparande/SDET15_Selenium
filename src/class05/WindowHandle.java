package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //  driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1492374120%3A1678243183395885&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfJ8GoGcJ9oEr26hqnlcvJhUyINF2Oudy8WALHZUdfSlaEwE5RgR4pYyJm93cne2dfRpCCdBQ#inbox");
        //click on button for simple alert
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        //get the handle of the parent window
      String parantWindowHandle=driver.getWindowHandle();
        System.out.println(parantWindowHandle);
        //get window handle of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles();
        //print all the window handles
        for(String wh: windowHandles){
            //SWITCH THE FOCUS TO THE DRIVER TO HELP WINDOW
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        //to verify we switched to the right window;
        System.out.println(driver.getTitle());
        driver.switchTo().window(parantWindowHandle);
    }
}
