package TestLayer;

import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.PIMPage;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.login();

		HomePage home = new HomePage();
		home.homePageTitle();
		home.homePageUrl();

		PIMPage pim = new PIMPage();
		pim.addEmp();
	}
}
