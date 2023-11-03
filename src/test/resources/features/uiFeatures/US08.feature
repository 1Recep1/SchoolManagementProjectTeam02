Feature: US_08 Vice Dean ders olusturabilmelidir
  Background:
    Given Kullanici "url" sayfasina gider.
    And Kullanici 2 saniye bekler
    Then Kullanici logine tiklar
    And Username alanina Vice Dean'e ait "username" girer
    And Password alanina Vice Dean'e ait "password" girer ve logine tiklar
    And Kullanici 2 saniye bekler

    And Kullanici Menu butonuna tiklar
    And Kullanici 1 saniye bekler
    And Vice Dean Main Menuden Lesson secer

  Scenario: TC_01 Vice Dean olarak ders olusturur
    And Vice Dean Ders Adı kutusuna bir Ders Adı yazar.
    And Vice Dean Zorunlu radyo düğmesine tıklar.
    And Vice Dean zorunlu radyo düğmesinin işaretlendiğini doğrular.
    And Vice Dean "Kredi Skoru" kutusuna bir kredi skoru yazar.
    And Vice Dean "Gönder" düğmesine tıklar.
    And Vice Dean dersin oluşturulduğunu doğrular.
    And Vice Dean zorunlu radyo düğmesinin işaretlendiğini doğrular.
    And Vice Dean zorunlu radyo düğmesinin işaretlendiğini doğrular.
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir


  Scenario: TC_02 Zorunlu Olmadan Vice Dean Olarak Ders Oluştur
    And Kullanıcı, Ders Adı kutusuna bir Ders Adı yazar.
    And Kullanıcı, Zorunlu radyo düğmesini işaretlemeden tıklar.
    And Kullanıcı, zorunlu radyo düğmesinin işaretlemediğini doğrular.
    And Kullanıcı, credit ccore kutusuna bir kredi skoru yazar.
    And Kullanıcı, Sabmit butonuna tıklar.
    And Kullanıcı, dersin oluşturulduğunu doğrular.



  Scenario: TC_03 Create to lesson as a Vice Dean without compulsory
    And User clicks to Lessons button
    And User writes a Lesson Name in Lesson Name Box
    And User clicks compulsory radio button as nonchecked
    And User asserts that if tne compulsory radio button is clicked
    And User writes a credit ccore in credit score box
    And User clicks submit button
    And User asserts that if tne lesson is created




