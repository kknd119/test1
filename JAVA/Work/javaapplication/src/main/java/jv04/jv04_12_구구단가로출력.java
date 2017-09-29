package jv04;

public class jv04_12_구구단가로출력 {
    
    public static void main(String[] args) {        
              
        
        for (int i = 2; i < 20; i = i + 1) {
            System.out.println();//줄바꿈을 넣을 수 있는곳.
            
            for (int j = 1; j < 10; j = j + 1) {
                if(j==9){
                System.out.format("%2d*%d=%3d.  ", i, j, i * j);
                }
                else
                {
                    System.out.format("%2d*%d=%3d,  ", i, j, i * j);
                }
            }
            //줄바꿈을 넣을 수 있는곳.
        }
        
       
    }
}
