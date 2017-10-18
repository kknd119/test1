package javja14.st6manager;

public class Manager extends Employee {
    
    private int bonus=0;
    
    public void test() {
        String info ="nmae"+ super.getName();
               info =info + ", address:"+super.getAddreess();
               info =info +",salary :"+super.salary;
               info =info +",rrn :"+super.getRrn();
        
        System.out.println("시험합격");        
    }
    
    public Manager(String name, String addreess, int salary, String rrn,
            int bonus) {
        super(name, addreess, salary, rrn);
        this.bonus = bonus;
    }
    
    public Manager(int bonus) {
        super();
        this.bonus = bonus;
    }
    
    public Manager() {
        super();
    }
    public Manager(String name, String addreess, int salary, String rrn)
             {
        super(name, addreess, salary, rrn);
        this.bonus = bonus;
    }
    
    

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager [bonus=" + bonus + ", toString()=" + super.toString()
                + "]";
    }
    
}
