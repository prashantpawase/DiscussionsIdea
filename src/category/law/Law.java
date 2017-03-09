package category.law;

/**
 * Created by prashant on 8/3/17.
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import highlight.highlightElement;

public class Law
{

    public static WebElement law(WebDriver driver) throws InterruptedException
    {

        driver.manage().timeouts().implicitlyWait(50 , TimeUnit.SECONDS);


        WebElement Law = driver.findElement(By.xpath("//div[@class='higher low']"));
        highlightElement.highLightElement(driver, Law);
        Law.click();
        Thread.sleep(1000);


        try {
            LawColleges.pcolleges(driver).click();
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("");
        }

        try{
            LawCourses.pcourse(driver).click();
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("");
        }

            /*
            List<WebElement> college = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div/h4"));
            try {
                for (int q = 0; q < college.size(); q = q + 1) {

                    System.out.println(college.get(q).getText());
                    college.get(q).click();

                    AgricultureColleges.pcolleges(driver).click();


                    Thread.sleep(2000);
                }
            } catch (Exception e) {
                System.out.println("");
            }

*/




        return null;
    }



}

