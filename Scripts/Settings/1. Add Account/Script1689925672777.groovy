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

Mobile.startApplication('C:\\Users\\User\\Downloads\\4.0.52.apk', true)

Mobile.tap(findTestObject('Object Repository/Settings/Add Account/android.widget.TextView - I have an account'), 0)

Mobile.setText(findTestObject('Object Repository/Settings/Add Account/android.widget.EditText - Email'), 'uatdemo8@ramssol.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Settings/Add Account/android.widget.EditText - Password'), 'Password01', 
    0)

Mobile.tap(findTestObject('Object Repository/Settings/Add Account/android.widget.Button - Log In'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Add Account/android.widget.ImageView'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Add Account/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Settings/Add Account/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Add Account/android.widget.TextView - Account'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Add Account/android.widget.TextView - Add account (0)'), 0)

Mobile.tap(findTestObject('Settings/Add Account/android.widget.TextView - Add New Account'), 0)

Mobile.setText(findTestObject('Object Repository/Settings/Add Account/android.widget.EditText - Please enter email address'), 
    'uatdemo7@ramssol.com', 0)

Mobile.setText(findTestObject('Object Repository/Settings/Add Account/android.widget.EditText - Please enter new password'), 
    'Password01', 0)

Mobile.tap(findTestObject('Object Repository/Settings/Add Account/android.widget.TextView - Add account'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Settings/Add Account/android.widget.TextView - New Account Added Successfully'), 
    'New Account Added Successfully')

Mobile.tap(findTestObject('Object Repository/Settings/Add Account/android.widget.TextView - Close'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Settings/Add Account/android.widget.TextView - uatdemo7'), 
    'uatdemo7')

Mobile.closeApplication()

