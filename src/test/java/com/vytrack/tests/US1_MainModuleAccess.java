package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class US1_MainModuleAccess extends TestBase{

        @Test(priority = 1)
        public void verifying_modules_as_sales_manager() {
            VytrackUtils.loginAsSalesManager();
            List<WebElement> moduleElements = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
            List<String> actualModuleTexts = new ArrayList<>();

            for (WebElement moduleElement : moduleElements) {
                String moduleElementText = moduleElement.getText();
                actualModuleTexts.add(moduleElementText);
            }

            //moduleElements.forEach(T -> actualModuleTexts.add(T.getText()));
            System.out.println("actualModuleTexts = " + actualModuleTexts);
            List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                    "Dashboards",
                    "Fleet",
                    "Customers",
                    "Sales",
                    "Activities",
                    "Marketing",
                    "Reports & Segments",
                    "System"));

            Assert.assertEquals(actualModuleTexts, expectedModuleTexts);
            Driver.closeDriver();
        }


            @Test(priority = 2)
            public void verifying_modules_as_store_manager() {
                VytrackUtils.loginAsStoreManager();
                List<WebElement> moduleElements = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
                List<String> actualModuleTexts = new ArrayList<>();

                for (WebElement moduleElement : moduleElements) {
                    String moduleElementText = moduleElement.getText();
                    actualModuleTexts.add(moduleElementText);
                }

                //moduleElements.forEach(T -> actualModuleTexts.add(T.getText()));
                System.out.println("actualModuleTexts = " + actualModuleTexts);
                List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                        "Dashboards",
                        "Fleet",
                        "Customers",
                        "Sales",
                        "Activities",
                        "Marketing",
                        "Reports & Segments",
                        "System"));

                Assert.assertEquals(actualModuleTexts, expectedModuleTexts);
                Driver.closeDriver();
            }

                @Test(priority = 3)
                public void verifying_modules_as_drivers(){
                    VytrackUtils.loginAsDriver();
                    List<WebElement>moduleElements = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
                    List<String>actualModuleTexts = new ArrayList<>();

                    for (WebElement moduleElement : moduleElements){
                        String moduleElementText = moduleElement.getText();
                        actualModuleTexts.add(moduleElementText);
                    }

                    //moduleElements.forEach(T->actualModuleTexts.add(T.getText()));
                    System.out.println("actualModuleTexts = " + actualModuleTexts);
                    List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                            "Fleet",
                            "Customers",
                            "Activities",
                            "System"));

                    Assert.assertEquals(actualModuleTexts, expectedModuleTexts);
                    Driver.closeDriver();
                }





            }

