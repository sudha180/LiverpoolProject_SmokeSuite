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

'TC_BS_119,"To verify the user is able to click “Ver Disponsibilidad en tienda” link for the  Big ticket item on the PDP\r\n"\r\r\n'
WebUI.click(findTestObject('PDPpage/ITRLink_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PDPpage/ItrPopup_pdp'), 0)

'TC_BS_120,To verify the display of state pop-up  on clicking “Ver Disponsibilidad en tienda” link for bigticket item'
WebUI.verifyElementPresent(findTestObject('PDPpage/productName_itrPopup'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/productId_itrPopup'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/productImage_itrPopup'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/productPrice__itrPopup'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/listOfStates_itrPopup'), 0)

'TC_BS_122,To verify the display of list of States in the drop down on selection\r\n'
WebUI.verifyElementPresent(findTestObject('PDPpage/listOfStates_itrPopup'), 0)

'TC_BS_121,To verify the  user is able to select state from the drop down on the pop up on clicking on “Ver Disponsibilidad en tienda” link for bigticket item\r\r\n'
WebUI.click(findTestObject('PDPpage/selectState9_itrPopup'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PDPpage/selectedStateDisplay__itrPopup'), 0)

'TC_BS_123,To verify the display of stores available in the state pop-up'
WebUI.verifyElementPresent(findTestObject('PDPpage/listOfStores__itrPopup'), 0)

'TC_BS_124,To verify the display of 2 radio buttons to select options - Todas las Tiendas(All stores) and Solo tiendas con disponibilidad(Availability shops only) in the state pop-up'
WebUI.verifyElementPresent(findTestObject('PDPpage/conDisponsibilidad__itrPopup'), 0)

'TC_BS_125,To verify the display of  Todas las Tiendas(All stores)  radio button selected by default in state pop up\r\n'
WebUI.verifyElementPresent(findTestObject('PDPpage/listOfStores__itrPopup'), 0)

WebUI.click(findTestObject('PDPpage/close__itrPopup'))

