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

WebUI.waitForElementPresent(findTestObject('Page_Login  HR Performance Manageme/input_Please sign in to your a'), 30)

WebUI.setText(findTestObject('Page_Login  HR Performance Manageme/input_Please sign in to your a'), 'ceo@asyst.co.id')

WebUI.setText(findTestObject('Page_Login  HR Performance Manageme/input_Please sign in to your a_1'), '3')

WebUI.setEncryptedText(findTestObject('Page_Login  HR Performance Manageme/input_Please sign in to your a_2'), 'aiU3LviASZw=')

WebUI.setEncryptedText(findTestObject('Page_Login  HR Performance Manageme/input_Please sign in to your a_3'), 'ZqMS1fD2yQM=')

WebUI.setEncryptedText(findTestObject('Page_Login  HR Performance Manageme/input_Please sign in to your a_4'), 'ZqMS1fD2yQM=')

WebUI.click(findTestObject('Page_Login  HR Performance Manageme/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Page_Login  HR Performance Manageme/div_Authentication Failed'), 30)

