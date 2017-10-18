package java11.st4;

import java.util.Scanner;

public class OperTest {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Fist num : ");
        int x = keyboard.nextInt();
        
        System.out.println("Second num : ");
        int y = keyboard.nextInt();
        
        Oper oper = new Oper(x, y);
        oper.num1 = x;
        oper.num2 = y;
        
        oper.printAdd();
        oper.printMinus();
        oper.printMul();
        oper.printDiv();
        
    }
    
}
