package steps;

import pages.DashboardPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static DashboardPage dashboard;

    public static void intializePageObjects(){
        login = new LoginPage();
        dashboard = new DashboardPage();

    }
}
