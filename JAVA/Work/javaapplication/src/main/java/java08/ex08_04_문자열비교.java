package java08;

import java.util.Scanner;

public class ex08_04_문자열비교 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("문자열 1입력:");
        String x = keyboard.nextLine();
        System.out.println("문자열 2 입력:");
        String y = keyboard.nextLine();
        
        if(x.equals(y)){
            
            System.out.println("same");
        }
        else{
            System.out.println("not same");
            
            
        }
        if(x==y){
            
            System.out.println("same");
        }
        else{
            System.out.println("not same");
            
            
        }
    }
    
}
