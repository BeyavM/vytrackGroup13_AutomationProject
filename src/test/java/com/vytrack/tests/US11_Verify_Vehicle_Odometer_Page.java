package com.vytrack.tests;

import com.vytrack.pages.VytrackOdometerPage;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US11_Verify_Vehicle_Odometer_Page {

    @Test(priority = 1)
    public void verify_odometer_page_as_store_manager() {
        VytrackUtils.loginAsStoreManager();
        VytrackUtils.waitTillLoaderMaskDisappear();
        WebElement fleetButton = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        fleetButton.click();
        WebElement odometerLink = Driver.getDriver().findElement(By.xpath("//div[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a"));
        odometerLink.click();

        VytrackOdometerPage VytrackOdometerPage = new VytrackOdometerPage();
        Assert.assertTrue(VytrackOdometerPage.odometerPageWarningMessage.isDisplayed());

        Driver.closeDriver();

    }

    @Test(priority = 2) //is not supposed to access to the odometer info page, created bug report already.
    public void verify_odometer_page_as_sales_manager() {
        VytrackUtils.loginAsSalesManager();
        VytrackUtils.waitTillLoaderMaskDisappear();
        WebElement fleetButton = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        fleetButton.click();
        WebElement odometerLink = Driver.getDriver().findElement(By.xpath("//div[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a"));
        odometerLink.click();

        VytrackOdometerPage VytrackOdometerPage = new VytrackOdometerPage();
        Assert.assertTrue(VytrackOdometerPage.odometerPageWarningMessage.isDisplayed());

        Driver.closeDriver();

    }

    @Test(priority = 3)
    public void verify_odometer_page_as_driver(){
        VytrackUtils.loginAsDriver();
        VytrackUtils.waitTillLoaderMaskDisappear();
        WebElement fleetButton = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        fleetButton.click();
        WebElement odometerLink = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Vehicle Odometer')]"));
        odometerLink.click();


        String defaultPageNumber = Driver.getDriver().findElement(By.xpath("//input[@class='input-widget']")).getAttribute("value");
        String expectedPageNumber = "1";
        Assert.assertEquals(defaultPageNumber,expectedPageNumber);


        String defaultItemNumber = Driver.getDriver().findElement(By.xpath("//button[@class='btn dropdown-toggle ']")).getText();
        String expectedItemNumber = "25";
        Assert.assertEquals(defaultItemNumber,expectedItemNumber);

        Driver.closeDriver();

    }
}
