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

for (int i = 1; i <= 7; i++) {
    WebUI.openBrowser('https://qa.alta.id/')

    WebUI.click(findTestObject('Object-Web/Object_Login/go_to_login_page_btn'))

    WebUI.setText(findTestObject('Object-Web/Object_Login/txt_email'), findTestData('data_Login_Negative').getValue(1, i))

    WebUI.setText(findTestObject('Object-Web/Object_Login/txt_password'), findTestData('data_Login_Negative').getValue(2, 
            i))

    WebUI.click(findTestObject('Object-Web/Object_Login/submit_login_btn'))

    WebUI.closeBrowser()

    WebUI.delay(3)
}

