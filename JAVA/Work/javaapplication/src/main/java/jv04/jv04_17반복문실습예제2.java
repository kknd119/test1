package jv04;

public class jv04_17반복문실습예제2 {
    
        public static void main(String[] args){
            
            int i ;
            int j;
            int sum=0 ;
            int tsum =0;
            for(i=1;i<=10; i= i+1){
               // System.out.print(sum);
                
                tsum =tsum +sum;
                System.out.println(tsum);
                sum=0;        
                        
                for(j=1; j<=i; j= j+1 ){
                    
                    sum = sum + j;
                    
                    
                }
            }
        }
    
}
