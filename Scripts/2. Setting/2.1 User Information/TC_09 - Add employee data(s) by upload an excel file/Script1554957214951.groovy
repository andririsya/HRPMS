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

WebUI.click(findTestObject('Page_User Information  Asyst HRPMS/button_Toggle'))

WebUI.click(findTestObject('Page_User Information  Asyst HRPMS/a_Upload a File'))

WebUI.uploadFile(findTestObject('Page_User Information  Asyst HRPMS/input'), 'C:\\Users\\Administrator\\Downloads\\employeeTemplate.xlsx')

WebUI.click(findTestObject('Page_User Information  Asyst HRPMS/button_Upload'))

