package com.example.kiemthu.bai3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selelium {

    private WebDriver webDriver;

    @BeforeEach
    void setUp(){
        webDriver = new ChromeDriver();
    }
    @Test
    void TestWeb() throws InterruptedException {

//        webDriver.get("https://vitimex.com.vn/");
//        //dadnwwng ký
//        webDriver.findElement(By.xpath("//div[@class='li_log']//a[@data-bs-toggle='modal']//*[name()='svg']//*[name()='path' and contains(@d,'M3 20C5.33')]")).click();
//        webDriver.get("https://vitimex.com.vn/dang-ky.html");
//        webDriver.findElement(By.xpath("//input[@id='name']")).sendKeys("manh");
//        webDriver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0386349304");
//        webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("manh56823@gmail.com");
//        webDriver.findElement(By.xpath("//input[@id='pass-regis']")).sendKeys("manh123");
//        webDriver.findElement(By.xpath("//input[@id='pass-confirm']")).sendKeys("manh123");
//        webDriver.findElement(By.xpath("//a[@id='register-btn']")).click();
        webDriver.get("https://vitimex.com.vn/");

        webDriver.findElement(By.xpath("//div[@class='li_log']//a[@data-bs-toggle='modal']//*[name()='svg']//*[name()='path' and contains(@d,'M3 20C5.33')]")).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement emailInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("account")));
        emailInput.sendKeys("manh56823@gmail.com");
        webDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("manh123");
        webDriver.findElement(By.xpath("//a[@id='signin-btn']")).click();
    }
}
