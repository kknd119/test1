package jv07;

import java.util.Scanner;

public class jv07_01_동적배열 {
   public static void main(String[] args){
       
       Scanner keyboard = new Scanner(System.in);
       System.out.println("배열의 크기를 입력하시오.");
       int x = keyboard.nextInt();
       
       int[] arry = new int[x];
       
       System.out.println("배열의 크기는 :"+arry.length);
               
   }
}
