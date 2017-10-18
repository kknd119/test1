package java13.stremployee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] emp = new Employee[3];
        
        for (int i = 0; i < 3; i = i + 1) {
            System.out.println("name:");
            String n = scan.next();
            System.out.println("adress:");
            String a = scan.next();
            System.out.println("salary:");
            int s = scan.nextInt();
            System.out.println("rrn:");
            String r = scan.next();
            
            emp[i] = new Employee(n, a, s, r);
        }
        for (int i = 0; i < 3; i = i + 1) {
            System.out.println(emp[i].toString());
        }
        System.out.println("---------------------------");
        
        for(Employee e: emp){
            System.out.println(e.toString());
        }
    }
    
}
