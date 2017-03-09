package vote;

/**
 * Created by prashant on 9/3/17.
 */



import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Upvote
{

    public static WebElement pUpvote(WebDriver driver)
    {

        try {

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


            WebElement upvote = driver.findElement(By.xpath("//i[@class='fa fa-thumbs-o-up']"));
            upvote.click();

            driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

       //     WebElement upvoteC = (new WebDriverWait(driver,10))
       //             .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='vote-counter']")));

              WebElement upvoteC = driver.findElement(By.xpath("//span[@class='vote-counter']"));
            System.out.println("\033[32;1;2mUpVote\033[0m --->" + upvoteC.getText());

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        }
        catch(Exception e)
        {
            System.out.println("");
        }


        return null;

    }



}
