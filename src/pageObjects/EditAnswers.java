package pageObjects;

/**
 * Created by prashant on 4/3/17.
 */



        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

        import ErrorMsg.Error;
        import highlight.highlightElement;

public class EditAnswers
{

    public static WebElement peditanswers(WebDriver driver)
    {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement EdtA = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-edit']"));
        highlightElement.highLightElement(driver, EdtA);
        EdtA.click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement Ans = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
        highlightElement.highLightElement(driver, Ans);
        Ans.click();
        Ans.sendKeys(Keys.CONTROL + "a");
        Ans.sendKeys(Keys.DELETE);
        Ans.sendKeys("Testing Answer Editing For Questions in Discussions");


        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        Error.editAerror(driver);

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        return null;

    }

}
