package SeleniumLearning;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {

    @Test
    public void Navigation() throws IOException {
//        //Chromedriver setup
//        WebDriverManager.chromedriver().setup();
//        //this below line will open chrome browser
//        WebDriver driver = new ChromeDriver();
//        //maximize browser
//        driver.manage().window().maximize();
//        //navigate to a website
//        driver.get("https://www.thegoodguys.com.au/");

        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGhomePage"));
        //implicit wait
        //if it takes more than 20sec , test case will fail and
        //we see pageloadtimeout error message
        OpenBrowser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //get title of the page
        String AcutalTitle = OpenBrowser.driver.getTitle();
        System.out.println("AcutalTitle : "+AcutalTitle);
        String ExpectedTitle="The Good Guys - Online Electrical & Home Appliances";
        //Assertion version-1
        Assert.assertEquals(ExpectedTitle,AcutalTitle);
        //Assertion version-2
        Assert.assertTrue(AcutalTitle.contains("Electrical"));
        //screenshot
        File screenshotFile = ((TakesScreenshot)OpenBrowser.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"\\src\\test\\java\\screenshots\\capture-1.jpeg"));

    }

}
