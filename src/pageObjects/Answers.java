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

public class Answers
{

    public static WebElement panswers(WebDriver driver)
    {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement Wans = driver.findElement(By.xpath("//a[@data-action='answer-question']"));
        Wans.click();


        Actions actt = new Actions(driver);

        actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement ans = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
        highlightElement.highLightElement(driver, ans);
        ans.click();
        ans.sendKeys("Indian Education is good at certain points");

        WebElement verify = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
        System.out.println(verify.getText());


        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        Error.Aerror(driver);

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        return null;
    }

}

