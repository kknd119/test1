package java13.st4callstack;

public class jv13_03_callstack {
    
    public static void main(String[] args) {
        firstMethod();
        
    }
    public static void firstMethod() {
        secondMethod();
    }
    public static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
