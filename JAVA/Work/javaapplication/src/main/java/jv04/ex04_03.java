package jv04;

public class ex04_03 {
    
    public static void main(String[] args) {
        
        int x;
        int y;
        
        for (int i = 1; i <= 5; i = i + 1) {
            for (int j = 1; j <= 5; j = j + 1) {
                
                System.out.print("[" + i + "," + j + "]");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println();
            for (int j = 1; j <= 5; j = j + 1) {
                
                if (i == j) {
                    
                    System.out.print("[" + i + "," + j + "]");
                    
                }
                
                else {
                    System.out.print("     ");
                }
            }
        }
        
    }
    
}
