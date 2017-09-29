package jv04;

import java.util.Scanner;

public class ex04_01_n1부터n2합계구하기 {
    
    public static void main(String[] args) {
        
        int n1;
        int n2;
        int sum = 0;
        int j = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("n1을 입력하시오.");
        n1 = keyboard.nextInt();
        System.out.println("n2을 입력하시오.");
        n2 = keyboard.nextInt();
        
        for (int i = n1; i <= n2; i = i + 1) {
            
            sum = sum + i;
            
        }
        // System.out.print(n1);
        
        if (j == 0) {
            System.out.print((n1 + j));
        }
        for (j = 1; j <= (n2 - n1); j = j + 1) {
            
            System.out.print("+" + (n1 + j));
        }
        System.out.print("=" + sum);
        
    }
}
