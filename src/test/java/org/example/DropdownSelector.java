package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownSelector {
    public WebDriver driver;

    @Test
    public void selectByIndex() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///E:/Anwar_Mca/ListBox.html");
        Thread.sleep(2000);

        WebElement list = driver.findElement(By.id("mtr"));
        Select s = new Select(list);
        List<WebElement> options = s.getOptions();
        int size = options.size();

        System.out.println("Number of elements present inside the dropdown is: " + size);
        for (WebElement webElement : options) {
            String text = webElement.getText();
            System.out.println(text);
        }
        s.selectByIndex(0);
    }
}
