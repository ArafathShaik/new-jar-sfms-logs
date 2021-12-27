// 
// Decompiled by Procyon v0.5.36
// 

package test;

import java.text.DateFormat;
import org.openqa.selenium.WebElement;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import org.openqa.selenium.support.ui.Select;
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

public class ERRequestCreationAndVerificationTestRobot2
{
    Actions actions;
    String refnumber;
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
        
        System.out.println("User Entered Into Handling Popups Test");
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
    
    @Test(priority = 3, description = "Create Enhanced Reconciliation Request")
    public void createERRequest() throws MalformedURLException, AWTException, InterruptedException {
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
        this.actions = new Actions(this.driver);
        Thread.sleep(10000L);
        final WebElement message = this.driver.findElement(By.xpath("//li[@class='active has-sub']/a/span[contains(text(),'Others')]"));
        this.actions.moveToElement(message).build().perform();
        this.actions.moveToElement(this.driver.findElement(By.cssSelector("#othersMenu > li:nth-child(7) > a:nth-child(2) > span:nth-child(1)"))).click().build().perform();
        this.actions.moveToElement(this.driver.findElement(By.xpath("//li[@class='active has-sub']/child::ul/li/a/span[contains(text(),'Reconciliation Request')]"))).click().build().perform();
        Thread.sleep(5000L);
        this.driver.findElement(By.xpath("//input[@value='singleBank']")).click();
        this.driver.findElement(By.xpath("//input[@id='reconIFSC']")).sendKeys("IFBR0000001");
        Select s1 = new Select(this.driver.findElement(By.cssSelector("#msgTypeSelect")));
        s1.selectByVisibleText("RTGS");
        final Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        final int todayInt = calendar.get(5);
        System.out.println("Today Int: " + todayInt + "\n");
        final String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");
        this.driver.findElement(By.xpath("//input[@id='reconReqFromDate']")).click();
        this.driver.findElement(By.cssSelector(".ui-state-highlight")).click();
        final DateFormat hrs = new SimpleDateFormat("kk");
        final Date d = new Date(System.currentTimeMillis() - 3600000L);
        final String timeanHourago = hrs.format(d);
        s1 = new Select(this.driver.findElement(By.id("fromHours")));
        s1.selectByVisibleText(timeanHourago);
        final Random ran = new Random();
        int num = ran.nextInt(10);
        final String mins = Integer.toString(num);
        s1 = new Select(this.driver.findElement(By.id("fromMins")));
        s1.selectByVisibleText("0" + mins);
        this.driver.findElement(By.xpath("//input[@id='reconReqToDate']")).click();
        this.driver.findElement(By.cssSelector("a.ui-state-default")).click();
        s1 = new Select(this.driver.findElement(By.id("toHours")));
        s1.selectByVisibleText(timeanHourago);
        num += 15;
        final String tomins = Integer.toString(num);
        s1 = new Select(this.driver.findElement(By.id("toMins")));
        s1.selectByVisibleText(tomins);
        this.driver.findElement(By.cssSelector("#crtReconReqBtn")).click();
        Assert.assertEquals("Enhanced Reconciliation Request created successfully, kindly authorize the message with another user.", this.driver.findElement(By.id("toggleSuccess")).getText());
        Thread.sleep(2000L);
        final WebElement message2 = this.driver.findElement(By.xpath("//li[@class='active has-sub']/a/span[contains(text(),'Others')]"));
        this.actions.moveToElement(message2).build().perform();
        this.actions.moveToElement(this.driver.findElement(By.cssSelector("#othersMenu > li:nth-child(7) > a:nth-child(2) > span:nth-child(1)"))).click().build().perform();
        this.actions.moveToElement(this.driver.findElement(By.xpath("//li[@class='active has-sub']/child::ul/li/a/span[contains(text(),'Reconciliation Request Action Listing')]"))).click().build().perform();
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
        this.refnumber = this.driver.findElement(By.xpath("//table[@id='enhcdRcnReqListingTableId']/tbody/tr[1]/td[1]")).getText();
        System.out.println("******************************************");
        System.out.println("The Generated Reference Number :" + this.refnumber);
        System.out.println("******************************************");
    }
    
    @Test(priority = 4, dependsOnMethods = { "createERRequest" }, description = "Skip Test Verification")
    public void skipTest() {
        System.out.println("Skip Test Verification");
    }
    
    @Test(priority = 5, description = "Logout Script")
    public void logOutApp() throws MalformedURLException, InterruptedException {
        this.actions = new Actions(this.driver);
        final WebElement userProfile = this.driver.findElement(By.xpath("//div[@class='display_user']"));
        this.actions.moveToElement(userProfile).build().perform();
        Thread.sleep(4000L);
        this.actions.moveToElement(this.driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))).click().build().perform();
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
    }
    
    @Test(priority = 6, description = "close the browser")
    public void closeBrowser() {
        this.driver.quit();
    }
}
