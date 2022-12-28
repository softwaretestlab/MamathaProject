package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static WebDriver driver;
    public static void NavToWeb(String url) {
        WebDriverManager.chromedriver().setup();
        //this below line will open chrome browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to a website
        driver.get(url);
    }
    public static void CloseBrowser(){
        driver.close();
    }
    public static void QuitDriver(){
        driver.quit();
    }

}