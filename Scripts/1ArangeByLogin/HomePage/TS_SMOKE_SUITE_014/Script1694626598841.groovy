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

WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('AccountManagement/UpdatePeronalData_Account'))

WebUI.verifyElementPresent(findTestObject('AccountManagement/firstName_update_accountManagement'), 0)

WebUI.waitForPageLoad(0)

Name = 'harish'

//WebUI.click(findTestObject('AccountManagement/firstName_update_accountManagement'), FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('AccountManagement/firstName_update_accountManagement'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AccountManagement/firstName_update_accountManagement'), Keys.chord(Keys.BACK_SPACE))

WebUI.clearText(findTestObject('AccountManagement/firstName_update_accountManagement'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('AccountManagement/firstName_update_accountManagement'), Name)

System.out.println(Name)

WebUI.click(findTestObject('AccountManagement/UpdateButton_Account'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementText(findTestObject('HomePage/header_Hola_text_HP'), 'Hola ' + Name)

