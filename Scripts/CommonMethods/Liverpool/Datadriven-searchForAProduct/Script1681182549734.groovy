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

 

TestData loginDetails = findTestData(GlobalVariable.dataFile1)

 

List<String> productNames = loginDetails.getAllData().stream().map({ def data ->

        data[2] /*get first column of each row in data file */

    }).collect(Collectors.toList() /*add collect and parse to list*/ )

 

for (def productNamesList : productNames) {

    WebUI.click(findTestObject('HomePageShubhum/searchTextbox_hp'), FailureHandling.STOP_ON_FAILURE)

 

    WebUI.setText(findTestObject('HomePageShubhum/searchTextbox_hp'), productNamesList)

 

    WebUI.sendKeys(findTestObject('HomePageShubhum/searchTextbox_hp'), Keys.chord(Keys.ENTER))

}