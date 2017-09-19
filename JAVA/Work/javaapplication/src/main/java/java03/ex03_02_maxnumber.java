package java03;

import java.util.Scanner;

public class ex03_02_maxnumber {
    
    public static void main(String[] args){
        
        //정수 변수 2개 만들기 :x,y
        int x ;
        int y ;
        int z ;
        //키보드와 프로그램 연결
       
        Scanner keyboard = new Scanner(System.in);
       //첫번째 키보드에서 입력 받은 값을 x에 넣는다.
        System.out.println("x값을 입력하시오.");
        x = keyboard.nextInt();
        //두번째 키보드에서 입력 받은 값을 y에 넣는다.
        System.out.println("y값을 입력하시오.");
        y = keyboard.nextInt();
        System.out.println("z값을 입력하시오.");
        z = keyboard.nextInt();
        
        //연속 if를 사용
        //x가 y보다 크다면 x:7이라고 출력
        //y가 x보다 크다면 y:7이라고 출력
        //x와 y가 같으면 x=y:7이라고 출력
        if(x>y&&x>z){
            
            System.out.println("최대값:"+x);
            
        }                   
        else if(y>z){
        
            System.out.println("최대값:"+y);
        }    
        else{
            System.out.println("최대값:"+z);
            
        }
           
                         
       
        
    }    
   
    
}
