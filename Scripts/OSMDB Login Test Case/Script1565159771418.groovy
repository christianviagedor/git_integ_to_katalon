import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://christian-viagedor.outsystemscloud.com/OSMDB/Entry1.aspx')

WebUI.navigateToUrl('https://christian-viagedor.outsystemscloud.com/OSMDB/Entry1.aspx')

WebUI.setText(findTestObject('Object Repository/OSMDB Log In/Page_Login/input_Email Address_OutSystemsUIWeb_wt14blockwtLoginOutSystemsUIWeb_wt15blockwtLoginOutSystemsUIWeb_wt26blockwtInputwtUserNameInput'), 
    'christian.viagedor@novare.com.hk')

WebUI.setEncryptedText(findTestObject('Object Repository/OSMDB Log In/Page_Login/input_Password_OutSystemsUIWeb_wt14blockwtLoginOutSystemsUIWeb_wt15blockwtLoginOutSystemsUIWeb_wt6blockwtInputwtPasswordInput'), 
    'OXZMvseh63HdTpDBQh2Tig==')

WebUI.sendKeys(findTestObject('Object Repository/OSMDB Log In/Page_Login/input_Password_OutSystemsUIWeb_wt14blockwtLoginOutSystemsUIWeb_wt15blockwtLoginOutSystemsUIWeb_wt6blockwtInputwtPasswordInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OSMDB Log In/Page_Login/span_Invalid username or password'))

WebUI.setEncryptedText(findTestObject('Object Repository/OSMDB Log In/Page_Login/input_Password_OutSystemsUIWeb_wt14blockwtLoginOutSystemsUIWeb_wt15blockwtLoginOutSystemsUIWeb_wt6blockwtInputwtPasswordInput'), 
    'ZZmbkhpWq8yOGdEwhOwzKg==')

WebUI.sendKeys(findTestObject('Object Repository/OSMDB Log In/Page_Login/input_Password_OutSystemsUIWeb_wt14blockwtLoginOutSystemsUIWeb_wt15blockwtLoginOutSystemsUIWeb_wt6blockwtInputwtPasswordInput'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/OSMDB Log In/Page_Login/input_Password_OutSystemsUIWeb_wt14blockwtLoginOutSystemsUIWeb_wt15blockwtLoginOutSystemsUIWeb_wt6blockwtInputwtPasswordInput'), 
    's1WzUfA2gLkyR2gZUR84gA==')

WebUI.click(findTestObject('Object Repository/OSMDB Log In/Page_Login/input_Forgot password_OutSystemsUIWeb_wt14blockwtLoginOutSystemsUIWeb_wt15blockwtLoginwt13'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OSMDB Log In/Page_Login/span_Invalid username or password'), 
    0)

WebUI.closeBrowser()

