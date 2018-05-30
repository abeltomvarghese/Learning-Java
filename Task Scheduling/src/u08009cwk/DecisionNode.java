/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u08009cwk;
public interface DecisionNode extends Node {
    public void setNext(Node node, boolean choice);
    public Node getNext(boolean choice);
}
