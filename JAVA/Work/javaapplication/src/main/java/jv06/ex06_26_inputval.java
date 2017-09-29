package jv06;

import java.util.Arrays;

public class ex06_26_inputval {
    public static void main(String[]args){
        
        
        System.out.println(Arrays.toString(inputVal("korea","Seoul")));
       
    }
    public static String[] inputVal(String x, String y){
        
        String[] name = new String [2];
        name[0] = x;
        name[1] = y;
         
        return name;
    }
}
