import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();

suiteProperties.put('id', 'Test Suites/ArrangeByLogin')
suiteProperties.put('name', 'ArrangeByLogin')
suiteProperties.put('description', 'first only not login test case will run after that 1 login is performed and next all remaining login test case will run')
suiteProperties.put('rerunTestFailImmediately', 'false')
suiteProperties.put('retryCount', '0')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\backup\\LiverpoolProject_SmokeSuite\\Reports\\20230918_095320\\ArrangeByLogin\\20230918_103434\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/ArrangeByLogin', suiteProperties, new File("D:\\backup\\LiverpoolProject_SmokeSuite\\Reports\\20230918_095320\\ArrangeByLogin\\20230918_103434\\testCaseBinding"))
