package java12.st2Car;

public class CarTest {
    
    public static void main(String[] args){
        
       Car myCar = new Car();
       myCar.speedup(100); //myCar의 speed는 100과 같다.
       myCar.speedPrint();
       
       System.out.println(myCar.toString());
       System.out.println("numberOfCar="+myCar.getNumberOfCars());
       
       
       Car yourCar = new Car();
       yourCar.setColor("bule");
       yourCar.setSpeed(60);
       yourCar.setGear(3);
       System.out.println(yourCar.toString());
       System.out.println("numberOfCar="+myCar.getNumberOfCars());
       
       Car otherCar =new Car("bule",60,3);
       System.out.println(otherCar.toString());
       System.out.println("numberOfCar="+myCar.getNumberOfCars());
       
       System.out.println("--------------------------------");
       System.out.println(myCar.toString()+"numberOfCar="+myCar.getNumberOfCars());
       System.out.println(yourCar.toString()+"numberOfCar="+yourCar.getNumberOfCars());
       System.out.println(otherCar.toString()+"numberOfCar="+otherCar.getNumberOfCars());
       
       //인스턴스값 인 numberof3는 공유되므로 ---이하는 같은값이됨.
       
       System.out.println("--------------------------------");
       System.out.println(Car.getNumberOfCars());
       System.out.println(Car.numberOfCars);
       
    }
    
}
