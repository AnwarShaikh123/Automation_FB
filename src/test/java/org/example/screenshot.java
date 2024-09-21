package org.example;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class screenshot {
    public WebDriver driver;

    @Test
    public void Take_ScreenShot() throws IOException, InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.zappos.com/");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File SFile=ts.getScreenshotAs(OutputType.FILE);
        File DFile=new File("C:\\Users\\HP USER\\IdeaProjects\\Selenium\\ScreenShot\\"+"photo.png");
        FileHandler.copy(SFile,DFile);
    }
}