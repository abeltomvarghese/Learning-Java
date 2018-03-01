/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circles;

/**
 *
 * @author PAZHOOR
 */
public class Circles {

    /**
     * @param args the command line arguments
     */
    //hi all
    
    public static void main(String[] args) {
        // TODO code application logic here
        /**Circle lol = new Circle(2,3);
        //lol.changeX(-5);
        int now = lol.getX();
        System.out.println(now);
        double area = lol.calculateArea();
        System.out.println(area); */
        Circle myCircle = new Circle(2,3);
        double area = myCircle.calculateArea();
        if (area > 100) {
            System.out.println("The area of the circle is greater than 100");
            System.out.println("Area of circle: " + area);
        
        }
    
        
    }
    
    
}
