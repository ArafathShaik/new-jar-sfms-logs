// 
// Decompiled by Procyon v0.5.36
// 

package test;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
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

public class IFSCDirectoryTestRobot
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
        Thread.sleep(5000L);
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
    
    @Test(priority = 3, description = "Verify Login")
    public void Login() throws InterruptedException, MalformedURLException, AWTException {
        Thread.sleep(5000L);
        this.driver.findElement(By.xpath("//input[@id='uaiUserId']")).sendKeys(PropertiesUtility.properties.getProperty("RequestCreator"));
        this.driver.findElement(By.xpath("//input[@id='uaiUserNodeAddrs']")).sendKeys(PropertiesUtility.properties.getProperty("ERIFSC"));
        System.out.println("Entered User id and IFSC Code Successfully");
        Thread.sleep(15000L);
        this.driver.findElement(By.id("token_signin")).click();
        System.out.println("Clicked on Sign-in Button successfully");
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
        Thread.sleep(10000L);
        this.actions = new Actions(this.driver);
        Thread.sleep(8000L);
        final String homePage = this.driver.findElement(By.xpath("//p[contains(text(),'Financial and Non Financial Messages')]")).getText();
        final String homepage1 = "Financial and Non Financial Messages";
        Assert.assertEquals(homepage1, homePage);
        System.out.println("User landed on Home page");
    }
    
    @Test(priority = 4, description = "Navigating to IFSC Directory")
    public void navIfscDirectory() throws InterruptedException {
        this.actions = new Actions(this.driver);
        Thread.sleep(5000L);
        final WebElement message = this.driver.findElement(By.xpath("//li[@class='active has-sub']/a/span[contains(text(),'Others')]"));
        this.actions.moveToElement(message).build().perform();
        this.actions.moveToElement(this.driver.findElement(By.cssSelector("#othersMenu > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)"))).click().build().perform();
        this.driver.findElement(By.xpath("//div[@class='mainContent']/p[contains(text(),'IFSC Directory')]")).isDisplayed();
    }
    
    @Test(priority = 5, description = "Search IFSC")
    public void searchIFSC() throws InterruptedException {
        Thread.sleep(2000L);
        final Select searchOnDropdown = new Select(this.driver.findElement(By.id("searchBox")));
        searchOnDropdown.selectByVisibleText("IFSC");
        this.driver.findElement(By.xpath("//input[@id='textBox']")).sendKeys("IFAR0000001");
        this.driver.findElement(By.xpath("//button[@id='searchButton']")).click();
        Thread.sleep(3000L);
        final String tableResult = this.driver.findElement(By.xpath("//div[@id='ifscDirectoryTableId_info']")).getText();
        Assert.assertEquals("Showing 1 to 1 of 1 entries", tableResult, "Table has one matching entry");
        final String IFSCinResult = this.driver.findElement(By.xpath("//table[@id='ifscDirectoryTableId']/tbody/tr/td")).getText();
        Assert.assertEquals("IFAR0000001", IFSCinResult, "IFSC displayed in search is Matched with search key");
        this.driver.findElement(By.id("resetSearch")).click();
        if (!this.driver.findElement(By.xpath("//input[@id='textBox']")).isEnabled()) {
            System.out.println("Value Input field is diabled");
        }
        this.driver.findElement(By.xpath("//div[@class='showHideCol']/a[contains(text(),'Address')]")).click();
        try {
            this.driver.findElement(By.xpath("//table[@id='ifscDirectoryTableId']/thead/tr/th/div[contains(text(),'Address')]"));
        }
        catch (Exception e) {
            System.out.println("Address field is removed from table");
        }
    }
    
    @Test(priority = 6, description = "logout")
    public void logoutApp() throws InterruptedException, AWTException {
        this.actions = new Actions(this.driver);
        final WebElement userProfile = this.driver.findElement(By.xpath("//div[@class='display_user']"));
        this.actions.moveToElement(userProfile).build().perform();
        Thread.sleep(4000L);
        this.actions.moveToElement(this.driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))).click().build().perform();
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
    
    @Test(priority = 7, description = "close application")
    public void closeApplication() {
        this.driver.quit();
        System.out.println("Closed Application on clicking Login");
    }
}
