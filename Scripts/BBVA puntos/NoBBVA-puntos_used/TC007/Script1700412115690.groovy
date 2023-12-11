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

WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('AccountManagement/Mis formas de pago'))

WebUI.verifyElementPresent(findTestObject('AccountManagement/Otros métodos de pago_AM'), 0)

WebUI.verifyElementPresent(findTestObject('AccountManagement/Help_paymentMethod_AM'), 0)

WebUI.click(findTestObject('AccountManagement/MisTarjestra_AM'))

WebUI.click(findTestObject('AccountManagement/AddCardButton_Account'))

Cardname = CustomKeywords.'customkeywords.myKeywords.randomString'()

WebUI.setText(findTestObject('AccountManagement/CardName_Account'), Cardname)

WebUI.callTestCase(findTestCase('CommonMethods/AddCard_Account_AM_withPuntos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

CardName = WebUI.getText(findTestObject('AccountManagement/CardNameGrid_Account'))

if (Cardname == CardName) {
    println('Add Card Successful')
} else {
    KeywordUtil.markFailed('Card is not Added !')
}

WebUI.callTestCase(findTestCase('CommonMethods/DeletePuntosCard_AM'), [:], FailureHandling.STOP_ON_FAILURE)

