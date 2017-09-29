package test;

import java.util.Vector;

public class test_getname {
    
    public static void main(String[] args){
        
        FireEngine fe = new FireEngine();
        System.out.println(fe.getClass().getName());
        
    }
    
     
    
    
}

class Car{}
class FireEngine extends Car{}