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

'Start App'
Mobile.startApplication('C:\\Users\\User\\Downloads\\4.0.52.apk', true)

'I have an account'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.TextView - I have an account'), 0)

'Add email - demo9'
Mobile.setText(findTestObject('Object Repository/Profile/Follow,Following/android.widget.EditText - Email'), 'uatdemo9@ramssol.com', 
    0)

'Add Password'
Mobile.setText(findTestObject('Object Repository/Profile/Follow,Following/android.widget.EditText - Password'), 'Password01', 
    0)

'Login'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.Button - Log In'), 0)

'Tap Menu'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.ImageView'), 0)

'Tap Profile icon'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.ImageView (1)'), 0)

'Tap followers'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.TextView - Followers'), 0)

Mobile.delay(30, FailureHandling.OPTIONAL)

'Search Steve in Followers'
Mobile.setText(findTestObject('Object Repository/Profile/Follow,Following/android.widget.EditText - Search here'), 'Steve', 
    0)

'Tap to view profile'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.TextView - Steve'), 0)

'Verify Profile page'
Mobile.verifyElementText(findTestObject('Object Repository/Profile/Follow,Following/android.widget.TextView - Profile'), 
    'Profile')

'Back to Followers page'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.ImageButton'), 0)

'Unfollow Steve'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.Button - Following'), 0)

'Follow Steve'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.Button - Follow'), 0)

'Tap following tab'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.TextView - Following'), 0)

Mobile.delay(30, FailureHandling.OPTIONAL)

'Search Brian in Following'
Mobile.setText(findTestObject('Profile/Follow,Following/android.widget.EditText - Search here'), 'Brian', 0)

'Tap Brian to vew profile'
Mobile.tap(findTestObject('Profile/Follow,Following/android.widget.TextView - Brian'), 0)

'Verify Profile page'
Mobile.verifyElementText(findTestObject('Profile/Follow,Following/android.widget.TextView - Profile'), 'Profile')

'Tap Back to Following list'
Mobile.tap(findTestObject('Profile/Follow,Following/android.widget.ImageButton'), 0)

'Unfollow'
Mobile.tap(findTestObject('Profile/Follow,Following/android.widget.Button - Following'), 0)

'Verify button change to Follow'
Mobile.verifyElementText(findTestObject('Profile/Follow,Following/android.widget.Button - Follow'), 'Follow')

'Follow'
Mobile.tap(findTestObject('Profile/Follow,Following/android.widget.Button - Follow'), 0)

'Tap Back to profile page'
Mobile.tap(findTestObject('Object Repository/Profile/Follow,Following/android.widget.ImageButton (1)'), 0)

'Stop'
Mobile.closeApplication()

