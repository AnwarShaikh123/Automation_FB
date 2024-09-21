package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Frame {
    WebDriver driver = new ChromeDriver();

    @Test
    public void login() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///E:/Anwar_Mca/page2.html");
        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("A");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("S");
        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("n");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("h");
        driver.switchTo().frame("n1");
        driver.findElement(By.id("t1")).sendKeys("w");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("a");
        WebElement f = driver.findElement(By.className("c1"));
        driver.switchTo().frame(f);
        driver.findElement(By.id("t1")).sendKeys("a");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("i");
    }
}