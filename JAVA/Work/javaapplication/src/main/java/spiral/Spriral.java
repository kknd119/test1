package spiral;

public class Spriral {
    
    static final int SIZE =4;
    static int[][] num = new int [SIZE][SIZE];
    static int cnt=0;
    
    static int row=0;
    static int col=-1;
    
    public static void main(String[]args){
        
        spiral(SIZE,1);
        for(int i =0; i<SIZE; i++){
            for(int j=0; j<SIZE; j++)
                System.out.println(fmt(num[i][j],3));
            System.out.println();
        }
    }
    
    static void spiral (int n, int dir){
        
        if
    }
}
