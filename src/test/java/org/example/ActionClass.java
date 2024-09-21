package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionClass {
    public WebDriver driver;

    @Test
    public void Contextclick() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.zappos.com/");
        WebElement link = driver.findElement(By.linkText("Brands"));
        Actions actions = new Actions(driver);
        actions.contextClick(link).perform();
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);
    }

    @Test
    public void Drag_and_drop() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement des = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(src, des).perform();

    }

    @Test
    public void Hover_element() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.zappos.com/");
        WebElement src = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div[1]/article[1]/div[2]/section/ul/li[2]/button/img"));
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(src).perform();

    }

    @Test
    public void Double_click() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.zappos.com/");
        WebElement src = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/article[1]/div[2]/div[2]/a"));
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.doubleClick(src).perform();
    }

}