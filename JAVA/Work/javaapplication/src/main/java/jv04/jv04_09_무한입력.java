package jv04;

import java.util.Scanner;

public class jv04_09_무한입력 {
    public static void main(String[] args){
        
        for(int i=0; true ;i=i+1){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하세요.:");
        int x = keyboard.nextInt();
        if(x>0){
        System.out.println("입력한 값은"+x+"입니다.");
        }
        else{
            System.out.println("정상종료합니다.");
        }
            
        }
    }
    
}
