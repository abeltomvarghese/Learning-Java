/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u08009cwk;
public interface ActionNode extends Node {
    public void setNext(Node nextNode);
    public Node getNext(boolean choice);
}
