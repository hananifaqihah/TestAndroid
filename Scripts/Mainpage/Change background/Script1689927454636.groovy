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

Mobile.tap(findTestObject('Object Repository/Mainpage/Change Background/android.widget.TextView - I have an account'), 0)

Mobile.setText(findTestObject('Object Repository/Mainpage/Change Background/android.widget.EditText - Email'), 'uatdemo9@ramssol.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Mainpage/Change Background/android.widget.EditText - Password'), 'Password01', 
    0)

Mobile.tap(findTestObject('Object Repository/Mainpage/Change Background/android.widget.Button - Log In'), 0)

'Click Background'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Background/android.widget.ImageView'), 0)

'Choose background 1'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Background/android.widget.ImageView (2)'), 0)

'Click back'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Background/android.widget.ImageView (3)'), 0)

'Click Background'
Mobile.tap(findTestObject('Mainpage/Change Background/android.widget.ImageView (5)'), 0)

'Choose background 2'
Mobile.tap(findTestObject('Mainpage/Change Background/android.widget.ImageView (4)'), 0)

'Click back'
Mobile.tap(findTestObject('Mainpage/Change Background/android.widget.ImageView (3)'), 0)

Mobile.waitForElementPresent(findTestObject('Mainpage/Change Background/android.widget.ImageView (5)'), 0)

Mobile.closeApplication()

