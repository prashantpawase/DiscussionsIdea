package automationFramework;

/**
 * Created by edn on 6/5/17.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class MEMU
{
    static DesiredCapabilities  capabilities;
    static String DeviceName;
    public static void main(String[] args)
    {

//  DeviceName = "Google Nexus 5";
//  DeviceName = "Samsung Galaxy S4";
//  DeviceName = "Samsung Galaxy Note 3";

        DeviceName = "Apple iPhone 5";


        System.setProperty("webdriver.chrome.driver", "/home/edn/Git-Repo/External-Jars/chromedriver");


        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", DeviceName);

        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);

        capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        WebDriver driver = new ChromeDriver(capabilities);

        driver.manage().window().maximize();
        driver.navigate().to("http://www.edunuts.com");

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement city = driver.findElement(By.xpath("//a[@data-url='delhi']"));
        city.click();

    }

}