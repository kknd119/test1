package jv06;

public class jv06_03_사칙연산메서드 {
    public static void main(String[]args){
        
        int x = 2, y= 4;
        double z =4.00000;
        
        int add =ADD(x,y);
        System.out.println(add);
        int minus =Minus(x,y);
        System.out.println(minus);
        int mul   =Mul(x,y);
        System.out.println(mul);
       double div   =Div(x,y);
       System.out.println(div);
        
    }

   

    private static double Div(int x, double z) {
        // TODO Auto-generated method stub
        return x/z;
    }



    private static int Mul(int x, int y) {
        // TODO Auto-generated method stub
        return x*y;
    }

    private static int Minus(int x, int y) {
        // TODO Auto-generated method stub
        return x-y;
    }

    private static int ADD(int x, int y) {
        // TODO Auto-generated method stub
        return x+y;
    }
            
    
}
