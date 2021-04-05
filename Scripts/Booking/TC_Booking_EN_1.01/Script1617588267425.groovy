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

//Declare data file
TestData dataFile = findTestData('Data Files/Booking')

GlobalVariable.currentDataFile = dataFile

def rowIndex = new services.ExcelController().rowCheck(dataFile)

'===============Start Automation==============='
WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/room/kost-kabupaten-simeulue-kost-campur-eksklusif-kos-agen-duo-tenant-1#/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/button_Lanjut'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/button_Saya Mengerti'))

WebUI.callTestCase(findTestCase('Login/Call/TC_Call_Login_EN_1.01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/input_ bulan_booking-input-checkin__input'))

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/span_6'))

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/div_Per bulan_mami-radio-icon'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/button_Ajukan Sewa'))

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/button_Nanti Saja'))

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/input_Rp1.509.000_mamiCheckboxCommon'))

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/span_Ajukan Sewa'))

WebUI.click(findTestObject('Object Repository/Page_Kos Agen Duo Tenant/button_Chat Pemilik Kos'))

WebUI.click(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/img_Syarat dan Ketentuan_user-profil-img'))

WebUI.click(findTestObject('Object Repository/Page_Profil Akun Pengguna - Mamikos/a_Keluar'))

WebUI.closeBrowser()

