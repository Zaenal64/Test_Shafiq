import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://www.shafiq.id/signup/form/corporate')

WebUI.verifyElementVisible(findTestObject('Register/input_KataSandi'))

CustomKeywords.'main.GuestKeyword.Input_CorErrorSandi1'()

WebUI.verifyElementVisible(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

errorText = WebUI.getText(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

com.kms.katalon.core.util.KeywordUtil.logInfo('Error Text: ' + errorText)

WebUI.verifyMatch(errorText, Expected, false)

CustomKeywords.'main.GuestKeyword.Input_CorErrorSandi2'()

WebUI.verifyElementVisible(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

errorText = WebUI.getText(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

com.kms.katalon.core.util.KeywordUtil.logInfo('Error Text: ' + errorText)

WebUI.verifyMatch(errorText, Expected, false)

CustomKeywords.'main.GuestKeyword.Input_CorErrorSandi3'()

WebUI.verifyElementVisible(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

errorText = WebUI.getText(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

com.kms.katalon.core.util.KeywordUtil.logInfo('Error Text: ' + errorText)

WebUI.verifyMatch(errorText, Expected, false)

CustomKeywords.'main.GuestKeyword.Input_CorErrorSandi4'()

WebUI.verifyElementVisible(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

errorText = WebUI.getText(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

com.kms.katalon.core.util.KeywordUtil.logInfo('Error Text: ' + errorText)

WebUI.verifyMatch(errorText, Expected, false)

CustomKeywords.'main.GuestKeyword.Input_CorErrorSandi5'()

WebUI.verifyElementVisible(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

errorText = WebUI.getText(findTestObject('Register/ErrorMessage_HarusMinimal8Karakter'))

com.kms.katalon.core.util.KeywordUtil.logInfo('Error Text: ' + errorText)

WebUI.verifyMatch(errorText, Expected, false)

