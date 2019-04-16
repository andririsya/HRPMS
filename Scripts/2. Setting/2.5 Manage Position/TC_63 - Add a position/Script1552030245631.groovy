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

WebUI.click(findTestObject('Object Repository/Page_Settings  Asyst HRPMS/a_Manage Position'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Position  Asyst HRPMS/select_DirectorateSubordinateSuperior'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_Manage Position  Asyst HRPMS/input_Position Name_1'), 'Staff')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Position  Asyst HRPMS/select_Chief Executive OfficerChief Financial OfficerOSDOSD-5FHRHRSalesOSD-3COO'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Position  Asyst HRPMS/select_--CEOGM OSDManager OSD-3Officer'), 
    '15', true)

WebUI.click(findTestObject('Page_Manage Position  Asyst HRPMS/button_Hierarchy_btn-rounded btn-rounded-outline-success float-left m-r-5'))

