/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.management;

/**
 *
 * @author PAZHOOR
 */
public class CourseManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Abel",2709);
        Module OOP = new Module("Intro to OOP", 8009);
        System.out.println(OOP.getName());
        System.out.println(OOP.getNumber());
        s1.addModule(OOP);
        s1.displayModule();
        
        
        
        
    }
    
}
