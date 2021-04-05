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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement

//Declare data file
TestData dataFile = findTestData('Data Files/DeleteBooking')

GlobalVariable.currentDataFile = dataFile

def rowIndex = new services.ExcelController().rowCheck(dataFile)

'===============Start Automation==============='
WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Login/Call/TC_Call_Login_EN_1.01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/img_Syarat dan Ketentuan_user-profil-img'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/a_Profil'))

WebUI.click(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/span_Booking'))

WebUI.click(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/label_Lihat selengkapnya'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/button_Batalkan Booking'), 0)

WebUI.delay(2)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/button_Batalkan Booking'),30)

WebUI.executeJavaScript("arguments[0].click", Arrays.asList(element))

WebUI.click(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/button_Ya, Batalkan'))

WebUI.click(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/div_Keluar_hamburger-container'))

WebUI.click(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/a_Keluar'))

WebUI.closeBrowser()

