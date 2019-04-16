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

WebUI.click(findTestObject('Page_Manage Unit  Asyst HRPMS/a_Manage Unit'))

WebUI.click(findTestObject('Page_Manage Unit  Asyst HRPMS/div_Unit Name'))

WebUI.click(findTestObject('Page_Manage Unit  Asyst HRPMS/input_Unit Name_1'))

WebUI.waitForElementVisible(findTestObject('Page_Manage Unit  Asyst HRPMS/input_Unit Name_1'), 30)

WebUI.setText(findTestObject('Page_Manage Unit  Asyst HRPMS/input_Unit Name_1'), 'OSD-1')

WebUI.click(findTestObject('Page_Manage Unit  Asyst HRPMS/div_Hierarchy--Chief Executive'))

WebUI.selectOptionByValue(findTestObject('Page_Manage Unit  Asyst HRPMS/select_--Chief Executive Offic'), '305', true)

WebUI.click(findTestObject('Page_Manage Unit  Asyst HRPMS/button_Hierarchy_btn-rounded c'))

