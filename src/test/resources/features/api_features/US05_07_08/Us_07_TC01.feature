
Feature: Dean mesajlari gorebilmeli

  Scenario Outline: US07 Gelen Mesajlari Dogrulama
    Given Mesajlari almak icin Get request hazirligi yapilirMsk
    Then Verify Body : name="<name>", email="<email>", subject="<subject>",message="<message>",date="<date>"
    Examples:
      | name  | email              | subject | message                        | date        |
      | samet | smt@gmail.com | java | daha güzel olabilir çalışma | 2023-11-09" |