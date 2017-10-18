package javja14.st6manager;

public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Employee e = new Employee();
        Manager m= new Manager();
        //e.salary=10000;
        System.out.println( e.toString());
        System.out.println( m.toString());
        
        Employee e1 = new Employee("송중기","서울",100,"1970");
        Manager m1= new Manager("송형기","서울",120,"1968",10);
        
        System.out.println( e1.toString());
        System.out.println( m1.toString());
        m1.test();
        
        
        Manager m2= new Manager("강다니엘","압구정",100000000,"940101");
        m2.test();
        System.out.println( m2.toString());

        Manager m3= new Manager();
        m3.setName("강형");
        m3.setAddreess("노원");
        m3.salary=1000000;
        m3.setRrn("19450505");
        m3.test();
        
    }
    
}
