package com.vytrack.tests.base;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US4_VerifyVehicleContractPage {
    public static class VehicleContractsVerify {
        @Test
        public void access_vehicle_contracts_page_successfully_asStoreManager() {
            //Step 1
            VytrackUtils.loginAsStoreManager();

            //waiting until loader mask disappearing
            VytrackUtils.waitTillLoaderMaskDisappear();

            //User goes to homePage as a store manager
            String FleetElementLocator = "//span[normalize-space()='Fleet' and contains (@class,'title title-level-1')]";
            WebElement FleetElement = Driver.getDriver().findElement(By.xpath(FleetElementLocator));


            //User hover over on Fleet
            Actions actions = new Actions(Driver.getDriver());
            BrowserUtils.sleep(3);

            actions.moveToElement(FleetElement).perform();
            BrowserUtils.sleep(3);

            //User Click on Vehicle Contracts
            WebElement VehicleContracts = Driver.getDriver().findElement(By.xpath("//span[text()='Vehicle Contracts']"));
            //JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
            //js.executeScript("[0].scrollIntoView(true)",VehicleContractsLink);
            VehicleContracts.click();
            BrowserUtils.sleep(3);

            //Verify all vehicle contracts is displayed
           // String expectedTitle="All Vehicle Contract";
            //String actualTitle= VehicleContracts.getText().isDisplay;

            String actualTitle = Driver.getDriver().getTitle();
            String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";

            Assert.assertEquals(expectedTitle,actualTitle);

            Driver.closeDriver();
        }

        @Test
        public void access_vehicle_contracts_page_successfully_asSaleManager() {
            //Step 1
            VytrackUtils.loginAsSalesManager();

            //waiting until loader mask disappearing
            VytrackUtils.waitTillLoaderMaskDisappear();

            //User goes to homePage as a store manager
            String FleetElementLocator = "//span[normalize-space()='Fleet' and contains (@class,'title title-level-1')]";
            WebElement FleetElement = Driver.getDriver().findElement(By.xpath(FleetElementLocator));


            //User hover over on Fleet
            Actions actions = new Actions(Driver.getDriver());
            BrowserUtils.sleep(3);

            actions.moveToElement(FleetElement).perform();
            BrowserUtils.sleep(3);

            //User Click on Vehicle Contracts
            WebElement VehicleContracts = Driver.getDriver().findElement(By.xpath("//span[text()='Vehicle Contracts']"));
            //JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
            //js.executeScript("[0].scrollIntoView(true)",VehicleContractsLink);
            VehicleContracts.click();
            BrowserUtils.sleep(3);

            //Verify user can access vehicle contracts page
            String actualTitle = Driver.getDriver().getTitle();
            String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";

            Assert.assertEquals(expectedTitle,actualTitle);


            Driver.closeDriver();
        }
        @Test
        public void access_vehicle_contracts_page_successfully_asDriver() {
            //Step 1
            VytrackUtils.loginAsDriver();

            //waiting until loader mask disappearing
            VytrackUtils.waitTillLoaderMaskDisappear();

            //User goes to homePage as a store manager
            String FleetElementLocator = "//span[normalize-space()='Fleet' and contains (@class,'title title-level-1')]";
            WebElement FleetElement = Driver.getDriver().findElement(By.xpath(FleetElementLocator));


            //User hover over on Fleet
            Actions actions = new Actions(Driver.getDriver());
            BrowserUtils.sleep(3);

            actions.moveToElement(FleetElement).perform();
            BrowserUtils.sleep(3);

            //User Click on Vehicle Contracts
            WebElement VehicleContracts = Driver.getDriver().findElement(By.xpath("//span[text()='Vehicle Contracts']"));
            //JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
            //js.executeScript("[0].scrollIntoView(true)",VehicleContractsLink);
            VehicleContracts.click();
            BrowserUtils.sleep(3);

            //The page should display “You do not have permission to
            //perform this action.”

            WebElement Message=Driver.getDriver().findElement(By.xpath("//div[text()='You do not have permission to perform this action.']"));

            String actualMessage=Message.getText().toString();
            String expectedMessage="You do not have permission to perform this action.";

            Assert.assertEquals(actualMessage,expectedMessage);
            Driver.closeDriver();



        }
    }
}
