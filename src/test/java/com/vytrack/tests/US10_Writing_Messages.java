package com.vytrack.tests;

import com.github.javafaker.Faker;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US10_Writing_Messages extends TestBase {
   @Test
   public void writing_message_successfully_With_SalesManager(){

      //step1-user go to homepage as sale manager
      VytrackUtils.loginAsSalesManager();

     //step2- user go to Activities Tab and hover over
      String ActivitiesElementLocator="//span[normalize-space()='Activities' and contains (@class,'title title-level-1')]";
     WebElement ActivitiesElement= Driver.getDriver().findElement(By.xpath(ActivitiesElementLocator));
      Actions actions=new Actions(Driver.getDriver());
      actions.moveToElement(ActivitiesElement).perform();
      BrowserUtils.sleep(3);

      // step 3:and user click to "Calendar Events"
      WebElement CalendarEvents=Driver.getDriver().findElement(By.xpath("//span[text()='Calendar Events']"));
      CalendarEvents.click();

      //then user click to Create calendar Event

      WebElement CreateCalendarLink=Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
      JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
      js.executeScript("arguments[0].scrollIntoView(true)",CreateCalendarLink);
       CreateCalendarLink.click();
       BrowserUtils.sleep(3);

       //System display calendar form
      WebElement calendarForm=Driver.getDriver().findElement(By.xpath("//form[@name='oro_calendar_event_form']"));
      Assert.assertTrue(calendarForm.isDisplayed());

      //Handle iframe
       Driver.getDriver().switchTo().frame( Driver.getDriver().findElement(By.xpath("//div[@id='mceu_24']//iframe")));
       WebElement message =  Driver.getDriver().findElement(By.xpath("//*[@id='tinymce']"));
       message.click();

       //step 4 :send message using java faker
       Faker faker=new Faker();
       String sentence=faker.chuckNorris().fact();

       message.sendKeys(sentence);
       Driver.getDriver().switchTo().parentFrame();

       //step 5: to verify the message is written in the input box
      // WebElement verifyMessage=Driver.getDriver().findElement(By.xpath("//body[@id='tinymce']//p"));

       Driver.getDriver().switchTo().frame( Driver.getDriver().findElement(By.xpath("//div[@id='mceu_24']//iframe")));
       WebElement verifyMessage =  Driver.getDriver().findElement(By.xpath("//*[@id='tinymce']//p"));
       Assert.assertEquals(verifyMessage.getText(),sentence);
       Driver.closeDriver();

   }
    @Test
    public void writing_message_successfully_With_StoreManager(){

        //step1-user go to homepage as store manager
        VytrackUtils.loginAsStoreManager();

        //step2- user go to Activities Tab and hover over
        String ActivitiesElementLocator="//span[normalize-space()='Activities' and contains (@class,'title title-level-1')]";
        WebElement ActivitiesElement= Driver.getDriver().findElement(By.xpath(ActivitiesElementLocator));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(ActivitiesElement).perform();
        BrowserUtils.sleep(3);

        // step 3:and user click to "Calendar Events"
        WebElement CalendarEvents=Driver.getDriver().findElement(By.xpath("//span[text()='Calendar Events']"));
        CalendarEvents.click();

        //then user click to Create calendar Event

        WebElement CreateCalendarLink=Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",CreateCalendarLink);
        CreateCalendarLink.click();
        BrowserUtils.sleep(3);

        //System display calendar form
        WebElement calendarForm=Driver.getDriver().findElement(By.xpath("//form[@name='oro_calendar_event_form']"));
        Assert.assertTrue(calendarForm.isDisplayed());

        //Handle iframe
        Driver.getDriver().switchTo().frame( Driver.getDriver().findElement(By.xpath("//div[@id='mceu_24']//iframe")));
        WebElement message =  Driver.getDriver().findElement(By.xpath("//*[@id='tinymce']"));
        message.click();
        BrowserUtils.sleep(3);

        //step 4 :send message using java faker
        Faker faker=new Faker();
        String sentence=faker.chuckNorris().fact();

        message.sendKeys(sentence);
        Driver.getDriver().switchTo().parentFrame();

        //step 5: to verify the message is written in the input box
        // WebElement verifyMessage=Driver.getDriver().findElement(By.xpath("//body[@id='tinymce']//p"));

        Driver.getDriver().switchTo().frame( Driver.getDriver().findElement(By.xpath("//div[@id='mceu_24']//iframe")));
        WebElement verifyMessage =  Driver.getDriver().findElement(By.xpath("//*[@id='tinymce']//p"));
        Assert.assertEquals(verifyMessage.getText(),sentence);
        Driver.closeDriver();

    }
    @Test
    public void writing_message_successfully_With_Driver(){

        //step1-user go to homepage as driver
        VytrackUtils.loginAsDriver();
     /*   Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys("user188");
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys("UserUser123");
        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();*/

        //step2- user go to Activities Tab and hover over
        BrowserUtils.sleep(3);
       String ActivitiesElementLocator="//span[normalize-space()='Activities' and contains (@class,'title title-level-1')]";

        WebElement ActivitiesElement= Driver.getDriver().findElement(By.xpath(ActivitiesElementLocator));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(ActivitiesElement).perform();
        BrowserUtils.sleep(3);

        // step 3:and user click to "Calendar Events"
        WebElement CalendarEvents=Driver.getDriver().findElement(By.xpath("//span[text()='Calendar Events']"));
        CalendarEvents.click();
        BrowserUtils.sleep(3);

        //then user click to Create calendar Event

        WebElement CreateCalendarLink=Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));

     /*   JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",CreateCalendarLink);*/
        BrowserUtils.sleep(3);
        CreateCalendarLink.click();
        BrowserUtils.sleep(3);

        //System display calendar form
        WebElement calendarForm=Driver.getDriver().findElement(By.xpath("//form[@name='oro_calendar_event_form']"));
        Assert.assertTrue(calendarForm.isDisplayed());

        //Handle iframe
        Driver.getDriver().switchTo().frame( Driver.getDriver().findElement(By.xpath("//div[@id='mceu_24']//iframe")));
        WebElement message =  Driver.getDriver().findElement(By.xpath("//*[@id='tinymce']"));
        message.click();

        //step 4 :send message using java faker
        Faker faker=new Faker();
        String sentence=faker.chuckNorris().fact();

        message.sendKeys(sentence);
        Driver.getDriver().switchTo().parentFrame();

        //step 5: to verify the message is written in the input box
        // WebElement verifyMessage=Driver.getDriver().findElement(By.xpath("//body[@id='tinymce']//p"));

        Driver.getDriver().switchTo().frame( Driver.getDriver().findElement(By.xpath("//div[@id='mceu_24']//iframe")));
        WebElement verifyMessage =  Driver.getDriver().findElement(By.xpath("//*[@id='tinymce']//p"));
        Assert.assertEquals(verifyMessage.getText(),sentence);
        Driver.closeDriver();

    }
}
