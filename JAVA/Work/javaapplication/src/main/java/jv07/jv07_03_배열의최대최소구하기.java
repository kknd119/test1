package jv07;

public class jv07_03_배열의최대최소구하기 {
    public static void main(String[] args) {
        
        int[] array = { 23, 96, 35, 42, 81, 19, 8, 77, 50, 64 };
        System.out.print("배열 정렬 전:");
        for (int i = 0; i <= array.length - 1; i = i + 1) {
            if (i == array.length - 1) {
                System.out.print(array[i] + ".");
            } else {
                System.out.print(array[i] + ",");
            }
            
        }
        System.out.println();
        
        max(array);
        
    }
    
    public static void max(int[] x) {
        System.out.print("배열 정렬 후:");
        java.util.Arrays.sort(x);
        for (int i = 0; i <= x.length - 1; i = i + 1) {
            if (i == x.length - 1) {
                System.out.print(x[i] + ".");
            } else {
                System.out.print(x[i] + ",");
            }
                        
        }
        System.out.println();
        System.out.println("최소값 :" + x[0]);
        System.out.println("최대값 :" + x[x.length - 1]);
        
    }
    
}
