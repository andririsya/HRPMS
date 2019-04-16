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

WebUI.click(findTestObject('Page_Home  Asyst HRPMS/a_BOEDI SOEHARTO'))

WebUI.click(findTestObject('Page_Home  Asyst HRPMS/a_Setting'))

WebUI.click(findTestObject('Page_Settings  Asyst HRPMS/a_Manage Period'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/button_Edit'), 30)

WebUI.click(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/button_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/select_Select Period monthPer'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/div_Period 1First MonthSelectJ'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/select_SelectJanuaryFebruaryMa'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/div_Period 2First MonthSelectJ'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/select_SelectJanuaryFebruaryMa'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/div_Period 3First MonthSelectJ'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/select_SelectJanuaryFebruaryMa'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/div_Period 4First MonthSelectJ'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/select_SelectJanuaryFebruaryMa'), 
    '10', true)

WebUI.click(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Period  Asyst HRPMS/div_Success period Setting'), 
    0)

