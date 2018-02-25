/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingquiz;

/**
 *
 * @author PAZHOOR
 */
public class OrderingQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Order order;
        int orderNumber = 1234;
        double orderAmt = 580.00;
        double orderDisc = .1;
        order = new Order(orderNumber, orderAmt, orderDisc);
        double finalAmount = order.finalOrderTotal();
        System.out.println("Final order amount = " +    finalAmount);
    }
    
}
