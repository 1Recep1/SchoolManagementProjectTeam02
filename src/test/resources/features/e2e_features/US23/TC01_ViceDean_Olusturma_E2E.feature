Feature: Dean, Vice Dean Ekleyebilmeli

  Scenario: TC01 Admin Web Sitesinde Vice Dean olusturabilmeliRB
    Given Kullanici web sitesine giderRB
    When Kullanici kayitli bir Admin hesabi ile giris yaparRB
    And Kullanici Menu butonuna tiklarRB
    And Acilan sayfadan Vice Dean Management kismina tiklarRB
    And Kullanici Vice Dean Management sayfasinda Name alanina "Elizabeth" girerRB
    And Surname alanina "Olsen" girerRB
    And Birth Place alanina "Sherman Oaks" girerRB
    And Gender alaninda 'Female' cinsiyet secerRB
    And Date Of Birth alanina "02161989"girerRB
    And Phone alanina "224-875-9205" girerRB
    And Ssn alanina "531-42-2352" girerRB
    And Username alanina "WandaVision" girerRB
    And Password alanina bir sifre girerRB
    And Submit butonuna tiklarRB
    And Admin Vice dean saved mesajinin gorundugunu dogrularRB
    Then Sayfayi kapatirRB

  Scenario: Olusturulan Vice Dean hesap bilgisini alma testi
    Given "Admin" olarak giris yapilir
    And Kayitli Vice Dean hesab bilgisinin ID nosu alinir(Admin)
    And Vice Dean GetViceDeanById icin URL duzenlenir(Admin)
    And Vice Dean GetViceDeanById icin beklenen veriler duzenlenir(Admin)
    When Vice Dean GetViceDeanById icin GET Request gonderilir ve Response alinir(Admin)
    Then Status kodun 200 oldugu dogrulanir(Admin)
    And Vice Dean GetViceDeanById icin gelen Response body dogrulanir(Admin)


  Scenario: Kayitli Vice Dean bilgisini dogrulama testi
    Given Database baglantisi kurulur(Admin)
    And Vice Dean GetViceDeanById icin beklenen veriler duzenlenir(Admin)
    When Kayitli Vice Dean bilgisini almak icin Query gonderilir(Admin)
    Then Kayitli Vice Dean bilgisi dogrulanir(Admin)
    And Baglanti kesilir(Admin)

  Scenario: Kayitli Vice Dean hesabi silme testi
    Given "Admin" olarak giris yapilir
    And Vice Dean Delete icin URL duzenlenir(Admin)
    When Vice Dean Delete icin DELETE Request gonderilir ve Response alinir(Admin)
    Then Status kodun 200 oldugu dogrulanir(Admin)