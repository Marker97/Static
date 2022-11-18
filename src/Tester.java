public class Tester {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Marcus", "Marziano", "G.Balduccio,20");
        Badge employeeMarcus = new Badge(employee1);
        employeeMarcus.showBadgeDetails();

        System.out.println("-------------------------------------");

        Employee employee2 = new Employee("Mario", "Rossi", "F.Maiore, 13");
        Badge employeeMario = new Badge(employee2);
        employeeMario.showBadgeDetails();
    }
}