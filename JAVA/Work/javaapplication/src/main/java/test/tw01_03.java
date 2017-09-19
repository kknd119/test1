package test;

import java.util.Scanner;

public class tw01_03 {
    
    public static void main(String[] args){
        
        int salary;
        int deposit;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("월급을 입력하시오");
        
        salary = keyboard.nextInt();
        
        System.out.println("월저축액을 입력하시오");
        deposit= keyboard.nextInt();
        
        int sum = deposit*12*10;
        
        System.out.println("10년치 저축액의 총합은 :"+sum+"원");
        
        
                
    }
    
}
