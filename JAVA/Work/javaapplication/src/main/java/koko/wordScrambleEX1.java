package koko;

import java.util.Random;

public class wordScrambleEX1 {
    
    public static void main(String[] args) {
        
        String[] strArr ={"CHANGE","LOVE","HOPE","VIEW"};
        
        String answer = getAnswer(strArr);
        String question = getScrambledWord(answer);
        
        System.out.println("Question: "+question);
        System.out.println("answer: "+answer);
    }
    
    public static String getAnswer(String[] strArr){
         
       Random random = new Random();
        String a = strArr[random.nextInt(4)];
        return a;
              
    }
    public static String getScrambledWord(String str){
        
        String[] b =
        
        return str;
        
        
    }
    
}
