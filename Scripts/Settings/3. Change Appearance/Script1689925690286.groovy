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

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.TextView - I have an account'), 0)

Mobile.setText(findTestObject('Object Repository/Settings/Change Appearance/android.widget.EditText - Email (1)'), 'uatdemo9@ramssol.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Settings/Change Appearance/android.widget.EditText - Password'), 'Password01', 
    0)

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.Button - Log In'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Settings/Change Appearance/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.TextView - Appearance'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/Change Appearance/android.widget.TextView - In which mode do you wish to proceed'), 
    0)

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.ImageView (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Settings/Change Appearance/android.widget.TextView - Classic'), 
    'Classic')

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.TextView - Okay'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Settings/Change Appearance/android.widget.TextView - Home'), 
    'Home')

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.TextView - Settings'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.TextView - Change appearance'), 0)

Mobile.tap(findTestObject('Object Repository/Settings/Change Appearance/android.widget.ImageView (3)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Settings/Change Appearance/android.widget.TextView - Gamify'), 
    'Gamify')

Mobile.tap(findTestObject('Settings/Change Appearance/android.widget.TextView - Okay'), 0)

Mobile.closeApplication()

