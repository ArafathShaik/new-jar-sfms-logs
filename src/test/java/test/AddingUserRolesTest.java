// 
// Decompiled by Procyon v0.5.36
// 

package test;

import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.wtt.docker.listener.PropertiesUtility;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.File;
import java.awt.Robot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class AddingUserRolesTest
{
    WebDriver driver;
    Actions actions;
    Robot robot;
    
    @Test(priority = 1)
    public void jitu() {
    	try {
			PropertiesUtility.loadApplicationProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        final File f = new File(System.getProperty("user.dir") + "/" + "src/test/resources/RBIH0000000.pfx");
        
        System.out.println("Is file exists: "+f.exists());
        System.out.println("File Path: "+f.getAbsolutePath());
        Assert.assertEquals("RBIH0000000.pfx", f.getName());
    }
    
    @Test(priority = 2, description = "Launching SFMS application")
    public void LaunchingApplication() throws IOException, InterruptedException, AWTException {
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
    
    @Test(priority = 3, description = "Handling Allow Pop-ups and Security Pop-ups")
    public void HandlingPopus() throws MalformedURLException, AWTException, InterruptedException {
	    
	  System.out.println("User Entered Into Hanling Popups Test");
        Thread.sleep(10000L);
        (this.robot = new Robot()).keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
        Thread.sleep(1000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(2000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
        Thread.sleep(10000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(9);
        this.robot.keyRelease(9);
        Thread.sleep(1000L);
        this.robot.keyPress(32);
        this.robot.keyRelease(32);
        Thread.sleep(1000L);
        this.robot.keyPress(10);
        this.robot.keyRelease(10);
        Thread.sleep(12000L);
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
    
    @Test(priority = 4, description = "Verify Login")
    public void loginApp() throws InterruptedException, AWTException, MalformedURLException {
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
    
    @Test(priority = 5, description = "Create Roles Profile ")
    public void createUserGroup() throws InterruptedException, MalformedURLException, AWTException {
        this.actions = new Actions(this.driver);
        final WebElement message = this.driver.findElement(By.xpath("//li[@class='active has-sub']/a/span[contains(text(),'User Administration')]"));
        this.actions.moveToElement(message).build().perform();
        this.actions.moveToElement(this.driver.findElement(By.cssSelector("li.active:nth-child(3) > ul:nth-child(3) > li:nth-child(2) > a:nth-child(1) > span:nth-child(1)"))).click().build().perform();
        if (this.driver.findElement(By.xpath("//p[contains(text(),'Roles')]")).isDisplayed()) {
            System.out.println("User Landed on Roles Page");
        }
        this.driver.findElement(By.id("addRoleButton")).click();
        final int x = (int)(Math.random() * 1000000.0) % 1000;
        final String grpName = "Test" + x;
        System.out.println("*************************************************");
        System.out.println("User Roles Group Created With the Name: " + grpName);
        System.out.println("*************************************************");
        this.driver.findElement(By.cssSelector("#roleDesc")).sendKeys(grpName);
        this.driver.findElement(By.cssSelector(".displayAllFunctions > li:nth-child(1) > label:nth-child(2)")).click();
        this.driver.findElement(By.cssSelector(".displayAllFunctions > li:nth-child(2) > label:nth-child(2)")).click();
        this.driver.findElement(By.cssSelector("#addId")).click();
        Assert.assertEquals("Role added/modified successfully", this.driver.findElement(By.cssSelector("#toggleSuccess")).getText());
        this.driver.findElement(By.cssSelector(".styled-button-anchor")).click();
    }
    
    @Test(priority = 7, description = "Logout Script")
    public void logOut() throws MalformedURLException, InterruptedException {
        this.actions = new Actions(this.driver);
        final WebElement userProfile = this.driver.findElement(By.xpath("//div[@class='display_user']"));
        this.actions.moveToElement(userProfile).build().perform();
        Thread.sleep(4000L);
        this.actions.moveToElement(this.driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))).click().build().perform();
        Thread.sleep(10000L);
    }
    
    @Test(priority = 8, description = "Closing Application")
    public void closeApplication() throws InterruptedException {
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
        this.driver.quit();
        System.out.println("Closed Application on clicking Login");
    }
}
