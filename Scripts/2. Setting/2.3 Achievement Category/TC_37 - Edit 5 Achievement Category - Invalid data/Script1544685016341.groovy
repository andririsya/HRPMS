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

WebUI.click(findTestObject('Page_Settings  Asyst HRPMS/a_Achievement Category'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/button_Edit'), 30)

WebUI.click(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/button_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/select_3 achievements4 achieve'), 
    '5', true)

WebUI.setText(findTestObject('Page_Achievement Category  Asyst HR/input_Select Amount of Achieve1'), 'Above')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Min.Value Achievement_1'), '100')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Max.Value Achievement_1'), '76')

WebUI.setText(findTestObject('Page_Achievement Category  Asyst HR/input_Select Amount of Achieve2'), 
    'Middle')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Min.Value Achievement_1'), '75')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Max.Value Achievement_1'), '51')

WebUI.setText(findTestObject('Page_Achievement Category  Asyst HR/input_Select Amount of Achieve3'), 
    'Below')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Min.Value Achievement_1'), '50')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Max.Value Achievement_1'), '26')

WebUI.setText(findTestObject('Page_Achievement Category  Asyst HR/input_Select Amount of Achieve4'), 
    'Low')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Min.Value Achievement_1'), '25')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Max.Value Achievement_1'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Max.Value Achievement_1_40'), 
    'Up')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Min.Value Achievement_1'), '101')

WebUI.setText(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/input_Max.Value Achievement_1'), '125')

WebUI.click(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Achievement Category  Asyst HR/div_Max.Value Must Be Greater'), 
    30)

