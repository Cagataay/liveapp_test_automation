package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPages;
import util.DriverFactory;

public class LoginStepDefinitions {
    LoginPages loginPages=new LoginPages(DriverFactory.getDriver());

    @When("E-mail ile giris butonuna tiklanir")
    public void eMailIleGirisButonunaTiklanir() {loginPages.clickOnEmailLoginButton();
    }

    @When("E-mail bilgisi girilir")
    public void eMailBilgisiGirilir() {loginPages.enterEmailInformation();
    }

    @When("E-maile ait sifre bilgisi girilir")
    public void eMaileAitSifreBilgisiGirilir() {loginPages.enterEmailPassword();
    }

    @When("Login butonuna tiklanir")
    public void loginButonunaTiklanir() {loginPages.clickOnLoginButton();
    }

    @Then("Live ekranina ulasildigi kontrol edilir")
    public void liveEkraninaUlasildigiKontrolEdilir() {loginPages.checkIfReachedLiveScreen();
    }

    @When("Bildirim izni verilir")
    public void bildirimIzniVerilir() {loginPages.allowNotificationPermission();
    }

    @When("Google ile giris butonuna tiklanir")
    public void googleIleGirisButonunaTiklanir() {loginPages.clickOnGoogleLoginButton();
    }

    @When("Ilgili Google hesabina tiklanir")
    public void ilgiliGoogleHesabinaTiklanir() {loginPages.clickOnRelatedGoogleAccount();
    }

    @When("Telefon ile giris butonuna tiklanir")
    public void telefonIleGirisButonunaTiklanir() {loginPages.clickOnPhoneLoginButton();
    }

    @When("Telefon ulke kodu secme butonuna tiklanir")
    public void telefonUlkeKoduSecmeButonunaTiklanir() {loginPages.clickOnPhoneCountryCodeSelectionButton();
    }

    @When("Ilgili telefon ulke kodu aratilir")
    public void ilgiliTelefonUlkeKoduAratilir() {loginPages.searchForRelatedPhoneCountryCode();
    }

    @When("Ilgili telefon ulke kodu secilir")
    public void ilgiliTelefonUlkeKoduSecilir() {loginPages.selectRelatedPhoneCountryCode();
    }

    @When("Ilgili telefon numarasi girilir")
    public void ilgiliTelefonNumarasiGirilir() {loginPages.enterRelatedPhoneNumber();
    }

    @When("Continue-Verify butonuna tiklanir")
    public void continueVerifyButonunaTiklanir() {loginPages.clickOnContinueOrVerifyButton();
    }

    @When("Ilgili telefon numarasi onaylanir")
    public void ilgiliTelefonNumarasiOnaylanir() {loginPages.confirmRelatedPhoneNumber();
    }

    @When("Telefon numarasina gelen dogrulama kodu girilir")
    public void telefonNumarasinaGelenDogrulamaKoduGirilir() {loginPages.enterVerificationCodeReceivedOnPhoneNumber();
    }

}
