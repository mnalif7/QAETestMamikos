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
GlobalVariable.currentDataFile = findTestData('Data Files/Login')

TestData dataFile = GlobalVariable.currentDataFile

def rowIndex = new services.ExcelController().rowCheck(dataFile)

'===============Start Automation==============='

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Pencari Kos'))

WebUI.setText(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/input_Nomor Handphone_Nomor Handphone'), dataFile.getValue('Mobile', rowIndex))

WebUI.setText(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/input_Password_Password'), 
    dataFile.getValue('Password', rowIndex))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Login'))

WebUI.closeBrowser()

