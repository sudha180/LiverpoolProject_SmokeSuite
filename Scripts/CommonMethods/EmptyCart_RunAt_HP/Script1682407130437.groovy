import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//import org.openqa.selenium.webdriver.chrome.options;
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.WebElement as WebElement
import java.util.jar.JavaUtilJarAccessImpl as JavaUtilJarAccessImpl
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//ChromeOptions chromeOptions = new ChromeOptions();
//WebDriver driver = new ChromeDriver(chromeOptions); 
//DriverFactory.changeWebDriver(driver)
//List<WebElement>removeList = driver.findElements(By.xpath("//div[@class='t-myBag__productList']//div[@class='o-myBag o-myBag--giftTable sku_id_delivery_date']"));
//List<WebElement> wes = WebUiCommonHelper.findWebElements(WebUI.verifyElementPresent(findTestObject('1vedant/PDP/Product1_remove_cart')))
WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('HomePage/bag_header_HP'), FailureHandling.OPTIONAL)

List<WebElement> listElement = WebUI.findWebElements(findTestObject('CartPage/Product1_remove_cart'), 2)

String noOfProducts = listElement.size()

KeywordUtil.logInfo(noOfProducts)

for (int i = 0; i < noOfProducts; i++) {
    // removeList.get(i).click(); 
    WebUI.click(findTestObject('CartPage/Product1_remove_cart'))

    WebUI.delay(2)

    if (noOfProducts == 0) {
        break
    }
}

WebUI.click(findTestObject('HomePage/Logo_hp'), FailureHandling.OPTIONAL)

