import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('0. Prerequisite Step/Login (CEO)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Home  Asyst HRPMS/a_Settings'))

WebUI.click(findTestObject('Page_Settings  Asyst HRPMS/a_User Information'))

WebUI.click(findTestObject('Object Repository/Page_User Information  Asyst HRPMS/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_User Information  Asyst HRPMS/input_Name_1'), 'Tester2')

WebUI.setText(findTestObject('Object Repository/Page_User Information  Asyst HRPMS/input_NIK_1'), 'T00002')

WebUI.setText(findTestObject('Object Repository/Page_User Information  Asyst HRPMS/input_Email_1'), 'tester2mail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_User Information  Asyst HRPMS/select_--Chief Executive Offic'), 
    '293', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_User Information  Asyst HRPMS/select_--Tester'), '294', 
    true)

WebUI.click(findTestObject('Object Repository/Page_User Information  Asyst HRPMS/button_Submit'))

not_run: WebUI.verifyElementPresent(findTestObject('Page_User Information  Asyst HRPMS/div_Email format not valid'), 30)

