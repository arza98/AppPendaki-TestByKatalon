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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('E:\\AUTOMATION TEST\\AppPendakiTest\\androidapp\\app-pendaki.apk', false)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Info-pendaki/ImageButton-hamburger'), 0)

Mobile.tap(findTestObject('Info-pendaki/CheckedText- Informasi Pendakian'), 0)

Mobile.tap(findTestObject('Info-pendaki/Text- Pendakian Gunung Bromo'), 0)

WebUI.delay(3)

Mobile.scrollToText('Terminal Bungurasih')

WebUI.delay(3)

Mobile.tap(findTestObject('Info-pendaki/ImageButton-Back'), 0)

Mobile.closeApplication()

