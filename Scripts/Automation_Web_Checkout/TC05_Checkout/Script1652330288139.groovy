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

WebUI.scrollToPosition(1, 1)

for (int i = 1; i <= 3; i++) {
    WebUI.click(findTestObject('Object-Web/Object_Checkout/01_add_qty_tensi'))

    WebUI.delay(1)
}

WebUI.click(findTestObject('Object-Web/Object_Checkout/01_min_qty_tensi'))

WebUI.delay(2)

WebUI.click(findTestObject('Object-Web/Object_Checkout/02_add_qty_kamera'))

WebUI.delay(2)

WebUI.click(findTestObject('Object-Web/Object_Checkout/03_add_qty_api'))

for (int i = 1; i <= 10; i++) {
    WebUI.click(findTestObject('Object-Web/Object_Checkout/04_add_qty_pempek'))
}

for (int i = 1; i <= 5; i++) {
    WebUI.click(findTestObject('Object-Web/Object_Checkout/05_add_qty_stetoskop'))
}

WebUI.click(findTestObject('Object-Web/Object_Checkout/submit_bayar_btn'))

