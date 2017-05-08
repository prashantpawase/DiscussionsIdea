package pageObjects;

/**
 * Created by prashant on 4/3/17.
 */



        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;

        import ErrorMsg.Error;
        import highlight.highlightElement;

        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class Answers
{

    public static WebElement panswers(WebDriver driver)
    {

        try {
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

         /*   WebElement Wans = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-action='answer-question']")));
*/

            WebElement Wans = driver.findElement(By.xpath("//a[@data-action='answer-question']"));
            Wans.click();


            Actions actt = new Actions(driver);

            actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

         /*   WebElement ans = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='answer-description_ifr']")));
*/

            WebElement ans = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
            highlightElement.highLightElement(driver, ans);
            ans.click();
            ans.sendKeys("");

          /*  WebElement verify = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='answer-description_ifr']")));
*/

            WebElement verify = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
            System.out.println(verify.getText());


            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            Error.Aerror(driver);

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        }
        catch(Exception e)
        {
            System.out.println("");
        }

        try {
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

         /*   WebElement Wans = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-action='answer-question']")));
*/

           WebElement Wans = driver.findElement(By.xpath("//a[@data-action='answer-question']"));
            Wans.click();


            Actions actt = new Actions(driver);

            actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

         /*   WebElement ans = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='answer-description_ifr']")));
*/

            WebElement ans = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
            highlightElement.highLightElement(driver, ans);
            ans.click();
            ans.sendKeys("Indian Education is good at certain points");

           /* WebElement verify = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='answer-description_ifr']")));
*/
            WebElement verify = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
            System.out.println(verify.getText());


            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            Error.Aerror(driver);

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        }
        catch(Exception e)
        {
            System.out.println("");
        }


        return null;
    }

}

