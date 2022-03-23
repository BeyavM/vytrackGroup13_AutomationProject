package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US6VerifyIconsAreDisplayed extends TestBase {

@DataProvider(name="dropdown")
public Object[][] dpMethod(){

        List<String> expectedDropdowns = Arrays.asList("View","Edit","Delete");

        Object[][] objData = new Object[1][1];
        objData[0][0]= expectedDropdowns;

        return objData;
        }


@Test(dataProvider = "dropdown")
public void verifyIconsWithSalesManager(List<String> expectedDropdowns){
        VytrackUtils.loginAsSalesManager();
        VytrackUtils.waitTillLoaderMaskDisappear();

        String FleetElementLocator="//span[normalize-space()='Fleet' and contains (@class,'title title-level-1')]";
        WebElement FleetElement= Driver.getDriver().findElement(By.xpath(FleetElementLocator));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(FleetElement).perform();
        BrowserUtils.sleep(3);

        WebElement VehiclesElement= Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        VehiclesElement.click();

        List<WebElement> actualDropdowns= Driver.getDriver().
        findElements(By.xpath("ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu']"));

        List<String> actualModuleTexts = new ArrayList<>();
        for(WebElement actualDropdown: actualDropdowns){
        String actualDropdownText= actualDropdown.getText();
        actualModuleTexts.add(actualDropdownText);




        Assert.assertEquals(actualModuleTexts,expectedDropdowns);
        }


        }


        @Test(dataProvider = "dropdown")
        public void verifyIconsWithStoreManager(List<String> expectedDropdowns){
                VytrackUtils.loginAsStoreManager();
                VytrackUtils.waitTillLoaderMaskDisappear();

                String FleetElementLocator="//span[normalize-space()='Fleet' and contains (@class,'title title-level-1')]";
                WebElement FleetElement= Driver.getDriver().findElement(By.xpath(FleetElementLocator));
                Actions actions=new Actions(Driver.getDriver());
                actions.moveToElement(FleetElement).perform();
                BrowserUtils.sleep(3);

                WebElement VehiclesElement= Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
                VehiclesElement.click();

                List<WebElement> actualDropdowns= Driver.getDriver().
                        findElements(By.xpath("ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu']"));

                List<String> actualModuleTexts = new ArrayList<>();
                for(WebElement actualDropdown: actualDropdowns){
                        String actualDropdownText= actualDropdown.getText();
                        actualModuleTexts.add(actualDropdownText);




                        Assert.assertEquals(actualModuleTexts,expectedDropdowns);
                }


        }


        @Test(dataProvider = "dropdown")
        public void verifyIconsWithDriver(List<String> expectedDropdowns){
                VytrackUtils.loginAsDriver();
                VytrackUtils.waitTillLoaderMaskDisappear();

                String FleetElementLocator="//span[normalize-space()='Fleet' and contains (@class,'title title-level-1')]";
                WebElement FleetElement= Driver.getDriver().findElement(By.xpath(FleetElementLocator));
                Actions actions=new Actions(Driver.getDriver());
                actions.moveToElement(FleetElement).perform();
                BrowserUtils.sleep(3);

                WebElement VehiclesElement= Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
                VehiclesElement.click();

                List<WebElement> actualDropdowns= Driver.getDriver().
                        findElements(By.xpath("ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu']"));

                List<String> actualModuleTexts = new ArrayList<>();
                for(WebElement actualDropdown: actualDropdowns){
                        String actualDropdownText= actualDropdown.getText();
                        actualModuleTexts.add(actualDropdownText);




                        Assert.assertEquals(actualModuleTexts,expectedDropdowns);
                }


        }


}