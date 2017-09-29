package jv07;

import java.util.Arrays;

public class jv07_09_maxarray {
    public static void main(String[]args){
        //int size = 100;
        //int[] array = new int[size];
        
        int[] array={10,8,102,37,76,13};
        /*for(int i=0; i<=array.length-1;i=i+1){
            
            array[i]=i;
        }*/
              
        
        max(array);
        
        
    }
    public static void max(int[] array){
       
       Arrays.sort(array);
        
        System.out.println("최대값은:"+array[array.length-1]);
        System.out.println("최솟값은:"+array[0]);
        
    }
}
