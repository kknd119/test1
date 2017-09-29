package jv07;

import java.util.Arrays;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Array;

public class jv07_03_반평균구하기2 {
    public static void main(String[] args){
        
        int size = 3;
        int [] array =new int[size];
        
        Scanner keyboard = new Scanner(System.in);
        
        int sum=0;
        for(int i =0 ; i<=array.length-1; i=i+1){
            
            System.out.println("성적1을 입력하세요");
            array [i]= keyboard.nextInt();
        }
        for(int i =0 ; i<=array.length-1; i=i+1){
            
            System.out.print(array[i]+",");
        }
        
        
        
        
    }
    
    
}
