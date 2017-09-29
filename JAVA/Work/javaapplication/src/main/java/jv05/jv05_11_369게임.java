package jv05;

import java.util.Scanner;

public class jv05_11_369게임 {
    
    public static void main(String[] args) {
       // for(int i=0; i<100; i= i+1){
        // int i = 123456; 
         int k = 0;
            
         //    예 376= 376/100 +376%100/10 +376%100%10
         // 123456
         
         Scanner keyboard = new Scanner(System.in);
         System.out.println("1부터 1000000까지의 임의에 수를 입력하세요");
         int i = keyboard.nextInt();
           
            int a = i/100000;
            int b = i%100000/10000;
            int c = i%10000/1000 ;
            int d = i%1000/100;
            int e = i%100/10;
            int f = i%10;
            
            
            
            
            System.out.format("%d,%d,%d,%d,%d,%d",a,b,c,d,e,f);
            
            if(a==3 || a ==6 || c==9) {
                k=k+1;}               
                
            if(b==3 || b==6 || b==9 ){
                k=k+1;}
                    
            if(c==3 || c==6 || c==9 ){
                k=k+1;}
                        
            if(d==3 || d==6 || e==9 ){
                k=k+1;}
                            
            if(e==3 || e==6 || e==9 ){
                k=k+1;}
                                
            if(f==3 || f==6 || f==9 ){ 
                k=k+1;}
            
                                   
                                    
                            
                            
                   
               
                
           
            
           if(k==6){
               System.out.println("박수6번");}
           else if(k==5){
               System.out.println("박수5번");}
           else if(k==4)
           {System.out.println("박수4번");}
           else if(k==3){
               System.out.println("박수3번");}
           else if(k==2){
               System.out.println("박수2번");}
           else if(k==1){
               System.out.println("박수1번");}
           else{}
           
           
           
           
           
           
            
            
        }
            
        
        
    
    
}
