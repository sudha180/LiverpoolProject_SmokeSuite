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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.support.PageFactory as PageFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : '1028042856'], FailureHandling.STOP_ON_FAILURE)

a = WebUI.getText(findTestObject('PDPPage/RegalosPromotionName1_PDP'))

WebUI.click(findTestObject('PDPPage/Quantity_StickyBar_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PDPPage/Quantity_StickyBar_PDP'), '65')

System.out.println(a)

/*
System.setProperty('webdriver.chrome.driver', 'C:\\PATH\\chromedriver_win32\\chromedriver.exe') 
*/
/*
 * 
 * //DriverFactory.changeWebDriver(driver) List noOfPromotions =
 * driver.findElements(By.xpath('//ul[@
 * class="header_position_change mt-2 ml-0 p-0 list-content"]/li'))
 * 
 * System.out.println(noOfPromotions)
 * 
 * for (int i = 0; i < noOfPromotions; i++) { String promotionName =
 * WebUI.getText(findTestObject('//ul[@
 * class="header_position_change mt-2 ml-0 p-0 list-content"]//li[' + i + ']'))
 * 
 * }
 */
WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> pdpelements = driver.findElements(By.xpath('//ul[@class="header_position_change mt-2 ml-0 p-0 list-content"]/li'))

for (WebElement link : pdpelements) {
    System.out.println(link.getText())
}

List<WebElement> pdpList = new ArrayList<String>()

for (WebElement link : pdpelements) {
    pdpList.add(link.getText())
}

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('HomePage/bag_header_HP'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('OPCPage/promotionSection_opc'))

List<WebElement> checkoutelements = driver.findElements(By.xpath('//ul[@class="a-checkout_promoList"]/li'))

for (WebElement link : checkoutelements) {
    System.out.println(link.getText())
}

List<WebElement> checkoutList = new ArrayList<String>()

for (WebElement link : checkoutelements) {
    checkoutList.add(link.getText())
}

if (checkoutList.contains(pdpList)) {
    System.out.println('The lists are equal')
} else {
    System.out.println('The lists are not equal')
}

List<WebElement> discountelements = driver.findElements(By.xpath('//ul[@class="a-checkout_promoList"]//strong'))

