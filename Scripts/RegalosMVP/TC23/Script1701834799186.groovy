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
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso high ball'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PLPPage/product_regalos_can_comprare_1_PLP'), 0)

WebUI.click(findTestObject('PLPPage/product1_PLP'), FailureHandling.STOP_ON_FAILURE)

a = WebUI.getText(findTestObject('PDPPage/RegalosPromotionName1_PDP'))
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
int j=1

List<WebElement> elements = driver.findElements(By.xpath('//ul[@class="header_position_change mt-2 ml-0 p-0 list-content"]/li'))


for (int i = 0;  i < elements.size(); ++i) {
	KeywordUtil.logInfo(elements.size())
	KeywordUtil.logInfo(elements.print('REGALO POR MONTO - Compra Min $1000.00 - 50% DE DESCUENTO'))
	KeywordUtil.logInfo(elements.get(i).toString())
	 System.out.println(elements)
	j=j+1
}