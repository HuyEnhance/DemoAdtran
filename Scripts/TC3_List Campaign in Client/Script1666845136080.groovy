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

WebUI.navigateToUrl('https://demo.maplus.microadtech.com/app/#/users/login')

WebUI.setText(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_161e55'), 
    'tho_huynh@enhance.vn')

WebUI.setEncryptedText(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/input_From now, please use your email for l_d55e4a'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/span_Login'))

WebUI.click(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/a_New Record 2'))
for(int i=0;i<1;i++) {
if (WebUI.selectOptionByValue(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/select_New Record 2'), 
    'number:575', true) == false) {
    break;
}
else {

WebUI.selectOptionByValue(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/select_New Record 2'), 
    'number:263', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/List Campaign in client dashboard/Page_AdTran - Integrated Digital Marketing _a37a7b/select_New Record 2'), 
    'number:776', true) }
}

WebUI.closeBrowser()

