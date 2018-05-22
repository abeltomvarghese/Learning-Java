/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingarraylisttwo;
import java.util.ArrayList;
/**
 *
 * @author PAZHOOR
 */
public class UsingArrayListTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("there");
        String j = myList.get(1);
        System.out.println(j);
        for (String s: myList) {
            System.out.println(s);
        }
    }
    
}
