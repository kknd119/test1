package jv06;

import java.util.Scanner;

public class ex06_03_isNumber {
    public static void main(String[]args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("문자열을 입력하시오");
        String x = keyboard.nextLine();
        
        boolean y = isNumber(x);
        System.out.println(y);
        
    }
    
public static boolean isNumber(String a){
        
        boolean resutl;
        
        if( a== null || a.equals("")){
            resutl = false;
        }
        else{
            resutl = true ;
        }
        
       
        
        
        return resutl ;
    }
}
