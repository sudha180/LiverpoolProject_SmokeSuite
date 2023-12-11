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

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'), FailureHandling.STOP_ON_FAILURE)

a = WebUI.verifyElementPresent(findTestObject('OPCPage/selectCardOption_save_cardpopup_OPC'),0)

if(a != true) {
WebUI.click(findTestObject('OPCPage/selecte_card _PAYmentChange_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OPCPage/card_sharma_Option_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OPCPage/option3DropDown_eliminor_card_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OPCPage/accept_deletion_card_OPC'))

WebUI.click(findTestObject('OPCPage/card1_OPC'))

WebUI.click(findTestObject('OPCPage/selectCardOption_save_cardpopup_OPC'), FailureHandling.OPTIONAL)

}