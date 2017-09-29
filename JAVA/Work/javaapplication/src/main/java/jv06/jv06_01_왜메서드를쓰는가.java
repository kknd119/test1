package jv06;

public class jv06_01_왜메서드를쓰는가 {
    
    public static void main(String[] args) {
        int i;
        
        int sum2 = 0;
        int sum3 = 0;
        
        int x;
        int y;
        int sum = getsum(1,10);
        System.out.println(sum);
        for (i = 1; i <= 100; i = i + 1) {
            sum2 = sum2 + i;
            
        }
        System.out.println(sum2);
        for (i = 100; i <= sum2; i = i + 1) {
            sum3 = sum3 + i;
            
        }
        System.out.println(sum3);
        
       
        
        
        
    }

    private static int getsum(int start , int end) {
        int i;
        int sum = 0;
        for (i = 1; i <= 10; i = i + 1) {
            sum = sum + i;
            
        }
        return sum;
    }
}
