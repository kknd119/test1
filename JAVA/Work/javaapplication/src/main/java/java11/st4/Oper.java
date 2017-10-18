package java11.st4;

public class Oper {
    
    int num1;
    int num2;
    
    //
    public int getNum1() {
        return num1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public int getNum2() {
        return num2;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    //
    public Oper(int num1, int num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //
    @Override
    public String toString() {
        return "Oper [num1=" + num1 + ", num2=" + num2 + "]";
    }
    
    int getAdd() {
        return num1 + num2;
        
    }
    
    void printAdd() {
        
        int add = getAdd();
        
        System.out.println("Add:" + add);
    }
    
    int getMinus() {
        return num1 - num2;
        
    }
    
    void printMinus() {
        
        int minus = getMinus();
        
        System.out.println("Minus: " + minus);
    }
    
    int getMul() {
        return num1 * num2;
        
    }
    
    void printMul() {
        
        int mul = getMul();
        
        System.out.println("Mul:" + mul);
    }
    
    double getDiv() {
        return num1 / (double) num2;
        
    }
    
    void printDiv() {
        
        double div = getDiv();
        
        System.out.format("Div: %.6f ", div);
    }
}
