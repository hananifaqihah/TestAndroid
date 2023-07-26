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

'Start'
Mobile.startApplication('C:\\Users\\User\\Downloads\\4.0.52.apk', true)

'Tap I have an account'
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.TextView - I have an account'), 0)

'Add email demo9'
Mobile.setText(findTestObject('Object Repository/Profile/Action Profile/android.widget.EditText - Email'), 'uatdemo9@ramssol.com', 
    0)

'Add password'
Mobile.setText(findTestObject('Object Repository/Profile/Action Profile/android.widget.EditText - Password'), 'Password01', 
    0)

'Tap Login\r\n'
Mobile.tap(findTestObject('Profile/Action Profile/android.widget.Button - Log In'), 0)

'Tap Menu'
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.ImageView'), 0)

'Tap Profile icon'
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.ImageView (1)'), 0)

'Tap QR to view'
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.ImageView (2)'), 0)

'Verify qr is visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Profile/Action Profile/android.widget.ImageView (4)'), 0)

'Tap X'
Mobile.tap(findTestObject('Profile/Action Profile/android.widget.ImageView (7)'), 0)

'Tap About tab'
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.TextView - About'), 0)

'Tap on Avatar'
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.ImageView (5)'), 0)

'Change Outfit - opt 1'
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.ImageView (6)'), 0)

'Tap save'
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.TextView - Save'), 0)

'Tap back button'
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.ImageButton'), 0)

'Tap on Manager\'s name '
Mobile.tap(findTestObject('Object Repository/Profile/Action Profile/android.widget.TextView - Hafiz Rahman'), 0)

'verify profile page'
Mobile.verifyElementText(findTestObject('Object Repository/Profile/Action Profile/android.widget.TextView - Profile'), 'Profile')

'Tap about tab in manager\'s profile'
Mobile.tap(findTestObject('Profile/Action Profile/android.widget.TextView - About'), 0)

'Verify manager\'s name exist'
Mobile.verifyElementExist(findTestObject('Profile/Action Profile/android.widget.TextView - Hafiz Rahman'), 0)

Mobile.closeApplication()

