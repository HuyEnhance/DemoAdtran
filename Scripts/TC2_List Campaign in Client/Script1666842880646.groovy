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

WebUI.navigateToUrl('https://internal.demo.maplus.microadtech.com/#/campaigns/776')

WebUI.setText(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_161e55'), 
    'ueno_rina@microad.co.jp')

WebUI.setEncryptedText(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_d55e4a'), 
    'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_d55e4a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Campaign Settings'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Dashboard Display Settings'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/small'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Campaign Info'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Edit'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/body_AdTran                  Campaigns     _4b2714'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/body_AdTran                  Campaigns     _4b2714_1'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Users'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Clients'))

WebUI.setText(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_Clients_form-control ng-pristine ng-u_f2f0af'), 
    '')

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Users'))

WebUI.setText(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_Users_form-control ng-pristine ng-unt_5b0cf1'), 
    'tho')

WebUI.sendKeys(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_Users_form-control ng-pristine ng-unt_5b0cf1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Tho Huynh'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/i_User Information_fa fa-edit'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_New Record 2'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Campaign Settings'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Campaign Info'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Edit'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/body_AdTran                  Campaigns     _4b2714_1_2'))

WebUI.setText(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_Cancel_select2-input select2-focused'), 
    'hue')

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Save'))

WebUI.delay(3)

WebUI.closeBrowser()

