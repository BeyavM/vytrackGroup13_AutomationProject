package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US7_SelectAnyVehicle {

    @BeforeMethod
    public void setUp() {

        // Goto homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    // Testing module as a store manager
    @Test
    public void verifying_store_manager_test() {


        // Enter username
        Driver.getDriver().findElement(By.xpath(" //*[@id=\"prependedInput\"]")).sendKeys("storemanager251");
        // Enter password
        Driver.getDriver().findElement(By.xpath("//*[@id=\"prependedInput2\"]")).sendKeys("UserUser123");
        // Click sign in button
        Driver.getDriver().findElement(By.xpath(" //*[@id=\"_submit\"]")).click();
        //  Click fleet module
        Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        // Click vehicle
        Driver.getDriver().findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span"));
        // select any car

        Driver.closeDriver();

    }

    // Testing module as a  track driver
    @Test
    public void verifying_track_driver_test() {

        // Enter username
        Driver.getDriver().findElement(By.xpath(" //*[@id=\"prependedInput\"]")).sendKeys("user184");
        // Enter password
        Driver.getDriver().findElement(By.xpath("//*[@id=\"prependedInput2\"]")).sendKeys("UserUser123");
        // Click sign in button
        Driver.getDriver().findElement(By.xpath(" //*[@id=\"_submit\"]")).click();
        //  Click fleet module
        Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        // Click vehicle
        Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")).click();

        Driver.closeDriver();
    }

    // Testing module as a sales manager
    @Test
    public void verifying_selse_manager_test() {
        // Enter username
        Driver.getDriver().findElement(By.xpath(" //*[@id=\"prependedInput\"]")).sendKeys("salesmanager251");
        // Enter password
        Driver.getDriver().findElement(By.xpath("//*[@id=\"prependedInput2\"]")).sendKeys("UserUser123");
        // Click sign in button
        Driver.getDriver().findElement(By.xpath(" //*[@id=\"_submit\"]")).click();
        //  Click fleet module
        Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        // Click vehicle
        Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")).click();

        Driver.closeDriver();


    }

    @AfterMethod
    public void tearDown() {


    }


}
