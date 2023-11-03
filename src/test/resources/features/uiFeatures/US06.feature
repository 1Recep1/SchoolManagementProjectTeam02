Feature: US06 Dean, Vice Dean hesabi olusturabilmeli

  Background: Kullanici web sitesine gider
    Given Kullanici web sitesine gider
    When Kullanici kayitli bir Dean hesabi ile giris yapar

  Scenario: TC01 Dean Web Sitesinde Vice Dean olusturabilmeli
    Given Kullanici Vice Dean Management sayfasinda Name alanina bir isim girer
    When Surname alanina bir soyisim girer
    And Birth Place alanina dogum yeri girer
    * Gender alaninda 'Female' cinsiyet secer
    And Date Of Birth alanini doldurur
    And Phone alanina telefon numarasi girer
    And Ssn alanina bir Sosyal Guvenlik Numarasi girer
    And Username alanina bir kullanici adi girer
    And Password alanina bir sifre girer
    And Submit butonuna tiklar
    And Vice dean saved mesajinin gorundugunu dogrular
    Then Sayfayi kapatir