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
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('HomePage/Iniciar sesion'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.username, ('password') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'jeans'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/FirstProduct_plp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_pdp'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('OPCPage/ChangeAddress_Checkout'))

WebUI.click(findTestObject('OPCPage/AddAddressButtonPopup_checkout'))

String StoreValue = 'AUTOMATION' + RandomStringUtils.randomAlphabetic(8)

System.out.println(StoreValue)

WebUI.setText(findTestObject('OPCPage/shortName_addAddress_opc'), StoreValue)

WebUI.setText(findTestObject('OPCPage/mothersLastName_addAddress_opc'), GlobalVariable.MotherName)

WebUI.setText(findTestObject('OPCPage/postalCode_addAddress_opc'), GlobalVariable.PostalCode)

WebUI.setText(findTestObject('OPCPage/city_addAddress_opc'), GlobalVariable.CityAddAddress)

WebUI.click(findTestObject('OPCPage/street_addAddress_opc'))

WebUI.setText(findTestObject('OPCPage/street_addAddress_opc'), GlobalVariable.StreetAddAddress)

WebUI.setText(findTestObject('OPCPage/noExt_addAddress_opc'), GlobalVariable.NoExtAddAddress)

WebUI.setText(findTestObject('OPCPage/cellphone_addAddress_opc'), GlobalVariable.CellPhoneAddAddress)

WebUI.setText(findTestObject('OPCPage/LADA_addAddress_opc'), GlobalVariable.LADAaddAddress)

WebUI.setText(findTestObject('OPCPage/phone_addAddress_opc'), GlobalVariable.phoneAddAddress)

WebUI.click(findTestObject('OPCPage/CheckBoxAddAddressPopup_OPC'))

WebUI.click(findTestObject('OPCPage/ContinueButtonAddAddress_Checkout'))

WebUI.navigateToUrl(GlobalVariable.CartPageURL)

ShortName = WebUI.getText(findTestObject('OPCPage/currentDeliveryAddress_OPC'), FailureHandling.STOP_ON_FAILURE)

if (StoreValue == ShortName) {
    println('Checked')
}

WebUI.closeBrowser()

