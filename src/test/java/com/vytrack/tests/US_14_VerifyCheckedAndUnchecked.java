package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

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
    }
}