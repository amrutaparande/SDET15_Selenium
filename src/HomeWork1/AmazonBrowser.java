package HomeWork1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrowser {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

    }

}
