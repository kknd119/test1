package javja14.st6manager;

public class Employee {
    
    private String name    ="";
    private String addreess="";
    protected int  salary  = 0;
    private String rrn     ="";
    
    public Employee(String name, String addreess, int salary, String rrn) {
        super();
        this.name     = name;
        this.addreess = addreess;
        this.salary   = salary;
        this.rrn      = rrn;
    }
    

    public Employee() {
        super();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddreess() {
        return addreess;
    }

    public void setAddreess(String addreess) {
        this.addreess = addreess;
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

    @Override
    public String toString() {
        return "Employee [name=" + name + ", addreess=" + addreess + ", salary="
                + salary + ", rrn=" + rrn + "]";
    }
    
    
}
