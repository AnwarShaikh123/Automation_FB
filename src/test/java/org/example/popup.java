package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class popup {
    public WebDriver driver;

    @Test
    public void alert() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("Alert message: " + alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("anwar");
        Thread.sleep(5000);
        alert.accept();
    }

    @Test
    public void uploadFile() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/split_pdf");
        Thread.sleep(2000);
        driver.findElement(By.id("pickfiles")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("\"C:\\Users\\HP USER\\OneDrive\\Desktop\\upload_file.exe\"");
        Thread.sleep(5000);
        driver.findElement(By.id("processTask")).click();

    }

    @Test
    public void childBrowser() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.exness.com/");
        driver.manage().window().maximize();
        String parentwindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[3]/div[2]/a[2]")).click();
        Thread.sleep(5000);
        for  (String windowhand : driver.getWindowHandles()) {
            if (!windowhand.equals(parentwindowHandle)) {
                driver.switchTo().window(windowhand);
            }
        }
        driver.findElement(By.name("login")).sendKeys("mohdanwarshaikh9@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Anwar@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[2]/form/button")).click();
        Thread.sleep(2000);

            String childtitle = driver.getTitle();
            System.out.println("Title of the child tab is :" + childtitle);


        }
    @Test
    public void HiddenDivision() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/label/p[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[5]")).click();
    }
    }
