package jv06;

import java.util.Arrays;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Array;

public class x {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
       // System.out.println("문자열을 입력하시오");
        //String  x = keyboard.nextLine();
        
        int [] iArr = new int[5];
        
        for(int i=0 ; i<iArr.length;i=i+1){
            
            iArr[i] =(int) Math.random();
            
            
        }
                
        //int[] iArr={1,2,3,4,5};
        print(iArr);
        
        
    }
    
    static void print(int[] iArr) {
        
        System.out.println(Arrays.toString(iArr));
    }
}
