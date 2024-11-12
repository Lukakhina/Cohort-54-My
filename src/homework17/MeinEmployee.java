package homework17;


public class MeinEmployee {
    public static void main(String[] args) {
        Employee cashier = new Employee("Mariy",35,1600);

        System.out.println(cashier.toString());

        Employee securityGuard = new Employee("Mark",42,1400);

        System.out.println(securityGuard.toString());

        Employee administrator = new Employee("Roma",35,2200);

        System.out.println(administrator.toString());

    }

}
