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

Mobile.tap(findTestObject('Object Repository/Authentication/Login/android.widget.TextView - I have an account'), 0)

Mobile.tap(findTestObject('Object Repository/Authentication/Login/android.widget.Button - Log In'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Authentication/Login/android.widget.TextView - Please enter your email'), 
    'Please enter your email.')

Mobile.setText(findTestObject('Authentication/Login/android.widget.EditText - Email'), 'uatdemo8', 0)

Mobile.tap(findTestObject('Object Repository/Authentication/Login/android.widget.Button - Log In (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Authentication/Login/android.widget.TextView - Email is not valid'), 
    'Email is not valid.')

Mobile.setText(findTestObject('Authentication/Login/android.widget.EditText - uatdemo8'), 'uatdemo8@ramssol.com', 0)

Mobile.tap(findTestObject('Authentication/Login/android.widget.Button - Log In'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Authentication/Login/android.widget.TextView - Please enter your password'), 
    'Please enter your password.')

Mobile.setText(findTestObject('Object Repository/Authentication/Login/android.widget.EditText - Password'), 'Password02', 0)

Mobile.tap(findTestObject('Authentication/Login/android.widget.Button - Log In'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Authentication/Login/android.widget.TextView - Your email and password didnt match'), 
    'Your email and password didn\'t match.')

Mobile.setText(findTestObject('Object Repository/Authentication/Login/android.widget.EditText -'), 'Password01', 0)

Mobile.tap(findTestObject('Authentication/Login/android.widget.Button - Log In'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Authentication/Login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Authentication/Login/android.widget.ImageView'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Authentication/Login/android.widget.TextView - Log Out'), 0)

Mobile.tap(findTestObject('Authentication/Login/android.widget.TextView - Log Out'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Authentication/Login/android.widget.TextView - Are you sure you want to log out'), 
    0)

Mobile.tap(findTestObject('Object Repository/Authentication/Login/android.widget.TextView - Yes'), 0)

Mobile.closeApplication()

