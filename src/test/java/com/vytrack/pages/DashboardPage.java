package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Page Header
    @FindBy(xpath = "(//h1)[2]")
   public WebElement pageHeader;

    //Fleet Tab
    @FindBy(xpath = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]")
    public WebElement fleetTab;

    //Vehicles Model Tab under Fleet Tab
    @FindBy(xpath = "//span[normalize-space()='Vehicles Model' and contains(@class, 'title title-level-2')]")
    public WebElement vehiclesModelTab;

}
