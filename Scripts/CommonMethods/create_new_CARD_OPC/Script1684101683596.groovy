import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
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

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OPCPage/Payment_Method_Card_OPC'), FailureHandling.OPTIONAL)

'to set card as default card\r\n'
WebUI.click(findTestObject('OPCPage/addnewcard_Popup_OPC'), FailureHandling.OPTIONAL)

String cardnumber = '4111111' + RandomStringUtils.randomNumeric(9)

System.out.println(cardnumber)

String cardname = RandomStringUtils.randomAlphabetic(8)

WebUI.setText(findTestObject('OPCPage/newCardNumber_OPC'), cardnumber)

WebUI.setText(findTestObject('OPCPage/EnterCardAlias_OPC'), cardname)

WebUI.setText(findTestObject('OPCPage/enterCardName_OPC'), 'vedant')

WebUI.setText(findTestObject('OPCPage/newCard_expireDATE_POPup_Addcard_OPC'), '12/24')

WebUI.setText(findTestObject('OPCPage/enterCardCVV_OPC'), '123')

WebUI.click(findTestObject('OPCPage/selectAddress_Card_create_popup'))

WebUI.click(findTestObject('OPCPage/AddCard_continue_POPup_OPC'))

WebUI.delay(4)

WebUI.callTestCase(findTestCase('CommonMethods/close any pop up'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'))

WebUI.click(findTestObject('OPCPage/paymentMethod_button1_OPC'))

WebUI.verifyTextPresent(cardname, false)

WebUI.callTestCase(findTestCase('CommonMethods/close any pop up'), [:], FailureHandling.OPTIONAL)

