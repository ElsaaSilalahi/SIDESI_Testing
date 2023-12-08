#Feature: Test for PA (http://127.0.0.1:8000/login)
#
#		Scenario: Test Login with Valid Credentials
#				Given open chrome and start application
#				When I enter valid username and valid password
#				Then I can login succesfully
Feature: Test for PA (http://127.0.0.1:8000/login)

  Scenario: Test Login with Valid Credentials
    Given open chrome and start application
    When I enter valid username and valid password
    Then I can login succesfully
    And I click layanan pustaka
    And I click menu Pertanian
    And I click menu pinjam alat pertanian 
    And I click button pinjam
    And I enter tanggal peminjaman
    And I enter tanggal pengembalian
    Then I can tambah barang succesfully
