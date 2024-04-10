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

// Điền thông tin đăng nhập và nhấn nút đăng nhập
WebUI.setText(findTestObject('login_object/input_username'), 'thutrang2')

WebUI.setText(findTestObject('login_object/input_password'), '12345678')

WebUI.click(findTestObject('login_object/button_dangnhap'))

WebUI.click(findTestObject('add_item_object/icon_cart'))

def initialQuantity = WebUI.getText(findTestObject('add_item_object/input_item_quantity'))

WebUI.click(findTestObject('add_item_object/back_home_page'))

WebUI.click(findTestObject('add_item_object/item1'))

WebUI.setText(findTestObject('add_item_object/input_item_quantity'), item_quanlity)

WebUI.click(findTestObject('add_item_object/button_add_cart'))

WebUI.click(findTestObject('add_item_object/message_them_thanhcong'))

WebUI.click(findTestObject('add_item_object/icon_cart'))

// Kiểm tra số lượng sản phẩm trong giỏ hàng sau khi thêm
def quantityAfterAdding = WebUI.getText(findTestObject('add_item_object/quanlity_item'))

def expectedQuantityAfterAddition = initialQuantity + quantityAfterAdding

WebUI.verifyMatch(quantityAfterAdding, expectedQuantityAfterAddition.toString(), false)

WebUI.closeBrowser()

