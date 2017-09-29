package jv07;

public class jv07_01_array {
    public static void main(String[]args){
        //변수 5개 선언
        int score1=1, score2=2, score3=3, score4=4,score5=5;
        
        //배열을 이용한 변수 5개 선언.
        
        int[] score = new int[5]; //아파트를 만들었다.
        score[0]= 0;//0층에 넣는다 정수 0을
        score[1]= 1;// score 아파트 1층에 정수 0을 넣는다.
        score[2]= 2;// score 아파트 2층에 정수 0을 넣는다.
        score[3]= 3;// score 아파트 3층에 정수 0을 넣는다.
        score[4]= 4;// score 아파트 4층에 정수 0을 넣는다.
        
        
        //출력 :score1에 있을 출력하시오.
        System.out.println("score1:"+score1);
        
      //score아파트 0층에 값을 출력하시오.
        System.out.println("score[0]:"+score[0]);
        
    }
    
}
