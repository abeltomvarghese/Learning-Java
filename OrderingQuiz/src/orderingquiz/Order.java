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
public class Order {
    private int orderNum;
    private double orderAmount; 
    private double orderDiscount; 

    public Order(int orderNumber, double orderAmt, double orderDisc) { 
        orderNum = orderNumber;
        orderAmount = orderAmt;
        orderDiscount = orderDisc;
     } 

    public double finalOrderTotal()  { 
        return orderAmount - orderAmount * orderDiscount;
        } 
}
