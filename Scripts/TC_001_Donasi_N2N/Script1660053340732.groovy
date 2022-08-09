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

WebUI.navigateToUrl('https://kitabisa.com/')

WebUI.click(findTestObject('KitaBisa/MenuDonasi'))

WebUI.click(findTestObject('KitaBisa/CardCampaign'))

WebUI.click(findTestObject('KitaBisa/BtnDonasiSekarang'))

WebUI.setText(findTestObject('KitaBisa/InputNominal'), '10000')

WebUI.waitForElementVisible(findTestObject('KitaBisa/BtnLanjutkanPembayaran'), 3)

WebUI.click(findTestObject('KitaBisa/BtnLanjutkanPembayaran'))

WebUI.click(findTestObject('KitaBisa/MetodePembayaran'))

WebUI.setText(findTestObject('KitaBisa/InputName'), 'Deva')

WebUI.setText(findTestObject('KitaBisa/InputNoHp'), '088703070324')

WebUI.click(findTestObject('KitaBisa/BtnLanjutPembayaran2'))

Boolean banner = findTestObject('Object Repository/KitaBisa/CnthBanner')

If(banner == true) { 
        WebUI.click(findTestObject('Object Repository/KitaBisa/CnthBannerClose'))

        WebUI.verifyElementNotVisible(findTestObject('Object Repository/KitaBisa/CnthBanner'))
    }

Else{ 
        WebUI.verifyElementNotVisible(findTestObject('Object Repository/KitaBisa/CnthBanner'))
    }

WebUI.click(findTestObject('Object Repository/KitaBisa/BtnKembalikepelanggan'))

WebUI.verifyElementVisible(findTestObject('KitaBisa/VerifyHome'))

