package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class US_14_VerifyCheckedAndUnchecked {
    @Test
    public void manageFilters_SalesManager() {
       VytrackUtils.loginAsSalesManager();


        WebElement marketingBtn = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[6]"));
        //Create actions to navigate and click the Campaigns under the Marketing
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(marketingBtn).perform();
        BrowserUtils.sleep(2);
        WebElement campaignsBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/div/div/ul/li[4]/a/span"));
        campaignsBtn.click();
        //navigate on filter button and click
        WebElement filterBtn = Driver.getDriver().findElement(By.xpath("//*[@title = 'Filters']"));
        filterBtn.click();
        //navigate on a manage filter button and click
        WebElement manageFilterBtn = Driver.getDriver().findElement(By.xpath("//*[@class= 'add-filter-button']/span"));
        manageFilterBtn.click();
        //Verify 6 options are checked by default
        List<WebElement> allOptions = Driver.getDriver().findElements(By.xpath("//div[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']/ul/li/label/input"));
        for (WebElement option : allOptions) {
            System.out.println("option.isSelected() = " + option.isSelected());
        }
    }
}