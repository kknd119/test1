package java14.st7student;

public class GraduateStudentTest {
    
    public static void main(String[] args) {
       
        GraduateStudent g1 =new GraduateStudent();
        System.out.println(g1.toString());
        
        GraduateStudent g2 =new GraduateStudent(18,"박지성","010");
        System.out.println(g2.toString());
        GraduateStudent g3 =new GraduateStudent(19,"호날두","011","레알");
        System.out.println(g3.toString());
        GraduateStudent g4 =new GraduateStudent();
        g4.setNumber(20);
        g4.name="즐라탄";
        g4.phone="017";
        g4.lab="맨유";
        System.out.println(g4.toString());
        GraduateStudent g5 =new GraduateStudent();
        g5.setNumber(20);
        g5.setName("즐라탄");
        g5.setPhone("017");
        g5.setLab("맨유");
        System.out.println(g5.toString());
        
        
    }
    
}
