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

WebUI.callTestCase(findTestCase('0. Prerequisite Step/Login (COO)'), [:], FailureHandling.STOP_ON_FAILURE)

'Enable when KPI is filled'
not_run: WebUI.callTestCase(findTestCase('3. Employee Perfomance Plan/3.1 Corporate Perfomance Plan/TC_77 - Delete CPP - Directorate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Corporate Perfomance Plan Asyst HR/button_Entry Now'))

WebUI.waitForElementVisible(findTestObject('Page_Corporate Perfomance Plan Asyst HR/button_Add CPP Item'), 30)

WebUI.click(findTestObject('Page_Corporate Perfomance Plan Asyst HR/button_Add CPP Item'))

WebUI.setText(findTestObject('Page_Corporate Perfomance Plan Asyst HR/input_Strategic Initiative_1'), 'Increase')

WebUI.setText(findTestObject('Page_Corporate Perfomance Plan Asyst HR/input_Key Performance Indicato'), 'Revenue')

WebUI.setText(findTestObject('Page_Corporate Perfomance Plan Asyst HR/input_Target_1'), '100M')

WebUI.setText(findTestObject('Page_Corporate Perfomance Plan Asyst HR/input_Weight_1'), '30')

WebUI.click(findTestObject('Page_Corporate Perfomance Plan Asyst HR/i_Weight_icon dripicons-plus g'))

WebUI.setText(findTestObject('Page_Corporate Perfomance Plan Asyst HR/input_Key Performance Indicato'), 'Time')

WebUI.setText(findTestObject('Page_Corporate Perfomance Plan Asyst HR/input_Target_1'), '24 H')

WebUI.setText(findTestObject('Page_Corporate Perfomance Plan Asyst HR/input_Weight_1'), '20')

WebUI.click(findTestObject('Page_Corporate Perfomance Plan Asyst HR/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_Corporate Perfomance Plan Asyst HR/div_Inisiative  Increase'), 0)

