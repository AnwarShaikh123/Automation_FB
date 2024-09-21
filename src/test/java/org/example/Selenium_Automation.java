package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Automation {
    public WebDriver driver;

    @Test
    public void login() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("mohdanwarshaikh900@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("*****");
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void signup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(20000);
        driver.findElement(By.name("firstname")).sendKeys("Sherin");
        driver.findElement(By.name("lastname")).sendKeys("Sharma");
        driver.findElement(By.name("reg_email__")).sendKeys("Sherin@gamil.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
        driver.findElement(By.name("birthday_day")).sendKeys("12");
        driver.findElement(By.name("birthday_month")).sendKeys("Nov");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@value=2]")).click();
        driver.findElement(By.name("websubmit")).click();
    }

    @Test
    public void enter_text_DisableField() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///E:/Anwar_Mca/disable.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t1').value='Anwar'");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value='shaikh'");

    }

    @Test
    public void Scrollup_Function_And_MoveTOElement() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.zappos.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement wb= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/section[2]/div/article[2]/a"));
        int x = wb.getLocation().getX();
        int y = wb.getLocation().getY();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+", "+y+")");
        Thread.sleep(3000);
        wb.click();

    }
}
