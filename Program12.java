public class Program12 extends Program11{
    public static void main(String[] args) {
        Program12 emp = new Program12();
        emp.salary = 1000;
        System.out.println("The salary of the Employee is "+emp.salary);

        Program11 manager = new Program11();
        manager.salary = 10000;
        System.out.println("he salary of the manager is "+manager.salary);
    }
}