package iscisistemi;


public class Main {
    public static void main(String[] args){           //7

        Employee employee = new FullTimeEmployee(1800);
        Employee employee1 = new PartTimeEmployee("5", "100");

        System.out.println("Full-time salary: " + employee.calculateSalary());
        System.out.println("Part-time salary: " + employee1.calculateSalary());

        try {
            employee1.calculateSalary();
        }catch (NumberFormatException e){
            System.out.println("Yanlış rəqəm daxil edildi!");
        }
    }
}
