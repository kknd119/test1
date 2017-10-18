package java12;

public class Rect {
    
    private int width;
    private int height;
    
    public int Area() {
        
        return width * height;
        
    }
    
    public double Perimeter() {
        
        return 2 * (width + height);
    }
    
    public void PrintArea() {
        
        System.out.println("사각형의 넓이는:" + this.Area());
        
    }
    
    public void PrintPerimeter() {
        
        System.out.println("사각형의 둘래는:" + this.Perimeter());
        
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeihgt() {
        return height;
    }
    
    public void setHeihgt(int heihgt) {
        this.height = heihgt;
    }
    
    public Rect(int width, int heihgt) {
        super();
        this.width = width;
        this.height = heihgt;
    }
    
    public Rect() {
        super();
       
    }
    
    @Override
    public String toString() {
        return "Rect [width=" + width + ", heihgt=" + height + "]";
    }
}
