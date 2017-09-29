package jv04;

import java.util.Scanner;

public class jv04_13_무한구구단 {
    public static void main(String[] args) {
                
        Scanner keyboard = new Scanner(System.in);
        
        for (int k = 0; true; k = k + 1) {
            
            
            System.out.println("시작단을 입력하세요.");
            int x = keyboard.nextInt();
            System.out.println("종료단을 입력하세요.");
            int y = keyboard.nextInt();
            
            if (x == 0 || y == 0){
                // System.out.format("프로그램을 종료합니다.");
                break;
            }            
            else if (x > y) {
                int temp = x;
                x = y;
                y = temp;                
            }
            
            for (int i = x; i <= y; i = i + 1) {
                for (int j = 2; j < 10; j = j + 1) {
                    System.out.format("%3dx%d=%3d", i, j, j * i);
                }
                
                System.out.println();
            }
        }
    }
}
