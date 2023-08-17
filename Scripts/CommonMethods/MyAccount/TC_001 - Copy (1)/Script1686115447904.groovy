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

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('CartPage/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : '1031144554'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPpage/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPpage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 350)

WebUI.click(findTestObject('PDPpage/StickyBar_Comprar_Ahora_PDP'))

WebUI.click(findTestObject('CartPage/button_Comprarahora_cart (1)'))

WebUI.click(findTestObject('OPCPage/changeADDRESS_OPC'))

WebUI.click(findTestObject('OPCPage/clickAndCollect_OPC'))

WebUI.verifyElementPresent(findTestObject('OPCPage/SeleccionUNA_Tienda(CNC)_OPC (1)'), 0)

WebUI.closeBrowser()

