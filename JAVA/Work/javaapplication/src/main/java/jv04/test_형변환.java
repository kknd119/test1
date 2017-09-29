package jv04;

public class test_형변환 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String str = "1";
        char   x   = 'C';
        int i = Integer.parseInt(str);
        
        System.out.println(i);
        
        
        i = (int) x ; 
        System.out.println(i);

        
    }
    
}
