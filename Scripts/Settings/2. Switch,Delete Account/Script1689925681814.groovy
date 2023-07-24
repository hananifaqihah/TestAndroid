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

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - I have an account'), 
    0)

Mobile.setText(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.EditText - Email'), 'uatdemo7@ramssol.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.EditText - Password'), 
    'Password01', 0)

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.Button - Log In'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.ImageView'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Switch Account'), 
    0)

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Steve Roger'), 0)

Mobile.waitForElementPresent(findTestObject('Settings/Switch,Delete Account/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Settings/Switch,Delete Account/android.widget.ImageView'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Steve'), 
    'Steve')

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.ImageView (2)'), 0)

Mobile.verifyElementText(findTestObject('Settings/Switch,Delete Account/android.widget.TextView - Settings'), 'Settings')

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Account'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Add account (2)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.ImageView (3)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Delete Account'), 
    'Delete Account')

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Okay'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Account deleted successfully'), 
    'Account deleted successfully')

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Okay (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.ImageButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Settings/Switch,Delete Account/android.widget.TextView - Add account (0)'), 
    'Add account (0)')

Mobile.tap(findTestObject('Settings/Switch,Delete Account/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Settings/Switch,Delete Account/android.widget.ImageButton'), 0)

Mobile.closeApplication()

