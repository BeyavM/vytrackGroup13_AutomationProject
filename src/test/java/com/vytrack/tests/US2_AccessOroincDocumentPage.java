package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class US2_AccessOroincDocumentPage {

    @Test(priority = 1) //Truck Driver Log in
    public void Oroinc_Document_Page_Access_TruckDrivers() throws InterruptedException {

        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys("user184");
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys("UserUser123");
        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        //click on the 'question icon'
        Driver.getDriver().findElement(By.xpath("//*[@id='oroplatform-header']/div[1]/div/ul/li[1]/a/i")).click();

        Thread.sleep(2000);

        Driver.closeDriver();

    }

    @Test(priority = 2) //Store Manager Log in
    public void Oroinc_Document_Page_Access_StoreManager() throws InterruptedException {

        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys("storemanager251");
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys("UserUser123");
        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        //click on the 'question icon'
        Driver.getDriver().findElement(By.xpath("//*[@id='oroplatform-header']/div[1]/div/ul/li[1]/a/i")).click();

        Thread.sleep(2000);

        Driver.closeDriver();

    }

    @Test(priority = 3) //Sales Manager Log in
    public void Oroinc_Document_Page_Access_SalesManager() throws InterruptedException {

        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys("salesmanager251");
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys("UserUser123");
        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        //click on the 'question icon'
        Driver.getDriver().findElement(By.xpath("//*[@id='oroplatform-header']/div[1]/div/ul/li[1]/a/i")).click();

        Thread.sleep(2000);

        Driver.closeDriver();

    }

}
