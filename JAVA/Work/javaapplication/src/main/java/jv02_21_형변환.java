
public class jv02_21_형변환 {
    
    public static void main(String[] agrs){
        
        int i = 43;
        // 변수 i --> double 변환
        double d = (double) i;
        System.out.println(d);
        
        //변수 i --> char 변환
        
        char e = (char)i;
        System.out.println(e);
        
        //변수 i -->boolean 변환
        
        boolean f = (i!=0);
        System.out.println(f);
        
        //변수 i-->string 형변환
        
        String str = Integer.toString(i);
        System.out.println(str);
        
    }
    
}
