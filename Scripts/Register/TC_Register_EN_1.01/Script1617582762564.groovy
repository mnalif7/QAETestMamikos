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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/')

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/span_Masuk Sebagai Pencari_hamburger-menu'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Masuk Sebagai Pencari'))

WebUI.setText(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/input_Nomor Handphone_Nomor Handphone'), 
    '081319333212')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/input_Password_Password'), 
    'CFMrOjJiXxFRS2mupxG8+Q==')

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Nanti Saja'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/a_Daftar Sekarang'))

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/input_Nama Lengkap_Nama'), 'M Nur Alif')

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/input_Nomor Handphone_Nomor handphone'), 
    '081319333212')

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/input_Alamat Email_Alamat email'), 
    'lifdev7@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/input_Password_Password'), 
    'CFMrOjJiXxFRS2mupxG8+Q==')

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/i_Password_password-eye'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/i_Password_password-eye --open'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/i_Password_password-eye'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/div_Daftar Pencari Kos Nama Lengkap    Nomo_b3dba8'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/button_Daftar'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/img_Click verify once there are none left_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/img_Click verify once there are none left_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/div_Click verify once there are none left_r_f144f7'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/img_Click verify once there are none left_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/div_Click verify once there are none left_r_f144f7_1'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/img_chimneys_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/img_chimneys_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/img_chimneys_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/button_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/input_Verikasi_otpinput'), '4620')

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/button_Verikasi'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Pencari Kost - Mamikos/a_Nanti Saja'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/div_booking_hamburger-container'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/a_Keluar'))

