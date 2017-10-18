package java13.st2methodtype;

public class MethodTypeTest {
    public static void main(String[]args){
        
        MethodType m = new MethodType();
        
        m.instanceMethod();//인스턴스 메서드 방법
        m.staticMethod();//이방법은 사용하지 말자
        MethodType.staticMethod();//static 메서드 호출시 클래스 이름넣어서 호출
       
    }
    
}
