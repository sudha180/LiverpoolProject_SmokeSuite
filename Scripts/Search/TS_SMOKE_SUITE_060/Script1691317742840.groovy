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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'mac'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('PLPPage/facetes/Facet_Seller_liverpool_PLP'), 0)

a = WebUI.getText(findTestObject('PLPPage/Facet_Seller_liverpool_title_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/facetes/Facet_Seller_liverpool_PLP'), FailureHandling.STOP_ON_FAILURE)

b = WebUI.getText(findTestObject('PLPPage/facetes/selectedfacet1_PLP'))

System.out.println(a)

System.out.println(b)

if (a.contains(b)) {
    System.out.println('facet selected')
} else {
    WebUI.acceptAlert()

    KeywordUtil.markFailed('failed facet not selected')
}

