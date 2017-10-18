package javja14.st2hasa;

public class CircleTest {
    
    public static void main(String[] args) {
        
        
        Point p = new Point(25,78);//생성자로
        Circle c = new Circle(p,10);
        
        
       System.out.println(p.toString()); 
       System.out.println(c.toString()); 
       
       Point p1= new Point(); //get set 으로
       p1.setX(10);
       p1.setY(10);
       Circle c1 =new Circle();
       c1.setCenter(p1);
       c1.setRadius(100);
       
       System.out.println(p1.toString()); 
       System.out.println(c1.toString()); 
       
       
        
    }
    
}
