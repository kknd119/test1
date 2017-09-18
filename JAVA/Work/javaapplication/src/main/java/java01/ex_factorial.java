package java01;

public class ex_factorial {
    public static void main(String[] args){         
        
        int result = factorial(20);
        System.out.println(result);
    }
    
    static int factorial(int n) {
        int result = 0;
        
        if(n==1)
            result = 1;
        else
            result = n*factorial(n-1);
        
        return result ;
    }
    
    
}
