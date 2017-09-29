package jv07;

import java.util.Scanner;

public class ex07_05_유효점수 {
    public static void main(String[]args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("심사 위원의 수를 입력하시오 :");
        int size = keyboard.nextInt();
        
        int[] x = new int[size];
        System.out.println("5명심사위원의 점수 입력:");
        for(int i=0; i<=size-1; i=i+1){            

            x[i] = keyboard.nextInt();
                        
        }
       java.util.Arrays.sort(x);
       System.out.print("유효점수:");
       for(int i=1; i<=size-2; i=i+1){            

             System.out.print(x[i]+",");
                       
       }
            System.out.println();
            
            float sum = 0;
            for(int i=1; i<=size-2; i=i+1){            

               sum = sum +x[i];
                          
          }
            System.out.println("합계 :"+ sum);
            System.out.format("평균 :%.2f", sum/(size-2));
        
    }
}
