package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackOdometerPage {

    public VytrackOdometerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='The application is not configured properly (message consumers are not available). Please contact the system administrator.']")
    public WebElement projectPageWarningMessage;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement odometerPageWarningMessage;

}