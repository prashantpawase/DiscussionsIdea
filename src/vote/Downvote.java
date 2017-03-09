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

public class Downvote
{

    public static WebElement pDownvote(WebDriver driver)
    {


try {

    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


  //  WebElement downvote = (new WebDriverWait(driver,10))
   //         .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class='fa fa-thumbs-down']")));

    WebElement downvote = driver.findElement(By.xpath("//i[@class='fa fa-thumbs-down']"));
    downvote.click();

    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


  //  WebElement downvoteC = (new WebDriverWait(driver,10))
   //         .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='vote-counter']")));


    WebElement downvoteC = driver.findElement(By.xpath("//span[@class='vote-counter']"));
    System.out.println("\033[32;1;2mDownVote\033[0m --->" + downvoteC.getText());

    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
catch (Exception e)
{
    System.out.println("");
}


        return null;

    }



}
