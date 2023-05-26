#Autor: Juan Sebastián Libreros

  @HistoriaDeUsuario
  Feature: Verify the validation form
    Me as user WANT to enter the colorlib page TO Verify the validation form

  Scenario Outline: Verify the validation form
    Given I enter with my credentials
    |User|Password|
    |<User>|<Password>|
    When I proceed with the authentication
    And enter the submenu for validations
    And check the title of the form on the screen
    And fill all the fields
      |Required|Select|MultipleSelect|Url|Email|Password2|ConfirmPassword|MinField|MaxField|Number|IP|Date|Past|
      |<Required>|<Select>|<MultipleSelect>|<Url>|<Email>|<Password2>|<ConfirmPassword>|<MinField>|<MaxField>|<Number>|<IP>|<Date>|<Past>|
    And click the button validate
    Then field required will be empty

    Examples:
      |User|Password|Required|Select|MultipleSelect|Url|Email|Password2|ConfirmPassword|MinField|MaxField|Number|IP|Date|Past|
      |admin|admin|prueba|option2|option3|http://dfsdfd.com|a@q.com|1234|1234|123456|null12|80|193.128.180.0|2012-05-02|2012/09/10|

