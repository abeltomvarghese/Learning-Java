/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u08009cwk;
public class CActionNode  extends CNode implements ActionNode {
    private Node nextNode; 
    public CActionNode(String title, double displayX, double displayY){
        super(title,displayX,displayY);
    }
    

    /**
     * Set the node that follows this one in the flow chart. That is to say
     * the node to which we advance when this node is completed
     * @param nextNode the next node
     */
    
    public void setNext(Node nextNode) {
        this.nextNode = nextNode;    
    }
    
    /**
     *
     * @param choice
     * @return
     */
    @Override
    public Node getNext(boolean choice) {
       return nextNode; 
    }
}

    
    
    
    


