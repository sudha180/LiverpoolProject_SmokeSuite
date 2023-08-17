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

WebUI.click(findTestObject('HomePage/LoginButton_hp'))

WebUI.click(findTestObject('AccountManagement/CreateAccount_Account'))

Email = CustomKeywords.'customkeywords.myKeywords.generateRandomEmail'()

WebUI.setText(findTestObject('AccountManagement/input_Correo electrnico_email_AM'), Email)

WebUI.setText(findTestObject('AccountManagement/input_Contrasea_password_AM'), 'test12345')

WebUI.click(findTestObject('AccountManagement/CreateAccountMainPage_Account'))

WebUI.setText(findTestObject('AccountManagement/NameField_CreateAccount'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('AccountManagement/LastName_CreateAccount'), GlobalVariable.LastName)

