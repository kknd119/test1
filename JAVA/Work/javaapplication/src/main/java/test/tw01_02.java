package test;

import java.util.Scanner;

public class tw01_02 {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        //키보드와 프로그램 연결
        
        System.out.println("숫자를 입력하시오.");
        int x = keyboard.nextInt();
        System.out.println(x);
        
        System.out.println("문장을 입력하시오.");
        String y = keyboard.next();
        System.out.println(y);
    }
    
}
