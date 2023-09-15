import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as KeywordUtil

boolean a = WebUI.getText(findTestObject('HomePage/span_HolaUser_hp'), FailureHandling.OPTIONAL)

System.out.println(a)

if (a == false) {
    WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.OPTIONAL)
}

WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('AccountManagement/DeliveryAddress_Account'))

WebUI.click(findTestObject('AccountManagement/AddAdressPersonal_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SaveAddress_AccountManagment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/KeepButtonClickNCollection_Account'))

address = WebUI.getText(findTestObject('AccountManagement/NOTselected_personal_ShippingAddress1_AM'), FailureHandling.STOP_ON_FAILURE)

System.out.println(address)

System.out.println(GlobalVariable.TempAddress)

if (GlobalVariable.TempAddress == address) {
    println('Address is Added!')
} else {
    KeywordUtil.markFailed('Address is not Added !')
}

