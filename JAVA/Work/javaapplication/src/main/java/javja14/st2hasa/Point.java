package javja14.st2hasa;

public class Point {
       
   private int x  ;
   private int y  ;
public int getX() {
    return x;
}
public void setX(int x) {
    this.x = x;
}
public int getY() {
    return y;
}
public void setY(int y) {
    this.y = y;
}
public Point(int x, int y) {
    super();
    this.x = x;
    this.y = y;
}
public Point() {
    // TODO Auto-generated constructor stub
}
@Override
public String toString() {
    return "Point [x=" + x + ", y=" + y + "]";
}

    
    
    
}
