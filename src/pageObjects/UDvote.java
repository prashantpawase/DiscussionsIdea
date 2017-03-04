package pageObjects;

/**
 * Created by prashant on 4/3/17.
 */



        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

public class UDvote
{

    public static WebElement pUDvote(WebDriver driver)
    {

    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    WebElement upvote = driver.findElement(By.xpath("//i[@class='fa fa-thumbs-o-up']"));
    upvote.click();

    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    WebElement upvoteC = driver.findElement(By.xpath("//span[@class='vote-counter']"));
    System.out.println(upvoteC.getText());

    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);




    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    WebElement downvote = driver.findElement(By.xpath("//i[@class='fa fa-thumbs-down']"));
    downvote.click();

    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    WebElement downvoteC = driver.findElement(By.xpath("//span[@class='vote-counter']"));
    System.out.println(downvoteC.getText());

    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        return null;

    }



}
