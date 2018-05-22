/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemanagement;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author PAZHOOR
 */
public class ShapeManagement {

    public static void printShape(IShape r) {
        System.out.println("Area is " + r.getArea());
        System.out.println("Perimeter is " + r.getPerimeter());
    }
    public static void printCircle(Circle c) {
        System.out.println("Area is " + c.getArea());
        System.out.println("Perimeter is: " + c.getPerimeter());
    }

    public static void menu() {
        System.out.println("Options are: ");
        System.out.println("1: Add a Rectangle");
        System.out.println("2: Add a Circle");
        System.out.println("3: Display information about a Shape");
        System.out.println("4: Move a shape");
        System.out.println("5. Scale a shape");
        System.out.println("0: Stop");
    }

    public static void main(String[] args) {
        ArrayList<Shape> myShapes = new ArrayList<>();
        //ArrayList<Circle> myCircle = new ArrayList<>();
        Scanner kb = new Scanner(System.in);

        int option = 1;
        while (option != 0) {
            menu();
            System.out.print("Enter your option ");
            option = kb.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter width ");
                    double w = kb.nextDouble();
                    System.out.print("Enter length ");
                    double l = kb.nextDouble();
                    myShapes.add(new Rectangle(w, l));
                    break;
                case 2:
                    System.out.println("Enter a radius");
                    //You need to implement the code that will add circles
                    double k = kb.nextDouble();
                    myShapes.add(new Circle(k));
                    //System.out.println("NOT IMPLEMENTED YET!");
                    break;
                case 3:
                    System.out.println("3: Display area and perimeter of a Shape by position");
                    System.out.print("Enter the position ");
                    printShape(myShapes.get(kb.nextInt()));
                    
                    
                    break;
                
                case 4: 
                    System.out.println("4: Move a shape");
                    System.out.print("Enter the position ");
                    Moveable M = myShapes.get(kb.nextInt());
                    System.out.print("Enter new x coordinate ");
                    double xCoord = kb.nextDouble();
                    System.out.print("Enter new y coordinate ");
                    double yCoord = kb.nextDouble();
                    M.move(xCoord, yCoord);
                    
                    break;
                case 5:
                    System.out.println("5. Scale a shape");
                    System.out.print("Enter the position ");
                    Moveable H = myShapes.get(kb.nextInt());
                    System.out.print("Enter the factor: ");
                    double factor = kb.nextInt();
                    H.scale(factor);
        
            
        
     
     
                case 0:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Wrong option");
            }
        }
    }
}
