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

WebUI.click(findTestObject('HomePage/Iniciar sesion'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.AMUsername, ('password') : GlobalVariable.AMpassword], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('AccountManagement/UpdatePeronalData_Account'))

WebUI.verifyElementPresent(findTestObject('AccountManagement/updatePage_Account'), 0)

//lastname = WebUI.getText(findTestObject('AccountManagement/LastName_Account'))
name = CustomKeywords.'customkeywords.myKeywords.randomString'()

WebUI.clearText(findTestObject('AccountManagement/FirstNameProfile_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('AccountManagement/FirstNameProfile_Account'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AccountManagement/FirstNameProfile_Account'), name)

def lastname = WebUI.getAttribute(findTestObject('AccountManagement/LastName_Account'), 'value')

println(lastname)

accountname = ((name + ' ') + lastname)

println(accountname)

WebUI.click(findTestObject('AccountManagement/UpdateButton_Account'))

fnamelname = WebUI.getText(findTestObject('AccountManagement/PersonalDataName_Account'))

println(fnamelname)

if (fnamelname == accountname) {
    println('Checked')
} else {
    KeywordUtil.markFailed('Name is not updated !')
}

