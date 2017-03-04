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

public class Questions
{

    public static WebElement pquestions(WebDriver driver) throws InterruptedException
    {

        WebElement askQ = driver.findElement(By.xpath("//a[@data-action='ask-question']"));
        highlightElement.highLightElement(driver, askQ);
        askQ.click();


        Actions act = new Actions(driver);

        act.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

        WebElement title = driver.findElement(By.xpath("//input[@id='question-title']"));
        highlightElement.highLightElement(driver, title);
        title.click();
        title.sendKeys("What you think about Education in India ?");

        WebElement ds = driver.findElement(By.xpath("//input[@id='question-title']"));
        highlightElement.highLightElement(driver, ds);
        ds.click();
        ds.sendKeys(Keys.TAB);


        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement desc = driver.findElement(By.xpath("//iframe[@id='question-description_ifr']"));
        highlightElement.highLightElement(driver, desc);
        desc.click();
        desc.sendKeys("Education in India");


        WebElement topics = driver.findElement(By.xpath("//input[@placeholder='Topics (example: DU, learning, philosophy)']"));
        highlightElement.highLightElement(driver, topics);
        topics.click();
        topics.sendKeys("education");

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        driver.findElement(By.xpath("html/body/div[3]/div/div/form/div[1]/div[2]/ul/li[1]/a")).click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        Error.Qerror(driver);

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        return null;



    }
}
