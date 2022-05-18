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

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_tensi_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_kamera_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_api_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_pempek_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_stetoskop_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_cincin_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_durian_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_mesinjahit_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_dd_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_produkbersama_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_produkcindi_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_mousepad_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/beli_cangkir_btn'))

WebUI.click(findTestObject('Object-Web/Object_Cart/icon_cart_btn'))

WebUI.acceptAlert()

