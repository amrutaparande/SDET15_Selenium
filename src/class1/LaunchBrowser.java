package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //tell your proj where the wed driver is located
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        //create an instance of the webdriver
         WebDriver driver=new ChromeDriver();
         //open the website on google.com
       driver.get("https://www.facebook.com/");
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        //get the title of the webpage
        String title= driver.getTitle();
        //print the title of the page
        System.out.println("the title of the page is "+title);
        //slow down for 3 seconds
        Thread.sleep(3000);
        //close the browser
        driver.quit();

    }
}
