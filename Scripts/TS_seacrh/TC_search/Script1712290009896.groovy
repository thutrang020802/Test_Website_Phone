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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//sử dụng nó để tạo và quản lý đối tượng WebDriver.
import org.openqa.selenium.By as By
//sử dụng By để xây dựng các biểu thức XPath hoặc các phương thức tìm kiếm khác.

WebUI.openBrowser('http://127.0.0.1/DANAPHONE/Views/index.php')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('search_object/input_keyword'), keyword)

WebUI.click(findTestObject('search_object/buttton-search'))

WebUI.verifyTextPresent(message, false)

def elementsFound = DriverFactory.getWebDriver().findElements(By.xpath(('//div[contains(text(), \'' + keyword) + '\')]')).size() > 
0 ? true : false

WebUI.closeBrowser()

