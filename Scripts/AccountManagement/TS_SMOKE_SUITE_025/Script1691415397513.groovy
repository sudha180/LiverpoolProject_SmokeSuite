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

 

WebUI.maximizeWindow()

 

WebUI.click(findTestObject('HomePage/Iniciar sesion'))

 

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.AMUsername, ('password') : GlobalVariable.AMpassword], 
    FailureHandling.STOP_ON_FAILURE)

 

WebUI.delay(10)

 

WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

 

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

 

WebUI.click(findTestObject('AccountManagement/ChangePassword_Account'))

 

not_run: WebUI.click(findTestObject('HomePage/username'))

 

not_run: WebUI.setText(findTestObject('HomePage/username'), GlobalVariable.AMUsername)

 

not_run: WebUI.click(findTestObject('HomePage/password'))

 

not_run: WebUI.setText(findTestObject('HomePage/password'), GlobalVariable.AMpassword)

 

not_run: WebUI.click(findTestObject('HomePage/action'))

 

WebUI.click(findTestObject('AccountManagement/ContinueButton_Account'))

 

WebUI.verifyElementPresent(findTestObject('AccountManagement/MailConfirmation_Account'), 0)

 