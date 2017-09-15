package java02;

import java.util.Scanner;

public class ex02_01_면적구하기 {
    
    public static void main(String[] agrs){
        
       
        int area;
        int perimeter;
        
        Scanner keyboard =new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int x = keyboard.nextInt();//정수입력
               
        System.out.println("정수를 입력하세요:");
        int y = keyboard.nextInt();//정수입력
        
        /*System.out.println("문자를 입력하세요:");
        String y =keyboard.next(); //문자열입력*/
        
        
        area = x*y;
        perimeter = 2*(x+y);
        
        System.out.println("사각형의 넓이:"+area);
        System.out.println("사각형의 둘레:"+perimeter);
        
    }
    
}
