@login
Feature:SuperLive Mobil Uygulamasi Tum Login Islemleri
  Scenario:SuperLive Mobil Uygulamasi Email Login Islemi
    When Bildirim izni verilir
    When E-mail ile giris butonuna tiklanir
    When E-mail ile giris butonuna tiklanir
    When E-mail bilgisi girilir
    When E-maile ait sifre bilgisi girilir
    When Login butonuna tiklanir
    Then Live ekranina ulasildigi kontrol edilir

  Scenario:SuperLive Mobil Uygulamasi Google Login Islemi
    When Bildirim izni verilir
    When Google ile giris butonuna tiklanir
    When Ilgili Google hesabina tiklanir
    Then Live ekranina ulasildigi kontrol edilir

  Scenario:SuperLive Mobil Uygulamasi Telefon Login Islemi
    When Bildirim izni verilir
    When Telefon ile giris butonuna tiklanir
    When Telefon ulke kodu secme butonuna tiklanir
    When Ilgili telefon ulke kodu aratilir
    When Ilgili telefon ulke kodu secilir
    When Ilgili telefon numarasi girilir
    When Continue-Verify butonuna tiklanir
    When Ilgili telefon numarasi onaylanir
    When Telefon numarasina gelen dogrulama kodu girilir
    When Continue-Verify butonuna tiklanir
    Then Live ekranina ulasildigi kontrol edilir