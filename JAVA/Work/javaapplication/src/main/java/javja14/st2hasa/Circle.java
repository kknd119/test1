package javja14.st2hasa;

public class Circle {
    
    private Point center ;
    private int radius = 0;
    
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public Circle( Point center,int radius) {
        super();
        this.radius = radius;
        this.center = center;
    }
    public Circle() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + "]";
    }
    
    
}
