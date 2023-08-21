package main

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class GuestKeyword {
	@Keyword
	def Content_DaftarInvestasi() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Beranda - Guest/Content_DaftarInvestasi'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Beranda - Guest/Content_Gambar_1'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Beranda - Guest/Content_Gambar_2'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Beranda - Guest/Content_Gambar_3'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Beranda - Guest/Content_Gambar_4'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Beranda - Guest/ProgressBar_Gambar2'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Beranda - Guest/InvestmentInformation_gambar2'))
	}

	@Keyword
	def Input_Disable1() {
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KonfirmasiKataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zae')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_Disable2() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jen')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KonfirmasiKataSandi'), 'Sem4ngat')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_Disable3() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KonfirmasiKataSandi'), 'Sem4ngat')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_Disable4() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KonfirmasiKataSandi'), 'Sem')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_Disable5() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zae')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jen')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KonfirmasiKataSandi'), 'Sem')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	
	
}
