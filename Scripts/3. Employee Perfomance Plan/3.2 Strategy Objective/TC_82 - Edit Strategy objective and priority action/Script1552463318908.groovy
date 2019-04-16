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

WebUI.click(findTestObject('Page_Home  Asyst HRPMS/i_Strategic Objective Form_icon dripicons-checklist'))

WebUI.click(findTestObject('Page_Home  Asyst HRPMS/span_Not Published_Strategy Objective'))

WebUI.waitForElementVisible(findTestObject('Page_Setup  Asyst HRPMS/a_Strategy ObjectiveDeleteEdit'), 30)

WebUI.click(findTestObject('Page_Setup  Asyst HRPMS/a_Strategy ObjectiveDeleteEdit'))

WebUI.setText(findTestObject('Page_Setup  Asyst HRPMS/input_Priority Action_1'), 'Edited')

WebUI.setText(findTestObject('Page_Setup  Asyst HRPMS/input_Control Point_1'), 'Edit priority action')

WebUI.setText(findTestObject('Page_Setup  Asyst HRPMS/input_Delete_1'), '50')

WebUI.setText(findTestObject('Page_Setup  Asyst HRPMS/input_Target_1'), 'Tst')

WebUI.setText(findTestObject('Page_Setup  Asyst HRPMS/input_Above_1'), '60%')

WebUI.setText(findTestObject('Page_Setup  Asyst HRPMS/input_Middle_1'), '45%')

WebUI.setText(findTestObject('Page_Setup  Asyst HRPMS/input_Below_1'), '30%')

WebUI.click(findTestObject('Page_Setup  Asyst HRPMS/button_Submit'))

