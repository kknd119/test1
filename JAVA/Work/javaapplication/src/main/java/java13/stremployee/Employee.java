package java13.stremployee;

public class Employee {
    
    String name;
    String adress;
    int    salary;
    String rrn;
    
    //////////////////////
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAdress() {
        return adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String getRrn() {
        return rrn;
    }
    
    public void setRrn(String rrn) {
        this.rrn = rrn;
    }
    
    ///////////////////////////////////
    public Employee(String name, String adress, int salary, String rrn) {
        super();
        this.name = name;
        this.adress = adress;
        this.salary = salary;
        this.rrn = rrn;
    }
    
    /////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Employee [name=" + name + ", adress=" + adress + ", salary="
                + salary + ", rrn=" + rrn + "]";
    }
    
}
