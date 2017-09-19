package jv04;

import java.util.Scanner;

public class ex04_04_합계구하기 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("시작값을 입력하시오.");
        int x = keyboard.nextInt();
        
        System.out.println("종료값을 입력하시오.");
        int y = keyboard.nextInt();
        
        int sum = 0;
        
        if (x < y) {
            for (int i = x; i <= y; i = i + 1) {
                
                sum = sum + i;
            }
        } 
        else {
            for (int i = y; i <= x; i = i + 1) {
                
                sum = sum + i;
                
            }
            
        }
        
        System.out.println("sum의 값은:" + sum);
        
    }
    
}
