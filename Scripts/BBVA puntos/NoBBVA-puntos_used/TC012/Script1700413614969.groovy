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

WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('AccountManagement/Mis formas de pago'))

WebUI.click(findTestObject('AccountManagement/PuntosHelpOptionButton_AM'))

WebUI.verifyElementPresent(findTestObject('AccountManagement/PuntosHelp_PopUp_Header_AM'), 0)

WebUI.verifyElementPresent(findTestObject('AccountManagement/PuntosIMG_PuntosHelpPopUp_AM'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/close_popup_OPC'), 0)

WebUI.click(findTestObject('OPCPage/close_popup_OPC'), FailureHandling.STOP_ON_FAILURE)

