package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Facebook_login {
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


    }
