package com.vytrack.tests;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import com.vytrack.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class U5_ManagersVehicleModelVerify extends TestBase {

    Actions action = new Actions(Driver.getDriver());
    public void clickAndVerify() {
        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        action.moveToElement(fleetTabElement).perform();

        String vehiclesModelModuleLocator = "//span[normalize-space()='Vehicles Model' and contains(@class, 'title title-level-2')]";
        WebElement vehiclesModelElement = Driver.getDriver().findElement(By.xpath(vehiclesModelModuleLocator));

        //waiting until loader mask disappearing
        VytrackUtils.waitTillLoaderMaskDisappear();
        vehiclesModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        List<String> actualHeaderOfTable = WebTableUtils.getHeadersFromVehicleModelTable();
        List<String> expectedHeaderTitle = new ArrayList<>(Arrays.asList(
                "MODEL NAME",
                "MAKE",
                "CAN BE REQUESTED",
                "CVVI",
                "CO2 FEE (/MONTH)",
                "COST (DEPRECIATED)",
                "TOTAL COST (DEPRECIATED)",
                "CO2 EMISSIONS",
                "FUEL TYPE",
                "VENDORS"
        ));

        Assert.assertEquals(actualHeaderOfTable, expectedHeaderTitle);

    }


    @Test(priority = 1)
    public void saleManager_Verify() {
        VytrackUtils.loginAsSalesManager();
        clickAndVerify();
    }


    @Test(priority = 2)
    public void storeManager_Verify() {
        VytrackUtils.loginAsStoreManager();
        clickAndVerify();
    }







}
