/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAZHOOR
 */
import java.util.ArrayList;

public class Student {
    private int number;
    private String name;
    private String course;
    private ArrayList<Module> studying;
    private int numStudying;
    
    public Student(String sName, int number) {
        name = sName;
        this.number = number;
        //studying = new Module[5];
        studying = new ArrayList<>();
        
        numStudying = 0;
    
    }
    
    public void changeCourse(String nCourse) {
    
        course = nCourse;
        
    }
    
    public String getName() {
        return name;
    
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void addModule(Module m) {
        studying[numStudying] = m;
        numStudying++;
    
    }
    public void deleteModule(int pos) {
        int i = pos;
        while (i<numStudying-1) {
            studying[i] = studying[i+1];
            i++;
        }
        numStudying--;
    
    }
    public void displayModule(){
        for (int x = 0; x < 1;x++) {
            System.out.println("student name: " + name + " module: " + studying.get(x));
            
        
        }
    
    }
}


