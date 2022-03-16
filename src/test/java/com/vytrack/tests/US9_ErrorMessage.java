package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



    public class US9_ErrorMessage {
        @Test
        public void verifying_errorMessage_salesManager() throws InterruptedException {
            VytrackUtils.loginAsSalesManager();

            //Creating object of an Actions class
            WebElement activities = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a/span"));
            Actions actions = new Actions(Driver.getDriver());

            //Step1 = Login Hover Over the "Activities" -> click on "Calendar Events"
            //Performing the mouse hover action on the target element.
            actions.moveToElement(activities).perform();

            WebElement calendarEvent = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[7]/a/span"));
            BrowserUtils.sleep( 10);
            calendarEvent.click();

            //2.Click on "Create Calendar"
            //Creat Calendar
            WebElement createCalendarEvent = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
            BrowserUtils.sleep(10);
            createCalendarEvent.click();

            //3.Check the "Repeat" checkbox
            //Repeat checkbox
            WebElement repeat = Driver.getDriver().findElement(By.xpath("//*[@id='recurrence-repeat-view476']"));
            repeat.click();

            //Error Message less than 1.
            WebElement inputbox = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
            inputbox.clear();
            inputbox.sendKeys("0");

            WebElement errorText1 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be less than 1.']/span"));
            String actualErrorMessage1 = errorText1.getText();
            System.out.println("actualErrorMessage1 = " + actualErrorMessage1);
            String expectedErrorMessage1 = "The value have not to be less than 1.";
            Assert.assertEquals(actualErrorMessage1, expectedErrorMessage1);

            //Error Message more than 99.
            WebElement inputBox2 = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
            inputbox.clear();
            inputbox.sendKeys("100");

            WebElement errorText2 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be more than 99.']/span"));
            String actualErrorMessage99 = errorText2.getText();
            System.out.println("actualErrorMessage99 = " + actualErrorMessage99);
            String expectedErrorMessage99 = "The value have not to be more than 99.";
            Assert.assertEquals(actualErrorMessage99, expectedErrorMessage99);
            Driver.closeDriver();



        }
        @Test
        public void verifying_errorMessage_storeManager() {
            VytrackUtils.loginAsStoreManager();

            //Creating object of an Actions class
            WebElement activities = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a/span"));
            Actions actions = new Actions(Driver.getDriver());


            //Step1 = Login Hover Over the "Activities" -> click on "Calendar Events"
            //Performing the mouse hover action on the target element.
            actions.moveToElement(activities).perform();
            WebElement calendarEvent = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[4]/a/span"));
            BrowserUtils.sleep( 10);
            calendarEvent.click();

            //2.Click on "Create Calendar"
            //Creat Calendar
            WebElement createCalendar = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
            BrowserUtils.sleep( 10);
            createCalendar.click();

            //3. Check the "Repeat" checkBox
            //Repeat checkBox
            WebElement repeat = Driver.getDriver().findElement(By.xpath("//*[@id='recurrence-repeat-view439']"));
            repeat.click();

            //Error Message Less Than 1.
            WebElement inputBox = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
            inputBox.clear();
            inputBox.sendKeys("0");

            WebElement errorText1 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be less than 1.']/span"));
            String actualErrorMessage1 = errorText1.getText();
            System.out.println("actualErrorMessage1 = " + actualErrorMessage1);
            String expectedErrorMessage1 = "The value have not to be less than 1.";
            Assert.assertEquals(actualErrorMessage1, expectedErrorMessage1);

            //Error Message More Than 99.
            WebElement inputBox2 = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
            inputBox.clear();
            inputBox.sendKeys("100");

            WebElement errorText2 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be more than 99.']/span"));
            String actualErrorMessage99 = errorText2.getText();
            System.out.println("actualErrorMessage99 = " + actualErrorMessage99);
            String expectedErrorMessage99 = "The value have not to be more than 99.";
            Assert.assertEquals(actualErrorMessage99, expectedErrorMessage99);
            Driver.closeDriver();

        }
        @Test
        public void verifying_errorMessage_driver() throws InterruptedException {
            VytrackUtils.loginAsDriver();

            //Creating object of an Actions class
            WebElement activities = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span"));
            Actions actions = new Actions(Driver.getDriver());

            //Step1 = Login Hover Over the "Activities" -> click on "Calendar Events"
            //Performing the mouse hover action on the target element.
            actions.moveToElement(activities).perform();

            WebElement calendarEvent = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span"));
            calendarEvent.click();

            //2.Click on "Create Calendar"
            //Creat Calendar
            WebElement createCalendar = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
            BrowserUtils.sleep(10);
            createCalendar.click();

            //3. Check the "Repeat" checkBox
            //Repeat checkBox
            BrowserUtils.sleep(10);
            WebElement repeat = Driver.getDriver().findElement(By.xpath("//*[@id='recurrence-repeat-view274']"));
            repeat.click();

            //Error Message Less Than 1.
            WebElement inputBox = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
            inputBox.clear();
            inputBox.sendKeys("0");

            WebElement errorText1 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be less than 1.']/span"));
            String actualErrorMessage1 = errorText1.getText();
            System.out.println("actualErrorMessage1 = " + actualErrorMessage1);
            String expectedErrorMessage1 = "The value have not to be less than 1.";
            Assert.assertEquals(actualErrorMessage1, expectedErrorMessage1);

            //Error Message More Than 99.
            WebElement inputBox2 = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
            inputBox.clear();
            inputBox.sendKeys("100");

            WebElement errorText2 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be more than 99.']/span"));
            String actualErrorMessage99 = errorText2.getText();
            System.out.println("actualErrorMessage99 = " + actualErrorMessage99);
            String expectedErrorMessage99 = "The value have not to be more than 99.";
            Assert.assertEquals(actualErrorMessage99, expectedErrorMessage99);
            Driver.closeDriver();
        }



    }




