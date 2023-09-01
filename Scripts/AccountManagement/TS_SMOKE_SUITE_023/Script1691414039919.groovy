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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/Iniciar sesion'))

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('AccountManagement/MyPaymentMethod_Account'))

WebUI.click(findTestObject('AccountManagement/MyCardButton_Account'))

WebUI.click(findTestObject('AccountManagement/AddCardButton_Account'), FailureHandling.STOP_ON_FAILURE)

Cardname = CustomKeywords.'customkeywords.myKeywords.randomString'()

WebUI.setText(findTestObject('AccountManagement/CardName_Account'), Cardname)

WebUI.callTestCase(findTestCase('CommonMethods/AddCard_Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

CardName = WebUI.getText(findTestObject('AccountManagement/CardNameGrid_Account'))

if (Cardname == CardName) {
    println('Add Card Successful')
} else {
    KeywordUtil.markFailed('Card is not Added !')
}

WebUI.click(findTestObject('AccountManagement/Select3DotAddress2Nd_Account'))

WebUI.click(findTestObject('AccountManagement/EditCardDetails_Account'), FailureHandling.STOP_ON_FAILURE)

Name = CustomKeywords.'customkeywords.myKeywords.randomString'()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('AccountManagement/firstName_update_accountManagement'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AccountManagement/firstName_update_accountManagement'), Keys.chord(Keys.BACK_SPACE))

WebUI.clearText(findTestObject('AccountManagement/firstName_update_accountManagement'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.setText(findTestObject('AccountManagement/firstName_update_accountManagement'), Name)

WebUI.setText(findTestObject('AccountManagement/firstName_update_accountManagement'), Name)

WebUI.click(findTestObject('AccountManagement/AcceptButton_AccountM'))

WebUI.click(findTestObject('AccountManagement/Select3DotAddress2Nd_Account'))

WebUI.click(findTestObject('AccountManagement/RemoveCardDetails_Account'), FailureHandling.STOP_ON_FAILURE)

if (Cardname == null) {
    println('Card remove Successful')
} else {
    KeywordUtil.markFailed('Card is not Removed !')
}

WebUI.closeBrowser()

