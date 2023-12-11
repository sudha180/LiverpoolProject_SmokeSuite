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

WebUI.navigateToUrl(GlobalVariable.GAP)

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLSearchTerm], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/FirstProduct_plp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_pdp'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'))

WebUI.scrollToElement(findTestObject('OPCPage/Putos_card1_CardPopup_OPC'), 0)

WebUI.click(findTestObject('OPCPage/Putos_card1_CardPopup_OPC'))

WebUI.setText(findTestObject('OPCPage/enterCardCVV_OPC'), '243')

WebUI.setText(findTestObject('OPCPage/enterCardExpire_OPC'), '1226')

WebUI.click(findTestObject('OPCPage/Continue_OPC'))

WebUI.click(findTestObject('OPCPage/BBVAputos_CheckBox_OPC'))

WebUI.click(findTestObject('OPCPage/Final_comparar_OPC'))

