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

WebUI.navigateToUrl('https://odtaqaa.liverpool.com.mx/tienda/home')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/delete/Page_Liverpool es parte de Mi vida/span_Iniciar sesin'))

WebUI.setText(findTestObject('Object Repository/delete/Page_Iniciar sesin  Liverpool/input_Correo electrnico_username'), 
    'chenna4@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/delete/Page_Iniciar sesin  Liverpool/input_Contrasea_password'), 
    '/PpfpkOrO7oY1MS/uxZEHg==')

WebUI.click(findTestObject('Object Repository/delete/Page_Iniciar sesin  Liverpool/button_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/delete/Page_Liverpool es parte de Mi vida/span_46'))

WebUI.setText(findTestObject('Object Repository/delete/Page_Liverpool es parte de Mi vida/input_Toys R Us_mainSearchbar'), 
    'iphone')

WebUI.sendKeys(findTestObject('Object Repository/delete/Page_Liverpool es parte de Mi vida/input_Toys R Us_mainSearchbar'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/delete/Page_Liverpool Mxico/button_Comprar'))

WebUI.click(findTestObject('Object Repository/delete/Page_Liverpool Mxico/label_Cambiar'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/delete/Page_Liverpool Mxico/img_Tarjetas  Monedero_paypalImage'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/delete/Page_Liverpool Mxico/button_Efectivo y Transferencias'))

WebUI.setText(findTestObject('Object Repository/delete/Page_Liverpool Mxico/input_text'), '12/26')

WebUI.setEncryptedText(findTestObject('Object Repository/delete/Page_Liverpool Mxico/input_Cdigo de seguridad'), 'l1ZPz5O+sm4=')

WebUI.click(findTestObject('Object Repository/delete/Page_Liverpool Mxico/button_Continuar'))

WebUI.click(findTestObject('Object Repository/delete/Page_Liverpool Mxico/div_37 de Descuento'))

WebUI.click(findTestObject('Object Repository/delete/Page_Liverpool Mxico/span_en monedero electrnico'))

WebUI.click(findTestObject('Object Repository/delete/Page_Liverpool Mxico/button_Finalizar compra'))

WebUI.verifyElementText(findTestObject('Object Repository/delete/Page_/strong_Plan Superior de 2 aos'), 'Plan Superior de 2 años:')

WebUI.verifyElementText(findTestObject('Object Repository/delete/Page_/div_28 de octubre-07 de noviembre'), '28 de octubre-07 de noviembre')

WebUI.closeBrowser()

