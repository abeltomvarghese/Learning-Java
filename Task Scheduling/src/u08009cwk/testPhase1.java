/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u08009cwk;
public class testPhase1 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        System.out.println("TEST 1: Creation of an ActionNode");
        CActionNode actionNode = new CActionNode("Test Action", 0.5, 0.6);
        CDecisionNode decisionNode = new CDecisionNode("New Test", 0.8, 0.8);
        CActionNode trueAction = new CActionNode("Test Action True",0.1,0.1);
        CActionNode falseAction = new CActionNode("Test Action False",0.2,0.2);
        actionNode.setNext(decisionNode);
        decisionNode.setNext(trueAction,true);
        decisionNode.setNext(falseAction,false);
        System.out.println("Title of action node");
        System.out.println("Expected: Test Action");
        System.out.println("Actual:" + actionNode.getTitle());
        System.out.println("Display co-ordinates of action node");
        System.out.println("Expected: 0.5,0.6");
        System.out.println("Actual: " + actionNode.getDisplayX() + "," 
                + actionNode.getDisplayY());
        System.out.println("");
        System.out.println("TEST 2: Node Connection Test");
        System.out.println("Next Node Connection");
        System.out.println("Expected: New Test");
        System.out.println("Actual: " + actionNode.getNext(false).getTitle());
        System.out.println("Expected: Test Action True");
        System.out.println("Actual: " + decisionNode.getNext(true).getTitle());
        System.out.println("Expected: Test Action False");
        System.out.println("Actual: " + decisionNode.getNext(false).getTitle());
    }
}
