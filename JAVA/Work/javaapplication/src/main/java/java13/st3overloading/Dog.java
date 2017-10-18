package java13.st3overloading;

public class Dog {
    public void sound(){
        System.out.println("sound()");
    }
    //오버로딩 동명이매
    public void sleep(){
        System.out.println("sleep()");
        
    }
    public void sleep(int x){
        System.out.println("sleep(int x)");
    }
    public void sleep ( String x){
        System.out.println("sleep(String x)");
        
    }
    public void sleep(int y,String x){
        System.out.println("int y,String x");
    }
    public void sleep(String x,int y){
        System.out.println("int y,String x");
    }
    //개타순 매개변수의 개수 타입 순서로 메서드를 구분한다.
}
