package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

//click on radio button
        WebElement femaleBtn = driver.findElement(By.cssSelector("input[value='Female']"));
        //check if the radio button is enabled
        boolean isEnabledFemale = femaleBtn.isEnabled();
        System.out.println("the radio button is enabled " + isEnabledFemale);

        //check is the radio button is displayed
         boolean isDisplayedFemale = femaleBtn.isDisplayed();
        System.out.println("Displayed "+isDisplayedFemale);
        boolean isSelectedFemale = femaleBtn.isSelected();
        System.out.println("Selected? "+isSelectedFemale);
        //if the radio button is not selected click on it
        if(!isSelectedFemale) {
            femaleBtn.click();
        }
        //check if it is selected or not
        isSelectedFemale=femaleBtn.isSelected();
        System.out.println("Selected now? "+isSelectedFemale);

    }

}
