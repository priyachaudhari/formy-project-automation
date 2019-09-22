import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestSelenium {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "/webdrivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        /* File upload */
//
//        WebElement uploadFile = driver.findElement(By.id("file-upload-field"));
//        uploadFile.sendKeys("IMG-20170914-152537.JPG");

        /* dropdown menu */

//        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
//        dropdown.click();
//
//        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
//        autocompleteItem.click();

        /* date picker */

//        WebElement datepicker = driver.findElement(By.id("datepicker"));
//        datepicker.sendKeys("09/25/2019");
//        datepicker.sendKeys(Keys.RETURN); //to click enter after selecting a date

        /* Radio Button (Checkboxes can be automated in the same way*/

//        WebElement radiobutton1 = driver.findElement(By.id("radiobutton1"));
//        radiobutton1.click();
//
//        WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value ='option2']"));
//        radiobutton2.click();
//
//        WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
//        radiobutton3.click();

        /* Drag and drop image into box. Get */
//        WebElement image = driver.findElement(By.id("image"));
//
//        WebElement box = driver.findElement(By.id("box"));
//
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(image,box).build().perform();

        /* Javascript executor */
//        WebElement modalButton = driver.findElement(By.id("modal-button"));
//        modalButton.click();
//
//        WebElement closeButton = driver.findElement(By.id("close-button"));
//        JavascriptExecutor js = (JavascriptExecutor)driver;

        /* modal button will be clicked, the modal opens. Then the javascript executor
        * will execute a simple script to press closed button*/
//        js.executeScript("arguments[0].click();", closeButton);

        /* Alert functionality */
//        WebElement alert = driver.findElement(By.id("alert-button"));
//        alert.click();
//
//        Alert alert1 = driver.switchTo().alert();
//        alert1.accept(); //Used to close the alert box

        /* Open new Tab*/
//        WebElement button = driver.findElement(By.id("new-tab-button"));
//        button.click();
//
//        String originalHandle = driver.getWindowHandle();
//
//        //Iterate through 2 tabs. Test focuses on 2nd tab that opens
//        for(String handle1:driver.getWindowHandles()){
//            driver.switchTo().window(handle1);
//        }
//
//        //switch back to first tab
//        driver.switchTo().window(originalHandle);

        /* Scrolling down the page */
//        WebElement name = driver.findElement(By.id("name"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(name);
//        name.sendKeys("Priya Chaudhari");
//
//        WebElement date = driver.findElement(By.id("date"));
//        date.sendKeys("09/21/2019");
//        Thread.sleep(1000);

        /* autocomplete functionality */
//        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//        autocomplete.sendKeys("29399 Dixon St, Hayward, CA");

        /* Explicit wait example*/
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        WebElement autocompleteresult = wait.until(ExpectedConditions
//                .visibilityOfElementLocated(By.className("pac-item")));
//        autocompleteresult.click();

        /* Implicit wait example */
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
//        autocompleteresult.click();

        /* button click */
//        WebElement name = driver.findElement(By.id("name"));
//        name.click();
//        name.sendKeys("Priya Chaudhari");
//
//        WebElement button = driver.findElement(By.id("button"));
//        button.click();

        //Thread.sleep(1000);
        //driver.quit();
    }
}
