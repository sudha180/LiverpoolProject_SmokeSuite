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

'facet to check clicked\r\n'
FacetClicked = WebUI.getText(findTestObject('PLPPage/facetes/Facet_Seller_liverpool_PLP'))

WebUI.enhancedClick(findTestObject('PLPPage/facetes/Facet_Seller_liverpool_PLP'))

WebUI.delay(5)

'clicked facet showing above'
FacetClicked2 = WebUI.getText(findTestObject('PLPPage/facetes/selectedfacet1_PLP'), FailureHandling.STOP_ON_FAILURE)

if (FacetClicked == FacetClicked2) {
    System.out.print('facet clicked is facet selected')
}

WebUI.click(findTestObject('PLPPage/facetes/close_facet_liverpool_PLP'))

