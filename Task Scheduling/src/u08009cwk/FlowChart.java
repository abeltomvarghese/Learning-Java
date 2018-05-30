/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u08009cwk;
import java.util.ArrayList;

/**Class whose objects represent flow charts
 * @author p0073862
 */
public class FlowChart {
     public ArrayList<Node> allNodes = new ArrayList<>();
     private Node startNode;
     private Node currentNode;
     
    

    /**
     * Set the start node for the flow chart
     *
     * @param startNode the start node
     */
    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    /**
     * Get the current node in the flow chart.
     *
     * @return the current node
     */
    public Node getCurrentNode() {
        return currentNode;
    }

    /**
     * Start the flow chart. When this method is called, the start node will
     * become the current node.
     */
    public void start() {
        currentNode = startNode;
    }

    /**
     * Advance the current node. If the current node is an ActionNode when the
     * method is called, then it will be that node's 'next node' when the method
     * returns, and choice parameter is ignored. If the current node is a
     * DecisionNode when the method is called, then on return from the method
     * then the current node becomes either the next node on the "Yes" branch of
     * the decision (if choice is true) or on the "No" branch (if choice is
     * false).
     *
     * @param choice - If the current node is a DecisionNode then this parameter
     * specifies whether the "Yes" branch or the "No" branch is to be followed.
     * It is ignored if the current node is an ActionNode.
     */
    public void advance(boolean choice) {
        
            currentNode = currentNode.getNext(choice);
        
    }

    /**
     * Add an ActionNode to the flow chart.
     *
     * @param title title of the node
     * @param displayX value indicating the horizontal position of the node when
     * displayed in a GUI. Should be in range 0 (extreme left of display area)
     * to 1 (extreme right).
     * @param displayY value indicating the vertical position of the node when
     * displayed in a GUI. Should be in range 0 (top of display area) to 1
     * (bottom).
     * @return reference to the ActionNode that was added
     */
    public ActionNode addAction(String title, double displayX, double displayY) {
        CActionNode newActionNode = new CActionNode(title,displayX,displayY);
        allNodes.add(newActionNode);
        
        return newActionNode;       
    }

    /**
     * Add a DecisionNode to the flow chart.
     *
     * @param title title of the node
     * @param displayX value indicating the horizontal position of the node when
     * displayed in a GUI. Should be in range 0 (extreme left of display area)
     * to 1 (extreme right).
     * @param displayY value indicating the vertical position of the node when
     * displayed in a GUI. Should be in range 0 (top of display area) to 1
     * (bottom).
     * @return reference to the DecisionNode that was added
     */
    public DecisionNode addDecision(String title, double displayX, double displayY) {
        CDecisionNode newDecisionNode = new CDecisionNode(title, displayX, displayY);
        //newDecisionNode = 
        allNodes.add(newDecisionNode);
        
        return newDecisionNode;
    }

    /**
     * Get the number of nodes in the flow chart
     *
     * @return number of nodes in the flow chart
     */
    public int getNbrNodes() {
        return allNodes.size();
    }

    /**
     * Get a reference to the ith node in the flow chart
     *
     * @param i index of node required
     * @return reference to ith node in the flow chart
     */
    public Node getNode(int i) {
        
        return allNodes.get(i);
    }
}
