package jv04;

import java.util.Scanner;

public class ex04_16_대문자소문자변환 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ch:");
       String x = keyboard.next();
       char y = x.charAt(0);
       
        int z = (int)y;
        int r;
        char k;
        if(z>=65 && z<=90){
            
            r = z+32;
            k = (char) r;
            System.out.println(k);
        
        }
        else if(z>=97 && z<=122){
            r = z-32;
            k = (char) r;
            System.out.println(k);
        }
        else{
            System.out.println("알파벳 소문자 또는 대문자를 입력하셔야 합니다.");
            
        }
                  
            
    }
    
}
