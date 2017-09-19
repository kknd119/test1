package java03;

import java.util.Scanner;

public class jv03_실습예제2 {
    
    public static void main(String[]args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("K값을 입력하시오.");
        int k = keyboard.nextInt();
        
        if(k == 0){
            
            System.out.println("A");
            
        }
        else if(k>3){
            
            System.out.println("B");
        }
        else{
            
            System.out.println("C");
        }
    }
    
}
