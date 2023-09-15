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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SL1], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('HomePage/bag_header_HP'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'))

WebUI.click(findTestObject('OPCPage/paymentMethod_button2_OPC'))

WebUI.click(findTestObject('OPCPage/label_Cambiar_payment_opc'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/paypal(changepaymentmethod)pay'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OPCPage/button_Continuar_payment_opc'))

WebUI.click(findTestObject('OPCPage/Final_paypal_final(terminar)_OPC'))

WebUI.verifyElementPresent(findTestObject('OPCPage/ConfirmOrder_Checkout'), 0)

WebUI.click(findTestObject('HomePage/logo_confirmPage'))

