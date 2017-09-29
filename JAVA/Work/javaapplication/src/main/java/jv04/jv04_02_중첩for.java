package jv04;

public class jv04_02_중첩for {
    
    public static void main(String[] agrs) {
        
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("--------------------중첩for-------------");
        int sum = 0;
        
        //중첩for
        for (int i = 1; i <= 5; i = i + 1) {
            
            for (int j = 1; j <= 10; j = j + 1){
                System.out.print("*");
            
            } 
            System.out.println();
        }
       
        
    }
    
}
