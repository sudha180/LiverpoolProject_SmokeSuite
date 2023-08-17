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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'set'], FailureHandling.STOP_ON_FAILURE)

a = CustomKeywords.'a.GenerateRandomEmail.generateRandomEmail'()

System.out.println(a)

WebUI.click(findTestObject('PLPPage/product1_PLP'))

WebUI.verifyElementClickable(findTestObject('PDPPage/ProductName_PDP'))

WebUI.verifyElementClickable(findTestObject('PDPPage/ProductID_pdp'))

WebUI.verifyElementClickable(findTestObject('PDPPage/discountPrice_PDP'))

WebUI.verifyElementClickable(findTestObject('PDPPage/Colour1_PDP'))

WebUI.verifyElementClickable(findTestObject('PDPPage/Alternate_Img_pdp'))

WebUI.verifyElementClickable(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.verifyElementClickable(findTestObject('PDPPage/Detail_PDP'))

WebUI.verifyElementClickable(findTestObject('PDPPage/breadCrumb_pdp'))

WebUI.closeBrowser()

