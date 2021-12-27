// 
// Decompiled by Procyon v0.5.36
// 

package test;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;
import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.wtt.docker.listener.PropertiesUtility;
import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyLoginTestRobot
{
    Actions actions;
    WebDriver driver;
    Robot robot;
    
    @Test(priority = 1, description = "Launching SFMS application")
    public void LaunchingApplication() throws IOException, AWTException, InterruptedException {
        PropertiesUtility.loadApplicationProperties();
        final Robot robot = new Robot();
        this.driver = new FirefoxDriver();
        Thread.sleep(3000L);
        this.driver.manage().window().maximize();
        System.out.println("driver connected.............");
        this.driver.navigate().to(PropertiesUtility.properties.getProperty("application.url"));
        System.out.println("Application launched successfully");
        final String tittle = this.driver.getTitle();
        System.out.println("tittle :" + tittle);
        Assert.assertEquals("Token Login", this.driver.getTitle());
        System.out.println("Tittle Verified Successfully");
    }
    
    @Test(priority = 2, description = "Handling Allow Pop-ups and Security Pop-ups")
    public void HandlingPopus() throws MalformedURLException, AWTException, InterruptedException {
        System.out.println("User Entered Into Handling Pop-ups Test");
        Thread.sleep(10000L);
        (this.robot = new Robot()).keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
        Thread.sleep(10000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(32);
        this.robot.keyRelease(32);
        Thread.sleep(2000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
        Thread.sleep(10000L);
        Thread.sleep(10000L);
        this.driver.findElement(By.xpath("//div[@id='redirect_admin']/a")).click();
        System.out.println("Clicked on Admin Link");
        Thread.sleep(6000L);
        this.driver.findElement(By.xpath("//div[@class='text-right']/a[@class='clickhere']")).click();
        System.out.println("Clicked on Click Here Link");
        Thread.sleep(15000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(32);
        this.robot.keyRelease(32);
        Thread.sleep(2000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
    }
    
    @Test(priority = 3, description = "Empty Credentials")
    public void loginValidations() throws MalformedURLException, AWTException, InterruptedException {
        Thread.sleep(5000L);
        this.driver.findElement(By.id("token_signin")).click();
        final String alert = this.driver.switchTo().alert().getText();
        Assert.assertEquals(alert, "Ifsc or User Id is not valid");
        Thread.sleep(3000L);
        if (alert.equalsIgnoreCase("Ifsc or User Id is not valid")) {
            this.driver.switchTo().alert().accept();
        }
        Thread.sleep(5000L);
    }
    
    @Test(priority = 4, description = "Login With Userid")
    public void loginwithUserId() throws MalformedURLException, AWTException, InterruptedException {
        this.driver.findElement(By.id("uaiUserId")).sendKeys("SUSER1");
        Thread.sleep(2000L);
        this.driver.findElement(By.id("token_signin")).click();
        final String alert = this.driver.switchTo().alert().getText();
        Assert.assertEquals(alert, "Ifsc or User Id is not valid");
        if (alert.equalsIgnoreCase("Ifsc or User Id is not valid")) {
            this.driver.switchTo().alert().accept();
        }
        Thread.sleep(5000L);
        this.driver.findElement(By.id("uaiUserId")).clear();
        Thread.sleep(5000L);
    }
    
    @Test(priority = 5, description = "With IFSC Code")
    public void loginwithIfsc() throws MalformedURLException, AWTException, InterruptedException {
        this.driver.findElement(By.id("uaiUserNodeAddrs")).sendKeys("IFDK00000SC");
        this.driver.findElement(By.id("token_signin")).click();
        final String alert = this.driver.switchTo().alert().getText();
        Assert.assertEquals(alert, "Ifsc or User Id is not valid");
        if (alert.equalsIgnoreCase("Ifsc or User Id is not valid")) {
            this.driver.switchTo().alert().accept();
        }
        Thread.sleep(2000L);
        this.driver.findElement(By.id("uaiUserNodeAddrs")).clear();
        Thread.sleep(5000L);
    }
    
    @Test(priority = 6, description = "Login with IFSC belongs to different bank")
    public void loginwithDifferentIFSC() throws MalformedURLException, AWTException, InterruptedException {
        this.driver.findElement(By.id("uaiUserId")).sendKeys("SUSER2");
        this.driver.findElement(By.id("uaiUserNodeAddrs")).sendKeys("IFAR0000001");
        this.driver.findElement(By.id("token_signin")).click();
        Thread.sleep(10000L);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        final String pfxpath = System.getProperty("user.dir") + "/" + "src/test/resources/RBIH0000000.pfx";
        System.out.println(pfxpath);
        final RobotClassDynamicPath rcdp = new RobotClassDynamicPath();
        rcdp.type(pfxpath);
        Thread.sleep(15000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyPress(80);
        this.robot.keyRelease(80);
        this.robot.keyPress(70);
        this.robot.keyRelease(70);
        this.robot.keyPress(88);
        this.robot.keyRelease(88);
        this.robot.keyPress(70);
        this.robot.keyRelease(70);
        this.robot.keyPress(73);
        this.robot.keyRelease(73);
        this.robot.keyPress(76);
        this.robot.keyRelease(76);
        this.robot.keyPress(69);
        this.robot.keyRelease(69);
        this.robot.keyPress(49);
        this.robot.keyRelease(49);
        this.robot.keyPress(50);
        this.robot.keyRelease(50);
        this.robot.keyPress(51);
        this.robot.keyRelease(51);
        Thread.sleep(3000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(3000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
        Thread.sleep(5000L);
        final String validation = this.driver.findElement(By.id("uaiUser.errors")).getText();
        Assert.assertEquals(validation, "Invalid User Id/IFSC/Password");
        Thread.sleep(8000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(32);
        this.robot.keyRelease(32);
        Thread.sleep(2000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
        Thread.sleep(4000L);
    }
    
    @Test(priority = 7, description = "Clearing Login Fields")
    public void clearFeilds() {
        this.driver.findElement(By.id("uaiUserId")).clear();
        this.driver.findElement(By.id("uaiUserNodeAddrs")).clear();
    }
    
    @Test(priority = 8, description = "Verify Login")
    public void VerifyLogin() throws InterruptedException, MalformedURLException, AWTException {
        this.driver.findElement(By.id("uaiUserId")).sendKeys("SUSER1");
        this.driver.findElement(By.id("uaiUserNodeAddrs")).sendKeys("IFDK00000SC");
        this.driver.findElement(By.id("token_signin")).click();
        System.out.println("Clicked on Sign-in Button successfully");
        Thread.sleep(12000L);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        this.robot.keyPress(16);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyRelease(16);
        this.robot.delay(20);
        final String pfxpath = System.getProperty("user.dir") + "/" + "src/test/resources/RBIH0000000.pfx";
        System.out.println(pfxpath);
        final RobotClassDynamicPath rcdp = new RobotClassDynamicPath();
        rcdp.type(pfxpath);
        Thread.sleep(15000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        this.robot.keyPress(80);
        this.robot.keyRelease(80);
        this.robot.keyPress(70);
        this.robot.keyRelease(70);
        this.robot.keyPress(88);
        this.robot.keyRelease(88);
        this.robot.keyPress(70);
        this.robot.keyRelease(70);
        this.robot.keyPress(73);
        this.robot.keyRelease(73);
        this.robot.keyPress(76);
        this.robot.keyRelease(76);
        this.robot.keyPress(69);
        this.robot.keyRelease(69);
        this.robot.keyPress(49);
        this.robot.keyRelease(49);
        this.robot.keyPress(50);
        this.robot.keyRelease(50);
        this.robot.keyPress(51);
        this.robot.keyRelease(51);
        Thread.sleep(3000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(3000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
        Thread.sleep(10000L);
    }
    
    @Test(priority = 9)
    public void closeApplication() {
        this.driver.quit();
        System.out.println("Closed Application on clicking Login");
    }
}
