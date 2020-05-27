// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LC4Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void lC4() {
    // Test name: LC_4
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:9000/");
    // 2 | setWindowSize | 1440x877 | 
    driver.manage().window().setSize(new Dimension(1440, 877));
    // 3 | select | id=players | label=3
    {
      WebElement dropdown = driver.findElement(By.id("players"));
      dropdown.findElement(By.xpath("//option[. = '3']")).click();
    }
    // 4 | click | id=lifePoint | 
    driver.findElement(By.id("lifePoint")).click();
    // 5 | type | id=lifePoint | 60
    driver.findElement(By.id("lifePoint")).sendKeys("60");
    // 6 | click | id=startButton | 
    driver.findElement(By.id("startButton")).click();
    // 7 | click | css=#editBtn2 > .fa | 
    driver.findElement(By.cssSelector("#editBtn2 > .fa")).click();
    // 8 | click | css=.column:nth-child(2) > .center:nth-child(1) | 
    driver.findElement(By.cssSelector(".column:nth-child(2) > .center:nth-child(1)")).click();
    // 9 | type | id=playerInput2 | Ka!!?
    driver.findElement(By.id("playerInput2")).sendKeys("Ka!!?");
    // 10 | click | css=#okBtn2 > .fa | 
    driver.findElement(By.cssSelector("#okBtn2 > .fa")).click();
    // 11 | assertAlert | Player name should be at least 1 character, and can't contain special characters.Please choose another name. |
    assertThat(driver.switchTo().alert().getText(), is("Player name should be at least 1 character, and can\'t contain special characters.\n Please choose another name."));
    // 12 | click | css=.column:nth-child(2) | 
    driver.findElement(By.cssSelector(".column:nth-child(2)")).click();
    // 13 | click | css=.column2:nth-child(1) .button | 
    driver.findElement(By.cssSelector(".column2:nth-child(1) .button")).click();
  }
}