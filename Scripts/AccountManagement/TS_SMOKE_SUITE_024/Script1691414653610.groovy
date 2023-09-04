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

WebUI.callTestCase(findTestCase('CommonMethods/logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/Iniciar sesion'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.AMUsername, ('password') : GlobalVariable.AMpassword], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('AccountManagement/DeliveryAddress_Account'))

WebUI.click(findTestObject('AccountManagement/AddAdressPersonal_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SaveAddress_AccountManagment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('AccountManagement/KeepButtonClickNCollection_Account'))

Address1 = WebUI.getText(findTestObject('AccountManagement/AddressTitleFirst_Account'))

if (GlobalVariable.TempAddress == Address1) {
    println('Address Added Successful')
} else {
    KeywordUtil.markFailed('Address is not Added !')
}

WebUI.click(findTestObject('AccountManagement/Select3DotAddress2Nd_Account'))

WebUI.click(findTestObject('AccountManagement/EditCardDetails_Account'), FailureHandling.STOP_ON_FAILURE)

name = CustomKeywords.'customkeywords.myKeywords.randomString'()

GlobalVariable.TempAddress = name

WebUI.clearText(findTestObject('AccountManagement/ShortName_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('AccountManagement/ShortName_Account'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AccountManagement/ShortName_Account'), name)

WebUI.click(findTestObject('AccountManagement/AcceptButton_AccountM'))

Address1 = WebUI.getText(findTestObject('AccountManagement/AddressTitleFirst_Account'))

if (GlobalVariable.TempAddress == Address1) {
    println('Address update Successful')
} else {
    KeywordUtil.markFailed('Address is not Updated !')
}

WebUI.click(findTestObject('AccountManagement/Select3DotAddress2Nd_Account'))

WebUI.click(findTestObject('AccountManagement/RemoveCardDetails_Account'), FailureHandling.STOP_ON_FAILURE)

println(GlobalVariable.TempAddress)

WebUI.verifyTextPresent(GlobalVariable.TempAddress, false)

