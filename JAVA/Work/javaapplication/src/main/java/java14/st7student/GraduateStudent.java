package java14.st7student;

public class GraduateStudent extends Student{
    
    public String lab ;
    
    
    

  
    public GraduateStudent(int number, String name, String phone, String lab) {
        super(number, name, phone);
        this.lab = lab;
    }

    public GraduateStudent(String lab) {
        super();
        this.lab = lab;
    }

    public GraduateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

    public GraduateStudent(int number, String name, String phone) {
        super(number, name, phone);
        // TODO Auto-generated constructor stub
    }

    /////////////////////////////////////////////
    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "GraduateStudent [lab=" + lab + ", toString()="
                + super.toString() + "]";
    }

    
    
    
}
