package jv04;

public class ex04_11_for실습예제 {
    public static void main(String[] args){
        
        /*for(int i=4;i<=9;i=i+1){
            System.out.println(i);
            
                     
        }*/
        int i ;
        int x ;
        int sum =0;
        
        
        for( i=1; i<=10;i++){           
        
             /* for( i=1; i<=i; i= i+1){
           
               sum = sum +i;
              }*/
            sum = sum +i;
        System.out.println("1부터"+i+"까지의 합:"+sum);
           
           
       }
    }
    
}
