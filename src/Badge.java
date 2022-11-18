class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;
    private static void keepTrackOfEmployeesNumber(){
        Badge.totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode(){
        return "XYZ" + employee.getName() + employee.getSurname() + "XYZ";
    }
    public void showBadgeDetails(){
        System.out.println("Total Employee: " + Badge.totalNumberOfEmployees);
        System.out.println(employee.getEmployeeDetails());
        System.out.println("Badge Id Code: " + this.badgeIdCode);
    }
    public Badge(Employee employeeThatNeedsBadge){
        Badge.keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
