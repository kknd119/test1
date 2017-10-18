package javja11.st2;

public class CarTest {
    
    public static void main(String[] args){
        
       Car myCar = new Car();
       myCar.speedup(100); //myCar의 speed는 100과 같다.
       myCar.speedPrint();
       
       System.out.println(myCar.toString());
       
       Car yourCar = new Car();
       yourCar.setColor("bule");
       yourCar.setSpeed(60);
       yourCar.setGear(3);
       System.out.println(yourCar.toString());
       
       
    }
    
}
