package vn.fpoly.demo22.selenium_webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverTest {
    /*
    WebDriver webDriver;
    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }
    @Test
    void testSteps() throws InterruptedException{
        //oen link
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        //click menu
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        //login
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
        //dangky
        webDriver.findElement(By.xpath("//*[@id=\"NewRegistration\"]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("do huu");
        webDriver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("bao nguyen");
        webDriver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys("nguyendhb2@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"contactNumber\"]")).sendKeys("0368229988");
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("nguyen");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("1234");
        webDriver.findElement(By.xpath("//*[@id=\"first_form\"]/div/div[2]/center/input")).click();
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        //*[@id="menu"]/a/li
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a/li")).click();
        //*[@id="menuToggle"]/input
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("nguyen");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("1234");
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
        webDriver.quit();
    }

     */
}
