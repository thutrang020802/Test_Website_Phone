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

// Định nghĩa các phần tử trên trang web
WebUI.openBrowser('http://127.0.0.1/DANAPHONE/Views/Login_And_Register.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('register_object/button_đangki_taiday'))

// Nhập thông tin đăng ký
WebUI.setText(findTestObject('register_object/input_username'), 'thutrang1')

WebUI.setText(findTestObject('register_object/input__email'), '02082002tn@gmail.com')

WebUI.setText(findTestObject('register_object/input_password'), '12345678')

WebUI.setText(findTestObject('register_object/input_confirm_password'), '12345678')

// Click nút Đăng ký
WebUI.click(findTestObject('register_object/button_Sign Up'))

// Đợi để nhận email xác nhận (chờ khoảng 60 giây)
WebUI.delay(20)

WebUI.click(findTestObject('xacthuc_email_object/button_xacthuc'))

WebUI.click(findTestObject('login_object/icon_thongtin'))

WebUI.verifyTextPresent('thutrang1', false)

// Kiểm tra xem đăng ký thành công hay không
//WebUI.verifyElementPresent(your_success_message_locator)
// Đóng trình duyệt
WebUI.closeBrowser( /**
 * Hàm để trích xuất mã xác nhận từ email tạm thời
 */ // Viết mã để truy cập email tạm thời và trích xuất mã xác nhận từ email
    )

