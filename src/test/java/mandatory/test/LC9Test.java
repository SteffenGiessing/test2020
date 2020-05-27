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
public class LC9Test {
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
  public void lC9() {
    // Test name: LC_9
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:9000/");
    // 2 | setWindowSize | 1440x877 | 
    driver.manage().window().setSize(new Dimension(1440, 877));
    // 3 | click | id=players | 
    driver.findElement(By.id("players")).click();
    // 4 | select | id=players | label=3
    {
      WebElement dropdown = driver.findElement(By.id("players"));
      dropdown.findElement(By.xpath("//option[. = '3']")).click();
    }
    // 5 | click | id=lifePoint | 
    driver.findElement(By.id("lifePoint")).click();
    // 6 | type | id=lifePoint | 10
    driver.findElement(By.id("lifePoint")).sendKeys("10");
    // 7 | click | id=startButton | 
    driver.findElement(By.id("startButton")).click();
    // 8 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 9 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 10 | doubleClick | id=minusPlayer3 | 
    {
      WebElement element = driver.findElement(By.id("minusPlayer3"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 11 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 12 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 13 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 14 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 15 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 16 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 17 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 18 | click | id=minusPlayer3 | 
    driver.findElement(By.id("minusPlayer3")).click();
    // 19 | assertAlert | Player 3 has lost! | 
    assertThat(driver.switchTo().alert().getText(), is("Player 3 has lost!"));
    // 20 | click | css=.content | 
    driver.findElement(By.cssSelector(".content")).click();
    // 21 | click | css=.column2:nth-child(1) .button | 
    driver.findElement(By.cssSelector(".column2:nth-child(1) .button")).click();
  }
}
