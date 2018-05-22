/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unirooms;

/**
 *
 * @author PAZHOOR
 */
public class UniRooms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Room ComputerRoom = new Room("23",4,true);
        //int lol = ComputerRoom.getCapacity();
        //System.out.println(lol);
        Room cr;
        cr = new ComputerLab("25",5,false,"windows");
        int needy = cr.getCapacity();
        System.out.println(needy);
        //System.out.println(ComputerRoom.toString());
        System.out.println(cr.toString());
        Room lR;
        lR = new LectureRoom("78",90);
        System.out.println(lR.toString());
        Room cr1;
        cr1 = new ComputerLab("90",true,"MacOs");
        System.out.println(cr1.toString());
        Room Teacher;
        Teacher = new Office("321","Daniel Brown");
        
        Office o = (Office)Teacher;
        System.out.println(o.getName());
        System.out.println(Teacher.toString());
    }
    
}
