package jv07;

import java.util.Arrays;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Array;

public class jv07_03_반평균구하기 {
    public static void main(String[] args){
        
        int [] x = new int[3];
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("성적1을 입력하세요");
         x[0] = keyboard.nextInt();
       
        System.out.println("성적2을 입력하세요");
         x[1] = keyboard.nextInt();
       
        System.out.println("성적3을 입력하세요");
         x[2] = keyboard.nextInt();
         
         System.out.println(Arrays.toString(x));
        
    }
    
    
}
