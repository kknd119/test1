package java14.st3car;

public class SportsCar extends Car {
    
   
   
    private boolean turbo ;
    private String color1;
    

    public boolean isTurbo() {
        return turbo;
    }
    
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }


   
   

    @Override
    public String toString() {
        return "SportsCar [turbo=" + turbo + ", toString()=" + super.toString()
                + "]";
    }

    public SportsCar() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SportsCar(int speed, int gear, String color) {
        super(speed, gear, color);
        // TODO Auto-generated constructor stub
    }

    public SportsCar(boolean turbo) {
        super();
        this.turbo = turbo;
    }

    public SportsCar(int speed, int gear, String color, boolean turbo) {
        super(speed, gear, color);
        this.turbo = turbo;
    }
    
    public SportsCar(String color, boolean turbo) {
           
        super(color);
        this.turbo = turbo;
    }
    
    
///부모의 어떤 생성자를 이용할지 선택 가능 하다.
    
    
    
   
    
    
}
