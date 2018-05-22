/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roommanagementsystem;
import java.util.Scanner;
import java.util.ArrayList;

public class RoomManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Room> allRooms = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        int iput = -1;
        String roomNumber;
        String Name;
        String projectOption;
        boolean Projector = false;
        int capacity;
        int numAttendees;
        String operatingSystem;
        do {
            iput = 0;
            System.out.println(" ");
            System.out.println("1. add an office");
            System.out.println("2. add a computer room");
            System.out.println("3. add a lecture theatre");
            System.out.println("4. display info about rooms");
            System.out.println("5. display all rooms with projectors");
            System.out.println("6. rooms suitable for attendees");
            System.out.println("0. stop");
            System.out.print("Please enter your option: ");
            iput = kb.nextInt();
            switch (iput) {
                case 0:
                    break;
                case 1:
                    System.out.print("Please enter the office room number: ");
                    roomNumber = kb.next();
                    System.out.print("Please Enter the name of the occupier: ");
                    kb.nextLine();
                    Name = kb.nextLine();
                    Office newOffice = new Office(roomNumber,Name);
                    allRooms.add(newOffice);
                    break;
                case 2:
                    System.out.print("Please enter the computer lab room number: ");
                    roomNumber = kb.next();
                    System.out.print("Does the lab have projectors ?: ");
                    projectOption = kb.next();
                    if (projectOption.equals("yes")) {
                        Projector = true;
                    } else {
                        Projector = false;
                    }
                    System.out.print("What is the capacity?: ");
                    capacity = kb.nextInt();
                    System.out.print("What is the operating system?: ");
                    kb.nextLine();
                    operatingSystem = kb.nextLine();
                    ComputerLab newLab = new ComputerLab(roomNumber, capacity, Projector, operatingSystem);
                    allRooms.add(newLab);
                    break;
                case 3:
                    System.out.print("Please enter the Lecture theatre room number: ");
                    roomNumber = kb.next();
                    System.out.print("What is the capacity?: ");
                    capacity = kb.nextInt();
                    LectureRoom newTheatre = new LectureRoom(roomNumber,capacity);
                    allRooms.add(newTheatre);
                    break;
                case 4:
                    for (Room eachRoom:allRooms ) {
                        
                        System.out.println(eachRoom.toString());
                    }
                    break;
                case 5:
                    for (Room eachR:allRooms) {
                        if (eachR.hasProjector()) {
                            System.out.println(eachR.toString());
                        }
                    }
                    break;
                case 6:
                    System.out.print("How many people will be attending?: ");
                    numAttendees = kb.nextInt();
                    for (Room eachPlace:allRooms) {
                        if (eachPlace.getCapacity() >= numAttendees) {
                            System.out.println(eachPlace.toString());
                        }
                            
                    }
                    break;
                default:
                    System.out.println("Invalid Option entered");
                    break;
                    
                        
                    
            }
            
        } while (iput != 0);
        
                
    }
    
}
