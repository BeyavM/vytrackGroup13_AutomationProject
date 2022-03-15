package com.vytrack.tests;


import com.vytrack.utilities.VytrackUtils;

import org.testng.annotations.Test;

public class US_6_VerifyIconsAreDisplayed {

    @Test(priority = 1)
    public void verify_icons_are_displayed_as_store_manager() {

        VytrackUtils.loginAsStoreManager();
        VytrackUtils.waitTillLoaderMaskDisappear();

    }

}
