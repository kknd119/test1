package jv07;

import java.util.Scanner;

public class ex07_07_자리예약1차원 {
    public static void main(String[]args){
      
        Scanner keyboard = new Scanner(System.in);  
        int[] x = new int[10];  //10개짜리 배열생성.
        
        
        print(x);//업데이트된 좌석 배치표 실행
        
        for(int i=0;true;i=i+1){
            System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1)");
            
            int n = keyboard.nextInt();
            
            if(n==-1){
                System.out.println("종료합니다.");  
                break;
            }
            else if(x[n-1] == 1){
                System.out.println("이미예약된 자리입니다.");
            }
            else{
                                    
            x[n-1] = 1;
            
            print(x);
            }
            
            
        }
        
        
        
        //원하는 좌석번호 입력 및 배열원소에 저장
       
        
    }
    public static void print(int[] p ){
        System.out.println("--------------------------------");//좌석배치표 실행
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        System.out.println("--------------------------------");
        System.out.format("%d %d %d %d %d %d %d %d %d %d",p[0],p[1],p[2],p[3],p[4],p[5],p[6],p[7],p[8],p[9]);
        System.out.println();
              
        
    }
    
}
