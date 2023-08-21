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
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
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
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_Disable3() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_Disable4() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_Disable5() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zae')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jen')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}

	@Keyword
	def Input_ErrorEmailValid1() {
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23%gmail.com')
	}

	@Keyword
	def Input_ErrorEmailValid2() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail')
	}

	@Keyword
	def Input_ErrorEmailValid3() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@.com')
	}

	@Keyword
	def Input_ErrorEmailValid4() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), '1234')
	}

	@Keyword
	def Input_ErrorEmailValid5() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'abcd')
	}

	@Keyword
	def Input_ErrorSandi1() {
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4nga')
	}

	@Keyword
	def Input_ErrorSandi2() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Semangat')
	}

	@Keyword
	def Input_ErrorSandi3() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'sem4ngat')
	}

	@Keyword
	def Input_ErrorSandi4() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'sema')
	}

	@Keyword
	def Input_ErrorSandi5() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), '1234')
	}

	@Keyword
	def Input_ErrorKonfirmasiSandi1() {
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'S')
	}

	@Keyword
	def Input_ErrorKonfirmasiSandi2() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'S')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
	}

	@Keyword
	def Input_CorDisable1() {
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT ')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_CorDisable2() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jen')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_CorDisable3() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_CorDisable4() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}
	@Keyword
	def Input_CorDisable5() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT ')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jen')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem')
		WebUI.scrollToElement(findTestObject('Object Repository/Register/Button_Daftar_Dissable'), 0)
		WebUI.check(findTestObject('Object Repository/Register/Button_Daftar_Dissable'))
	}

	@Keyword
	def Input_CorErrorEmailValid1() {
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23%gmail.com')
	}

	@Keyword
	def Input_CorErrorEmailValid2() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail')
	}

	@Keyword
	def Input_CorErrorEmailValid3() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@.com')
	}

	@Keyword
	def Input_CorErrorEmailValid4() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), '1234')
	}

	@Keyword
	def Input_CorErrorEmailValid5() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'abcd')
	}

	@Keyword
	def Input_CorErrorSandi1() {
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4nga')
	}

	@Keyword
	def Input_CorErrorSandi2() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Semangat')
	}

	@Keyword
	def Input_CorErrorSandi3() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'sem4ngat')
	}

	@Keyword
	def Input_CorErrorSandi4() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'sema')
	}

	@Keyword
	def Input_CorErrorSandi5() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_NamaLengkap'), 'PT Zaenal')
		WebUI.setText(findTestObject('Object Repository/Register/Input_Email'), 'jenal23@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), '1234')
	}

	@Keyword
	def Input_CorErrorKonfirmasiSandi1() {
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'S')
	}

	@Keyword
	def Input_CorErrorKonfirmasiSandi2() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Register/Input_KataSandi'), 'S')
		WebUI.setText(findTestObject('Object Repository/Register/input_Konfirmasi'), 'Sem4ngat')
	}
	
	@Keyword
	def Input_LogErrorTerlaluPendek1() {
		WebUI.setText(findTestObject('Object Repository/Login/Input_Email'), 'jenalf64@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Login/Input_Kata Sandi'), 'Sem')
	}
	
	@Keyword
	def Input_LogErrorTerlaluPendek2() {
		WebUI.setText(findTestObject('Object Repository/Login/Input_Email'), 'jenalf64@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Login/Input_Kata Sandi'), '123')
	}
	
	@Keyword
	def Input_LogErrorEmailValid1() {
		WebUI.setText(findTestObject('Object Repository/Login/Input_Kata Sandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Login/Input_Email'), 'jenal23%gmail.com')
	}

	@Keyword
	def Input_LogErrorEmailValid2() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Login/Input_Kata Sandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Login/Input_Email'), 'jenal23@gmail')
	}

	@Keyword
	def Input_LogErrorEmailValid3() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Login/Input_Kata Sandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Login/Input_Email'), 'jenal23@.com')
	}

	@Keyword
	def Input_LogErrorEmailValid4() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Login/Input_Kata Sandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Login/Input_Email'), '1234')
	}

	@Keyword
	def Input_LogErrorEmailValid5() {
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Login/Input_Kata Sandi'), 'Sem4ngat')
		WebUI.setText(findTestObject('Object Repository/Login/Input_Email'), 'abcd')
	}
}
