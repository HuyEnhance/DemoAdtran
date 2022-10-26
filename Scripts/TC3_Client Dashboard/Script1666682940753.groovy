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

WebUI.navigateToUrl('https://demo.maplus.microadtech.com/app/#/campaigns')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.maplus.microadtech.com/app/#/campaigns')

WebUI.setText(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_161e55'), 
    'tho_huynh@enhance.vn')

WebUI.setEncryptedText(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_d55e4a'), 
    'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_d55e4a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Report'))

if (WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_CCC')) == 
false) {
    printf('khong hien channel da enable')
} else {
    printf('Da hien channel')
}

//WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_CCC'))
WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/i_Report_fa fa-angle-down'))
if (WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_twitter')) ==
	false) {
		printf('khong hien channel da enable')
	} else {
		printf('co hien channel')
	}

//WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_twitter'))
	
//WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Report'))

if (WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Report')) == 
false) {
    printf('khong hien channel da enable')
} else {
    printf('co hien channel')
}
if (WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Yahoo')) ==
	false) {
		printf('khong hien channel da enable')
	} else {
		printf('co hien channel')
	}

//WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Yahoo'))
WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Report'))

WebUI.click(findTestObject('Object Repository/Client Dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_Facebook'))

WebUI.closeBrowser()

