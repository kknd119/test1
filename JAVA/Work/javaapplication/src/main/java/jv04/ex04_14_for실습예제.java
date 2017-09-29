package jv04;

public class ex04_14_for실습예제 {
    public static void main(String[] args) {
        
        int x;
        int i = 0;
        int m;
        
        for (i = 1; i <= 9; i = i + 1) {
            
            m = 2 * i;
            
            if (i < 9) {
                System.out.printf(" 2*" + i + "=" + m + ",");
            } else {
                System.out.printf(" 2*" + i + "=" + m + ".");
                
            }
        }
        
    }
    
}
