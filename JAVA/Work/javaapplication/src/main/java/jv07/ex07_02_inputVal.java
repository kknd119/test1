package jv07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_02_inputVal {
public static void main(String[]args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("문자열1을 입력하세요");
        String x = keyboard.nextLine();
        System.out.println("문자열1을 입력하세요");
        String y = keyboard.nextLine();
        System.out.println(Arrays.toString(inputVal(x,y)));
       
    }
    public static String[] inputVal(String x, String y){
        
        String[] name = new String [2];
        name[0] = x;
        name[1] = y;
         
        return name;
    }
    
}
