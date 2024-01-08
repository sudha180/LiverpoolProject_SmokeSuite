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

WebUI.navigateToUrl('http://172.16.213.173:7007/agent/main.jsp?_windowid=32')

WebUI.setText(findTestObject('Object Repository/CSC/loginPage/Username_LP'), 'ccagent1')

WebUI.setText(findTestObject('Object Repository/CSC/loginPage/Password_LP'), 'ccagent1')

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/CSC/loginPage/SubmitButton_LP'))

WebUI.enhancedClick(findTestObject('CSC/HP/Anónimo(clientDetailDropDown)_LP'))

WebUI.click(findTestObject('Object Repository/CSC/HP/BuscarCliente_DropDownOption_LP'))

WebUI.setText(findTestObject('Object Repository/CSC/HP/Nombre_SearchByFirstName_LP'), 'shun')

WebUI.click(findTestObject('Object Repository/CSC/HP/Customer_searchButton_LP'))

WebUI.click(findTestObject('Object Repository/CSC/HP/CustomerOption1_LP'))

WebUI.click(findTestObject('Object Repository/CSC/HP/Buscar(SearchProduct)_NavItem_LP'))

WebUI.click(findTestObject('Object Repository/CSC/SearchPage(Product)/searchProductName_SP'))

WebUI.setText(findTestObject('Object Repository/CSC/SearchPage(Product)/searchProductName_SP'), 'iphone')

WebUI.click(findTestObject('Object Repository/deleteLater/Page_Service Center/li_Agregar producto por SKU'))

WebUI.setText(findTestObject('Object Repository/deleteLater/Page_Service Center/input_Precio total_atg_commerce_csr_catalog_b4aff5'), 
    '1031250389')

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/deleteLater/Page_Service Center/input_11,069.00_submit'), 
    0)

WebUI.click(findTestObject('Object Repository/deleteLater/Page_Service Center/input_11,069.00_submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deleteLater/Page_Service Center/div_Adquiere Proteccin CelularProtege tu eq_9d26fd'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deleteLater/Page_Service Center/div_Ms informacin'), 0)

WebUI.click(findTestObject('Object Repository/deleteLater/Page_Service Center/div_Ms informacin'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/deleteLater/Page_Service Center/dd_Apple iPhone 14 Pro Max 128 GB 6.7 pulgadas'), 
    0)

