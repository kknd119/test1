package jv07;

import java.util.Arrays;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Array;

public class jv07_08_Array메서드 {
    public static void main(String[]args){
        
        //키보드 입력
        Scanner keyboard =new Scanner(System.in);       
        //배열만들기
        int size = 6;
        int [] array =new int [size] ;
        
        
        for(int i =array.length-1; i>=0;i=i-1){
            array[i] =array.length-i;
        }
         //Array 정렬
        java.util.Arrays.sort(array);
        printArray(array);
        
       //Array 검색
        int var = java.util.Arrays.binarySearch(array, 4);
        System.out.println("4의값의 위치는 :"+var);
       
        
        //Array 초기화
        Arrays.fill(array, -1);
        printArray(array);
        
        
        
    } 
    public static void printArray(int[] x){
        for(int i =0; i<=x.length-1; i=i+1){
            
            System.out.print(x[i]+",");
        }
        
        return ;
        
        
        
        
    }
    //메서드 만들기
    //메서드명 :print Array
    //메서드 타입 :void
    //매개변수 : 정수 배열
}
