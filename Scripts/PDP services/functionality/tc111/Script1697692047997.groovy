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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'samsung'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product-2-DiscountPrice_PLP'))

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'samsung'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product-2-DiscountPrice_PLP'))

WebUI.scrollToElement(findTestObject('PDPPage/ComplementaryServices_Div_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/Conoce_Mas_sobre_ComplementaryServices_MoreOption_PDP'), 0)

WebUI.click(findTestObject('PDPPage/Conoce_Mas_sobre_ComplementaryServices_MoreOption_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PDPPage/POP_up_complemntaryServices_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/NoGracias_ComplementaryServices_popup_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/AgregorProtection_ComplementaryServices_popup_PDP - Copy'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/CellulorProtectionLogo_ComplementaryServices_popup_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/StaticText_POPup_ComplementaryServices_PDP'), 0)

WebUI.click(findTestObject('OPCPage/close_popup_OPC'))

WebUI.verifyElementNotPresent(findTestObject('PDPPage/POP_up_complemntaryServices_PDP'), 0)

WebUI.delay(4)

WebUI.click(findTestObject('PDPPage/ComplementaryServices_Div_option1_RadioButton_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementChecked(findTestObject('PDPPage/ComplementaryServices_Div_option1_RadioButton_PDP'), 0)

WebUI.enhancedClick(findTestObject('PDPPage/ComplementaryServices_Div_option2_RadioButton_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotChecked(findTestObject('PDPPage/ComplementaryServices_Div_option1_RadioButton_PDP'), 0)

WebUI.enhancedClick(findTestObject('PDPPage/AddToCart_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/bag_header_HP'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.verifyElementPresent(findTestObject('OPCPage/couponOption_product1_Protection_OPCpage'), 0)

WebUI.click(findTestObject('OPCPage/couponOption_product1_Protection_OPCpage'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('OPCPage/coupons_POP_UP_options_OPCpage'), FailureHandling.STOP_ON_FAILURE)

