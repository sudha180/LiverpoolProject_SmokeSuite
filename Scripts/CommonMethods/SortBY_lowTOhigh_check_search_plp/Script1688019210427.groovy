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

WebUI.click(findTestObject('PLPPage/Sortby_PLP'))

WebUI.click(findTestObject('PLPPage/LowPricetoHighSortBy_PLP'))

productDisprice1 = WebUI.getText(findTestObject('PLPPage/product-1-DiscountPrice_PLP'))

productDisprice2 = WebUI.getText(findTestObject('PLPPage/product-2-DiscountPrice_PLP'))

productDisprice3 = WebUI.getText(findTestObject('PLPPage/product-3-DiscountPrice_PLP'))

if (productDisprice1 <= productDisprice2) {
    println('checked1')
} else {
    FailureHandling.STOP_ON_FAILURE
}

if (productDisprice2 <= productDisprice3) {
    println('checked2')
} else {
    WebUI.closeBrowser()
}

