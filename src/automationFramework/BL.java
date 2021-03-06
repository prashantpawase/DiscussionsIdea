package automationFramework;

/**
 * Created by prashant on 18/4/17.
 */



import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;



public class BL
{

    private WebDriver driver;
    private int invalidLinksCount;

    @BeforeClass
    public void setUp()
    {

        System.setProperty("webdriver.chrome.driver", "/home/edn/Git-Repo/External-Jars/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.navigate().to("http://www.edunuts.com");

        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        WebElement city = driver.findElement(By.xpath("//a[@data-url='delhi']"));
        city.click();
    }

    @Test
    public void validateInvalidLinks() {

        try {
            invalidLinksCount = 0;
            List<WebElement> anchorTagsList = driver.findElements(By
                    .tagName("a"));
            System.out.println("Total no. of links are "
                    + anchorTagsList.size());
            for (WebElement anchorTagElement : anchorTagsList) {
                if (anchorTagElement != null) {
                    String url = anchorTagElement.getAttribute("href");
                    if (url != null && !url.contains("javascript")) {
                        verifyURLStatus(url);
                    } else {
                        invalidLinksCount++;
                    }
                }
            }

            System.out.println("Total no. of invalid links are "
                    + invalidLinksCount);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    public void verifyURLStatus(String URL) {

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(URL);
        try {
            HttpResponse response = client.execute(request);
            // verifying response code and The HttpStatus should be 200 if not,
            // increment invalid link count
            ////We can also check for 404 status code like response.getStatusLine().getStatusCode() == 404
            if (response.getStatusLine().getStatusCode() != 200)
                invalidLinksCount++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}