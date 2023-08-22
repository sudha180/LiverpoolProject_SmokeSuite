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

WebUI.click(findTestObject('HomePage/Iniciar sesion'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('HomePage/Logo_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLProduct], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('HomePage/bag_header_HP'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

//WebUI.callTestCase(findTestCase('CommonMethods/create_new_CARD_OPC'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'))

WebUI.scrollToElement(findTestObject('OPCPage/card3_Option_OPC'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('OPCPage/card3_Option_OPC'))

WebUI.delay(3)

WebUI.click(findTestObject('OPCPage/option2DropDown_editos_card_OPC'))

WebUI.sendKeys(findTestObject('OPCPage/AddressSection_card_popup_enterPINCODE_OPC'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('OPCPage/AddressSection_card_popup_enterPINCODE_OPC'), Keys.chord(Keys.BACK_SPACE))

WebUI.clearText(findTestObject('OPCPage/AddressSection_card_popup_enterPINCODE_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

cpCode1 = '12000'
cpCode2 = '11100'

cpCode = WebUI.getText(findTestObject('OPCPage/AddressSection_card_popup_enterPINCODE_OPC'), FailureHandling.STOP_ON_FAILURE)

if(cpCode == cpCode1) {
WebUI.setText(findTestObject('OPCPage/AddressSection_card_popup_enterPINCODE_OPC'), cpCode)
}
else {
WebUI.setText(findTestObject('OPCPage/AddressSection_card_popup_enterPINCODE_OPC'), cpCode2)
	
}
WebUI.click(findTestObject('OPCPage/cardContinue_checkout_popUP'))

WebUI.click(findTestObject('OPCPage/cardContinue_checkout_popUP'), FailureHandling.OPTIONAL)

//verifying the edited pincode
WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'))

WebUI.scrollToElement(findTestObject('OPCPage/card3_Option_OPC'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('OPCPage/card3_Option_OPC'))

WebUI.delay(3)

WebUI.click(findTestObject('OPCPage/option2DropDown_editos_card_OPC'))

WebUI.delay(2)

assert WebUI.getText(findTestObject('OPCPage/AddressSection_card_popup_enterPINCODE_OPC')) == cpCode

WebUI.closeBrowser()

