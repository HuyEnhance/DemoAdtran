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

WebUI.navigateToUrl('https://internal.demo.maplus.microadtech.com/#/campaigns/263')

WebUI.setText(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_161e55'), 
    'ueno_rina@microad.co.jp')

WebUI.setEncryptedText(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_d55e4a'), 
    'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_d55e4a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Campaign Settings'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Channel Settings'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Connected Channels'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/small'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/small'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_CCC'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/i_Try again'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Yahoo'))

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://internal.demo.maplus.microadtech.com/#/campaigns/263')

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_161e55'))

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://internal.demo.maplus.microadtech.com/#/campaigns/263')

WebUI.setText(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_161e55'), 
    'ueno_rina@microad.co.jp')

WebUI.setEncryptedText(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_d55e4a'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/button_Login'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Campaign Settings'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Channel Settings'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Connected Channels'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/small'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_API_switchery'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_API_switchery'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/small'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_CCC'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_twitter'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Yahoo'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_twitter'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/body_AdTran                  Campaigns     _4b2714'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/small_1'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Next'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/button_Finish'))

