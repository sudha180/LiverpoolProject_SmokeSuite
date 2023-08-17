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

WebUI.mouseOver(findTestObject('HomePage/Departamentos'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/L1_Category1_HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CLPPage/SubCategory2_leftmenu_CLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CLPPage/SubCategory1_leftmenu_CLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('CLPPage/breadCrumb_clp'))

WebUI.verifyElementPresent(findTestObject('PLPPage/facetes/CategoríasTitleFacet_PLP'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/facetes/DescontousTitleFacet_PLP'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/facetes/TamanoTitleFacet_PLP'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/facetes/MarcasTitleFacet_PLP'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/facetes/VendidoTitleFacet_PLP'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/facetes/PreciosTitleFacet_PLP'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/facetes/ColorTitleFacet_PLP'), 0)

WebUI.closeBrowser()

