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

import java.util.*

import java.util.stream.Collectors as Collectors

 

WebUI.openBrowser('')

 

WebUI.navigateToUrl(GlobalVariable.LiverpoolProdUrl)

 

WebUI.maximizeWindow()

/*

* WebUI.setText(findTestObject('HomePageShubhum/input_Correo

* electrnico_username_login'), findTestData('Logincredentials').getValue( 1,

* 1))

*/

 

TestData loginDetails = findTestData(GlobalVariable.dataFile1)

 

List<String> userNamesList = loginDetails.getAllData().stream().map({ def data ->

        data[0] /*get first column of each row in data file */

    }).collect(Collectors.toList() /*add collect and parse to list*/ )

 

List<String> passwordsList = loginDetails.getAllData().stream().map({ def data ->

        data[1] /*get first column of each row in data file */

    }).collect(Collectors.toList() /*add collect and parse to list*/ )

 

for (int i = 0; i < userNamesList.size(); i++) {

    //for(def userNames: userNamesList)

    //       for(def passwords: passwordsList)

    WebUI.click(findTestObject('HomePageShubhum/span_Iniciar sesin_hp'))

 

    WebUI.setText(findTestObject('HomePageShubhum/input_Correo electrnico_username_login'), userNamesList.get(i))

 

    WebUI.setText(findTestObject('HomePageShubhum/input_Contrasea_password_login'), passwordsList.get(i))

 

    WebUI.click(findTestObject('HomePageShubhum/button_Iniciar sesin_login'))

 

    WebUI.verifyElementPresent(findTestObject('HomePageShubhum/span_HolaUser_hp'), 0)

 

    WebUI.click(findTestObject('HomePageShubhum/i_accountDropdown_hp'))

 

    WebUI.click(findTestObject('HomePageShubhum/a_Cerrar sesin_hp'))

}