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

WebUI.openBrowser('http://127.0.0.1/DANAPHONE/Views/Login_And_Register.php')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('login_object/input_username'), 'thutrang1')

WebUI.setText(findTestObject('login_object/input_password'), '12345678')

WebUI.click(findTestObject('login_object/button_dangnhap'))

WebUI.click(findTestObject('login_object/icon_thongtin'))

WebUI.click(findTestObject('change_password_object/button_quanly_thong tin'))

WebUI.click(findTestObject('change_password_object/button_change_password'))

WebUI.setText(findTestObject('change_password_object/input_old_password'), old_password)

WebUI.setText(findTestObject('change_password_object/input_new_password'), new_password)

WebUI.setText(findTestObject('change_password_object/input_confirm_password'), confirm_password)

WebUI.click(findTestObject('change_password_object/button_cap_nhat_password'))

WebUI.verifyTextPresent(message, false)

WebUI.closeBrowser()

