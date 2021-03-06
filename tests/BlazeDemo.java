import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class BlazeDemo {
    FirefoxDriver wd;
    
    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void BlazeDemo() {
        wd.get("http://blazedemo.com/");
        wd.findElement(By.cssSelector("input.btn.btn-primary")).click();
        wd.findElement(By.xpath("//table[@class='table']/tbody/tr[4]/td[1]/input")).click();
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
    
    
}
