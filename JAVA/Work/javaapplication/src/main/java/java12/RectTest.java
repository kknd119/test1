package java12;

import java.util.Scanner;

public class RectTest {
    public static void main(String[] args) {
        
        int a, b;
        double x, y;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("가로를 입력하시오:");
        a = keyboard.nextInt();
        System.out.println("세로를 입력하시오:");
        b = keyboard.nextInt();
        
        Rect rect = new Rect(a, b);
        rect.Area();
        rect.PrintArea();
        rect.Perimeter();
        rect.PrintPerimeter();
        
        System.out.println(rect.toString());
        
    }
    
}
