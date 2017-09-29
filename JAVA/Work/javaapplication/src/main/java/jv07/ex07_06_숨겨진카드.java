package jv07;

import java.util.Random;
import java.util.Scanner;

public class ex07_06_숨겨진카드 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int x;
        int y;
        String k = "";
        
        for (int j = 1; true; j = j + 1) {
            
            if (k.equals("n")) {
                System.out.println("나가겠습니다.");
                break;
            } else if (k.equals("y")) {
                
                System.out.println("반복하겠습니다.");
            } else {
                
            }
            
            x = random.nextInt(100); // 예 x = 50
            System.out.println("수를 결정하였습니다. 맞추어보세요 ");
            System.out.println("0~99");
            
            for (int i = 1; true; i = i + 1) {
                
                System.out.println(i + ">>");
                y = keyboard.nextInt();
                if (x > y) {
                    System.out.println("더 높게");
                } else if (x < y) {
                    System.out.println("더 낮게");
                    
                } else {
                    System.out.println("맞추었습니다.");
                    System.out.println("다시하시겠습니까?(y/n)");
                    k = keyboard.next();
                    break;
                }
                
            }
            
        }
        
    }
}

////////////////////////////////////////////////////////////////
