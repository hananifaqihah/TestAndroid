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

'I have an account\r\n'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - I have an account'), 
    0)

'Add email'
Mobile.setText(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.EditText - Email (1)'), 'uatdemo9@ramssol.com', 
    0)

'Add Password'
Mobile.setText(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.EditText - Password'), 'Password01', 
    0)

'Login'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.Button - Log In'), 0)

'Tap Menu'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.ImageView'), 0)

'Tap Profile icon'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.ImageView (1)'), 0)

'Verify profile page'
Mobile.verifyElementText(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - Profile'), 
    'Profile')

'Tap Edit'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - Edit'), 0)

'Verify Edit profile page'
Mobile.verifyElementText(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - Profile Settings'), 
    'Profile Settings')

'Tap photo to edit'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.ImageView (2)'), 0)

'Tap Take picture'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - Take picture'), 0)

'Tap 3 dots in emulator for selection'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.ImageView (3)'), 0)

'Tap photo selection'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.ImageButton'), 0)

'Tap camera icon to take picture'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.ImageView (4)'), 0)

'Tap right to choose picture'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.ImageButton (1)'), 0)

'Edit Bio'
Mobile.setText(findTestObject('Profile/Edit Profile and Photo/android.widget.EditText - Katalon Automation (1)'), 'Katalon Automation 2', 
    0)

'Save & Exit'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - Save  Exit'), 0)

'Verify Bio updated'
Mobile.waitForElementPresent(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - Katalon Automation 2'), 
    0)

'Tap Edit'
Mobile.tap(findTestObject('Profile/Edit Profile and Photo/android.widget.TextView - Edit'), 0)

'Edit bio 2'
Mobile.setText(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.EditText - Katalon Automation 2 (1)'), 
    'Katalon Automation ', 0)

'Save & Exit'
Mobile.tap(findTestObject('Profile/Edit Profile and Photo/android.widget.TextView - Save  Exit'), 0)

'verify edited bio'
Mobile.verifyElementText(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - Katalon Automation'), 
    'Katalon Automation ')

'Tap photo to edit'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.ImageView (5)'), 0)

'Tap Profile Photo'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - See profile picture'), 
    0)

'Tap Edit'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.TextView - Edit (1)'), 0)

'Tap Take Picture'
Mobile.tap(findTestObject('Profile/Edit Profile and Photo/android.widget.TextView - Take picture'), 0)

'Tap 3 dots on emulator'
Mobile.tap(findTestObject('Profile/Edit Profile and Photo/android.widget.ImageView (3)'), 0)

'Tap photo selection'
Mobile.tap(findTestObject('Object Repository/Profile/Edit Profile and Photo/android.widget.ImageButton (2)'), 0)

'Tap camera icon'
Mobile.tap(findTestObject('Profile/Edit Profile and Photo/android.widget.ImageView (4)'), 0)

'Tap right to choose picture'
Mobile.tap(findTestObject('Profile/Edit Profile and Photo/android.widget.ImageButton (1)'), 0)

'Verify updated profile photo'
Mobile.waitForElementPresent(findTestObject('Profile/Edit Profile and Photo/android.widget.ImageView (6)'), 0)

'Close'
Mobile.closeApplication()

