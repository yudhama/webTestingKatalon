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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Contact List App/input_here_email'), 'testing1@testing.com')

WebUI.setEncryptedText(findTestObject('Object Repository/contactList app/Page_Contact List App/input_here_password'), 'JltEQgaE0YE=')

WebUI.click(findTestObject('Object Repository/contactList app/Page_Contact List App/button_Submit'))

WebUI.click(findTestObject('Object Repository/contactList app/Page_My Contacts/button_Add a New Contact'))

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_First Name_firstName'), firstname)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_Last Name_lastName'), lastname)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_Date of Birth_birthdate'), dob)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_Email_email'), email)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_Phone_phone'), phone)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_Street Address 1_street1'), street1)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_Street Address 2_street2'), street2)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_City_city'), city)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_State or Province_stateProvince'), 
    state)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_Postal Code_postalCode'), postalCode)

WebUI.setText(findTestObject('Object Repository/contactList app/Page_Add Contact/input_Country_country'), country)

WebUI.click(findTestObject('Object Repository/contactList app/Page_Add Contact/p_Submit            Cancel'))

WebUI.click(findTestObject('Object Repository/contactList app/Page_Add Contact/button_Submit'))

WebUI.click(findTestObject('Object Repository/contactList app/Page_My Contacts/h1_Contact List'))

WebUI.verifyElementPresent(findTestObject('Object Repository/contactList app/Page_My Contacts/h1_Contact List'), 0)

WebUI.closeBrowser()

