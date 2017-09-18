package java02;

public class jv02_24_형변환 {
    
    public static void main(String[] agrs){
        
        int result;
        
        result = 1 + '2';
        
        
        System.out.println(result);
        result = 1 + '2';
        System.out.println(result);
        
        //result = 2 + true;
        result =1+ ((true)? 1:0);
        System.out.println(result);
         
        
        
       // result = "15" - 5;
         result= Integer.parseInt("15")-5;
         System.out.println(result);
        
        //result = "1" + '2';
        Integer.valueOf("1")+'2'=result;
        System.out.println(result);
        
       // result = false + true;
        Boolean()
        System.out.println(result);
        
        //정수 실수 문자 3가지 사이에서만 형 변환 가능하다.!!
        
    }
    
}
