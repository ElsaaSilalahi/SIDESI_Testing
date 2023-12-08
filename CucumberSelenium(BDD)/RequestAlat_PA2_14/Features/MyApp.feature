 ================================================== Request Surat =========================================================
Feature: Test for PA (http://127.0.0.1:8000/login)

		Scenario: Test Login with Valid Credentials
				Given open chrome and start application
				When I enter valid username and valid password
				Then I can login succesfully
				And I choose request alat
				And I click button request alat
				And I enter request alat input
				Then I click button kirim