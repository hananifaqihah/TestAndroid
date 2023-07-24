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

Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.TextView - I have an account'), 0)

Mobile.setText(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.EditText - Email'), 'uatdemo9@ramssol.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.EditText - Password'), 'Password01', 
    0)

'Login\r\n'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.Button - Log In'), 0)

'Click Avatar'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.FrameLayout'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.TextView - Avatar'), 'Avatar')

'Change face -opt 1'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.ImageView'), 0)

'Change hair-opt 3'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.ImageView (1)'), 0)

'Change Outfit - opt 1'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.ImageView (2)'), 0)

'Change Accessory - opt 1'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.ImageView (3)'), 0)

'Save\r\n'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.TextView - Okay'), 0)

'Click Back'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.ImageButton'), 0)

'Click Avatar'
Mobile.tap(findTestObject('Mainpage/Change Avatar/android.widget.FrameLayout'), 0)

'Change Face - opt 2'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.ImageView (4)'), 0)

'Change Hair - opt 1'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.ImageView (5)'), 0)

'Change Outfit - opt 4'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.ImageView (6)'), 0)

'Change accessory - opt 2'
Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.ImageView (7)'), 0)

Mobile.tap(findTestObject('Mainpage/Change Avatar/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/Mainpage/Change Avatar/android.widget.TextView - Okay (1)'), 0)

Mobile.tap(findTestObject('Mainpage/Change Avatar/android.widget.ImageButton'), 0)

'Verify avatar change to latest update'
Mobile.verifyElementExist(findTestObject('Mainpage/Change Avatar/android.widget.LinearLayout'), 0)

Mobile.closeApplication()

