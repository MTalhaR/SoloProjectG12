package steps;

import pages.*;

public class PageInitializer {
    public static LoginPage login;
    public static DashboardPage dashboard;
    public static AddEmployeePage addEmployee;
    public static EmployeeListPage employeeList;
    public static DirectoryPage directory;
    public static EmployeesDetailsPage personalDetails;
    public static DependentsPage dependents;
    public static void intializePageObjects(){
        login = new LoginPage();
        dashboard = new DashboardPage();
        addEmployee = new AddEmployeePage();
        employeeList = new EmployeeListPage();
        directory = new DirectoryPage();
        personalDetails = new EmployeesDetailsPage();
        dependents = new DependentsPage();

    }
}
