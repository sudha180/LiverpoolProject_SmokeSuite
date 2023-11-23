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

WebUI.click(findTestObject('HomePage/Iniciar sesion'))

WebUI.callTestCase(findTestCase('CommonMethods/CreateNewAccount_LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('AccountManagement/Mis formas de pago'))

WebUI.click(findTestObject('AccountManagement/Tiempo_aire_MyAccount'))

WebUI.click(findTestObject('AccountManagement/ATT/Agregar_teléfono_ATT'))

WebUI.setText(findTestObject('AccountManagement/ATT/EnterPhoneNumberNew_ATT'), '8888390349')

WebUI.setText(findTestObject('AccountManagement/ATT/EnterName_NumberNew_ATT'), 'new number')

WebUI.click(findTestObject('AccountManagement/ATT/Companie_NewNumber_ATT'))

WebUI.click(findTestObject('AccountManagement/ATT/CompanieOptionATTandT_NewNumber_ATT'))

WebUI.click(findTestObject('AccountManagement/ATT/Agregar_POPup_ATT'))

WebUI.click(findTestObject('AccountManagement/ATT/checkbox1_MyAccount'))

WebUI.click(findTestObject('AccountManagement/ATT/Agregar_tarjeta_ATT'))

WebUI.callTestCase(findTestCase('CommonMethods/create_new_BBVApuntosCARD'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AccountManagement/ATT/card_cvv_ATT_MyAccount'), '321')

WebUI.click(findTestObject('AccountManagement/ATT/selectYear_ATT_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ATT/selectYear_ATT_option2025_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ATT/SelectMonth_ATT_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ATT/SelectMonth_ATT_optionMarch_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ATT/Ussar_BBVA_Puntos_Checkbox_ATT'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('AccountManagement/ATT/MessageBelow_CheckBox_ATT'), 'Se tomarán los puntos disponibles, si no cubren el monto total, se tomará la diferencia del crédito de tu tarjeta')

WebUI.click(findTestObject('AccountManagement/ATT/finalize_recharge_MyAccount'), FailureHandling.STOP_ON_FAILURE)

