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

Mobile.tap(findTestObject('Object Repository/Authentication/Reset Password/android.widget.TextView - I have an account'), 
    0)

Mobile.tap(findTestObject('Object Repository/Authentication/Reset Password/android.widget.TextView - Forgot password'), 
    0)

Mobile.tap(findTestObject('Object Repository/Authentication/Reset Password/android.widget.Button - Reset Password'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Authentication/Reset Password/android.widget.TextView - Please enter your email'), 
    'Please enter your email.')

Mobile.setText(findTestObject('Object Repository/Authentication/Reset Password/android.widget.EditText - Email'), 'uatdemo8', 
    0)

Mobile.tap(findTestObject('Object Repository/Authentication/Reset Password/android.widget.Button - Reset Password (1)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Authentication/Reset Password/android.widget.TextView - Email is not valid'), 
    'Email is not valid.')

Mobile.setText(findTestObject('Object Repository/Authentication/Reset Password/android.widget.EditText - uatdemo8'), 'demo3@ramssol.com', 
    0)

Mobile.tap(findTestObject('Authentication/Reset Password/android.widget.Button - Reset Password'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Authentication/Reset Password/android.widget.TextView - Your email is not registered with Feets. Please enter the correct email provided by your organisation'), 
    'Your email is not registered with Feet\'s. Please enter the correct email provided by your organisation.')

Mobile.setText(findTestObject('Object Repository/Authentication/Reset Password/android.widget.EditText - demo3ramssol.com'), 
    'uatdemo8@ramssol.com', 0)

Mobile.tap(findTestObject('Object Repository/Authentication/Reset Password/android.widget.Button - Reset Password (2)'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Authentication/Reset Password/android.widget.TextView - Please check your email for the password reset link'), 
    0)

Mobile.verifyElementText(findTestObject('Authentication/Reset Password/android.widget.TextView - Please check your email for the password reset link'), 
    'Please check your email for the password reset link')

Mobile.closeApplication()

