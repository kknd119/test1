package jv07;

import java.util.Arrays;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Array;

public class jv07_03_반평균구하기3 {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요.");
        int size =  keyboard.nextInt();
        
        int [] array =new int[size];
        
        
        
        int sum=0;
        for(int i =0 ; i<=array.length-1; i=i+1){
            
            System.out.println("성적을 입력하세요");
            array [i]= keyboard.nextInt();
        }
        for(int i =0 ; i<=array.length-1; i=i+1){
            if(i==array.length-1){
            System.out.print(array[i]+"");
            }
            else{
                System.out.print(array[i]+",");
            }
            
        }
        System.out.println();
        
        for(int i =0 ; i<=array.length-1; i=i+1){
           
            sum = sum + array[i];
           
            
        }
        int aver = sum/size;
        System.out.println("합    계 :"+sum);
        System.out.println("평균성적 :"+aver);
        
        
        
        
        
    }
    
    
}
