package jv04;

import java.util.Scanner;

public class ex04_11_구구단 {
    
    public static void main(String[] args) {
        
               
        Scanner keyboard = new Scanner(System.in);
        System.out.println("시작 단수를 입력하시오.:");
        int x = keyboard.nextInt();
        System.out.println("시작 단수를 입력하시오.:");
        int y = keyboard.nextInt();
        
        int temp;
        
        if(x>y) {
            
            temp = x   ;
              x  = y   ;
              y  = temp;
            
        }
        
        for (int i = x; i <= y; i = i + 1) {
            System.out.println();
            for (int j = 1; j < 10; j = j + 1) {
                if (j == 9) {
                    System.out.format("%2d*%d=%3d. ", i, j, i * j);
                } else {
                    System.out.format("%2d*%d=%3d, ", i, j, i * j);
                }
                
            }
        }
    }
    
}
