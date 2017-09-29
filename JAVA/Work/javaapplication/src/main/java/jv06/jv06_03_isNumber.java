package jv06;

import java.util.Scanner;

public class jv06_03_isNumber {
    public static void main(String[]args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("문자열을 입력하시오");
        String x = keyboard.nextLine();
        
        System.out.println(isNumber(x));
    }
    public static boolean isNumber(String x){
        
        boolean result;
        
        if(x==null ||x.equals("")){
            result = false; 
        }
        else{
            result = true;
        }
            
        return result;
    }
}
