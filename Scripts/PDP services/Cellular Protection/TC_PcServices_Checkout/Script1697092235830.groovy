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

WebUI.navigateToUrl(GlobalVariable.URLQA2)

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/EliminarProduct1_whislistFrom_HP_LOGEDIN'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('HomePage/Logo_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'samsung'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product-2-DiscountPrice_PLP'))

WebUI.scrollToElement(findTestObject('PDPPage/ComplementaryServices_Div_PDP'), 0)

WebUI.click(findTestObject('PDPPage/ComplementaryServices_Div_option1_RadioButton_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('PDPPage/AddToCart_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/bag_header_HP'))

WebUI.click(findTestObject('CartPage/product1_BuyNowButton_CartPage'))

WebUI.verifyElementPresent(findTestObject('OPCPage/PcServices_DIV_OPCpage'), 0)

WebUI.verifyElementNotPresent(findTestObject('OPCPage/Product1_name_OPC2'), 0)

WebUI.verifyElementNotPresent(findTestObject('OPCPage/PcServices_Product1_AddToWishlist_OPCpage'), 0)

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'), FailureHandling.OPTIONAL)

WebUI.verifyElementNotClickable(findTestObject('OPCPage/paymentMethod_button2_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('OPCPage/paymentMethod_button3_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OPCPage/paymentMethod_button1_OPC'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('OPCPage/enterCardCVV_OPC'), '413', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('OPCPage/enterCardExpire_OPC'), '1225', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OPCPage/cardContinue_checkout_popUP'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/ComplementaryServices_ConfirmPage_IMG'), 0)

