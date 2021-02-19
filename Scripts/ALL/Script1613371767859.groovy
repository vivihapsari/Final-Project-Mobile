import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//CREATE ACCOUNT//
Mobile.startApplication('E:\\Folder_Vivi\\Trainning_Katalon\\FINALPROJECTS-201016-121328\\FINAL PROJECTS\\MOBILE', false)

Mobile.tap(findTestObject('Create Account/Button_CreateAccount'), 3)

Mobile.setText(findTestObject('Create Account/Stext_First Name'), 'vivi', 3)

Mobile.setText(findTestObject('Create Account/Stext_Last Name'), 'hapsari', 3)

Mobile.setText(findTestObject('Create Account/Stext_Country'), 'indonesia', 3)

Mobile.setText(findTestObject('Create Account/Stext_Username'), 'vihap', 3)

Mobile.setEncryptedText(findTestObject('Create Account/Stext_Password'), 'OjI3K2/1R30xCJ6z9HEOrA==', 3)

Mobile.setEncryptedText(findTestObject('Create Account/Stext_Confirm Password'), 'OjI3K2/1R30xCJ6z9HEOrA==', 3)

Mobile.tap(findTestObject('Create Account/Button_Create Profile'), 3)

//LOGIN
not_run: Mobile.setText(findTestObject('Object Repository/Login/Stext_Username'), 'kurniawati', 0)

not_run: Mobile.setText(findTestObject('Object Repository/Login/Stext_Password'), 'kurniawati123', 0)

Mobile.tap(findTestObject('Object Repository/Login/Button_Login'), 3)

//ACCOUNT
Mobile.tap(findTestObject('Login/Button_StripTiga'), 3)

Mobile.tap(findTestObject('Menu-menu Strip Tiga/Button_Accounts'), 3)

Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button Plus for Add Account'), 3)

Mobile.setText(findTestObject('Object Repository/Account/Input Add Account/Stex_Account Name'), 'ahmad', 3)

Mobile.setText(findTestObject('Object Repository/Account/Input Add Account/Stext_Initial Balance (Optional)'), '1500000', 
    3)

Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button_ADD'), 3)

Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button Plus for Add Account'), 3)

Mobile.setText(findTestObject('Object Repository/Account/Input Add Account/Stex_Account Name'), 'furqoni', 3)

Mobile.setText(findTestObject('Object Repository/Account/Input Add Account/Stext_Initial Balance (Optional)'), '1500000', 
    3)

Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button_ADD'), 3)

//VERIFY ACCOUNT
not_run: Mobile.verifyElementText(findTestObject('Object Repository/Account/TView_Account Name M Fachri'), 'M Fachri')

not_run: Mobile.verifyElementText(findTestObject('Account/TView_Account No M Fachri'), 'Account no: A1')

not_run: Mobile.verifyElementText(findTestObject('Object Repository/Account/TView_Account Balance Fachri'), 'Account balance: $1500000.00')

not_run: Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button_View Group'), 3)

not_run: Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button_Back'), 3)

//TRANSFER
Mobile.tap(findTestObject('Login/Button_StripTiga'), 3)

Mobile.tap(findTestObject('Object Repository/Menu-menu Strip Tiga/Button_Make a Transfer'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/Transfer/Spinner_SelectAccont'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Stext_Transfer Amount'), '100000', 0)

//MAKE DEPOSIT
Mobile.tap(findTestObject('Login/Button_StripTiga'), 3)

Mobile.tap(findTestObject('Menu-menu Strip Tiga/Button_Make a Deposit'), 3)

Mobile.setText(findTestObject('Object Repository/Make Deposit/Stext_Amount Deposit'), '500000', 3)

Mobile.tap(findTestObject('Object Repository/Make Deposit/Button_Deposit'), 3)

Mobile.delay(3)

// PAYMENT
Mobile.tap(findTestObject('Login/Button_StripTiga'), 0)

Mobile.tap(findTestObject('payment/android.widget.CheckedTextView - Make a Payment'), 0)

Mobile.tap(findTestObject('payment/android.widget.ImageButton (2)'), 0)

Mobile.setText(findTestObject('Object Repository/payment/android.widget.EditText - Payee Name'), 'sepatu', 0)

Mobile.tap(findTestObject('payment/android.widget.Button - ADD'), 0)

Mobile.setText(findTestObject('Object Repository/payment/android.widget.EditText - Amount'), '1000', 0)

Mobile.tap(findTestObject('Object Repository/payment/android.widget.Button - Make Payment'), 0)

//LOGOUT
Mobile.tap(findTestObject('Object Repository/payment/android.widget.ImageButton'), 0)

Mobile.scrollToText('Logout', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/Button_Logout'), 0)

Mobile.closeApplication()

