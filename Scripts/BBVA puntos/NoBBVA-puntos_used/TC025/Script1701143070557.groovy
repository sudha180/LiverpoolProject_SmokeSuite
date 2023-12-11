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

WebUI.click(findTestObject('AccountManagement/Tiempo_aire_MyAccount'))

WebUI.click(findTestObject('AccountManagement/ATT/checkbox1_MyAccount'))

WebUI.setText(findTestObject('AccountManagement/ATT/card_cvv_ATT_MyAccount'), '321')

WebUI.click(findTestObject('AccountManagement/ATT/selectYear_ATT_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ATT/selectYear_ATT_option2025_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ATT/SelectMonth_ATT_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ATT/SelectMonth_ATT_optionMarch_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('AccountManagement/ATT/Ussar_BBVA_Puntos_Checkbox_ATT'), 0)

WebUI.click(findTestObject('AccountManagement/ATT/finalize_recharge_MyAccount'))

'verify thank you page'
WebUI.verifyElementPresent(findTestObject('ConfirmationPage/gracias_por_comprar_CP'), 0)

