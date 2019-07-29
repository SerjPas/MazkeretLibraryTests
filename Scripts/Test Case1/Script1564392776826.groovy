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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://libraryfront-f1934.firebaseapp.com/home')

WebUI.click(findTestObject('Object Repository/LogIn RP/Page_LibraryBeta/a_person Login'))

WebUI.setText(findTestObject('Object Repository/LogIn RP/Page_LibraryBeta/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('LogIn RP/Page_LibraryBeta/input_Password_password'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/LogIn RP/Page_LibraryBeta/span_Log in'))

WebUI.verifyElementPresent(findTestObject('LogIn RP/Page_LibraryBeta/span_person_outline Logout'), 0)

WebUI.closeBrowser()

