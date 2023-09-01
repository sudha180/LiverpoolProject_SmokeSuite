import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\DELL\\AppData\\Local\\Temp\\Katalon\\Test Cases\\AccountManagement\\TS_SMOKE_SUITE_023\\20230831_111209\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

not_run: WebUI.click(findTestObject('HomePage/Iniciar sesion'))

not_run: WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForPageLoad(0)

not_run: WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

not_run: WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

not_run: WebUI.click(findTestObject('AccountManagement/MyPaymentMethod_Account'))

not_run: WebUI.click(findTestObject('AccountManagement/MyCardButton_Account'))

not_run: WebUI.click(findTestObject('AccountManagement/AddCardButton_Account'), FailureHandling.STOP_ON_FAILURE)

not_run: Cardname = CustomKeywords.'customkeywords.myKeywords.randomString'()

not_run: WebUI.setText(findTestObject('AccountManagement/CardName_Account'), Cardname)

not_run: WebUI.callTestCase(findTestCase('CommonMethods/AddCard_Account'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForPageLoad(0)

not_run: CardName = WebUI.getText(findTestObject('AccountManagement/CardNameGrid_Account'))

not_run: if (Cardname == CardName) {
    println('Add Card Successful')
} else {
    KeywordUtil.markFailed('Card is not Added !')
}

not_run: WebUI.click(findTestObject('AccountManagement/Select3DotAddress2Nd_Account'))

not_run: WebUI.click(findTestObject('AccountManagement/EditCardDetails_Account'), FailureHandling.STOP_ON_FAILURE)

not_run: Cardname = CustomKeywords.'customkeywords.myKeywords.randomString'()

Name = CustomKeywords.'customkeywords.myKeywords.randomString'()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('AccountManagement/firstName_update_accountManagement'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AccountManagement/firstName_update_accountManagement'), Keys.chord(Keys.BACK_SPACE))

WebUI.clearText(findTestObject('AccountManagement/firstName_update_accountManagement'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.setText(findTestObject('AccountManagement/firstName_update_accountManagement'), Name)

WebUI.setText(findTestObject('AccountManagement/firstName_update_accountManagement'), Name)

WebUI.setText(findTestObject('AccountManagement/CardName_Account'), Cardname)

WebUI.click(findTestObject('AccountManagement/AcceptButton_AccountM'))

CardName = WebUI.getText(findTestObject('AccountManagement/CardNameGrid_Account'))

if (Cardname == CardName) {
    println('Cart Update Successful')
} else {
    KeywordUtil.markFailed('Card is not updated !')
}

WebUI.click(findTestObject('AccountManagement/Select3DotAddress2Nd_Account'))

WebUI.click(findTestObject('AccountManagement/RemoveCardDetails_Account'), FailureHandling.STOP_ON_FAILURE)

if (Cardname == null) {
    println('Card remove Successful')
} else {
    KeywordUtil.markFailed('Card is not Removed !')
}

WebUI.closeBrowser()

''', 'Test Cases/AccountManagement/TS_SMOKE_SUITE_023', new TestCaseBinding('Test Cases/AccountManagement/TS_SMOKE_SUITE_023',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
