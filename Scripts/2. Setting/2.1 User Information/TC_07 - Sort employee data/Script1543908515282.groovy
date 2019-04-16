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

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/a_BOEDI SOEHARTO'))

WebUI.click(findTestObject('Page_Home  Asyst HRPMS/a_Settings'))

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/a_User Information'))

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/i_Name_icon-lg dripicons-code'))

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/i_Name_icon-lg dripicons-chevr'))

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/i_NIK_icon-lg dripicons-code'))

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/i_NIK_icon-lg dripicons-chevro'))

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/i_Email Address_icon-lg dripic'))

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/i_Email Address_icon-lg dripic_1'))

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/i_Position_icon-lg dripicons-c'))

WebUI.click(findTestObject('Page_SignUp  Asyst HRPMS/i_Position_icon-lg dripicons-c_1'))

