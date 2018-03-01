


import java.util.*;

public class ListManager {

    public ArrayList<String> highPriority, lowPriority;  // the two lists of tasks
    public TaskListGUI controller; // a reference to the main program, with the GUI

    /* Constructs a ListManager object. */
    public ListManager(TaskListGUI ref) {
        // (you should not change the code in this method)
        controller = ref;
        initialiseLists();
    }

    /* Initialises both lists, to initially be empty. */
    public void initialiseLists() {
        highPriority = new ArrayList<>();
        lowPriority = new ArrayList<>();
        


    }


    /* Adds the given task to the end of the low-priority list.
     */
    public void addTask(String task) {
        lowPriority.add(task);
        


    }

    /* Removes the given task to the end of the high-priority list.
     * The index integer gives the current position of the task in
     * the relevant list of tasks. (You can assume that index is a
     * valid position in the relevant list.)
     */
    public void removeLowPriorityTask(int index) {
        lowPriority.remove(index);


    }


    /* Removes the given task from the high-priority list.
     * The index integer gives the current position of the task in
     * the relevant list of tasks. (You can assume that index is a
     * valid position in the relevant list.)
     */
    public void removeHighPriorityTask(int index) {
        highPriority.remove(index);
        


    }

    /* Changes the priority of the given task.
     * The given boolean important indicates the previous priority
     * of the task. e.g. if important is true, then the task was
     * a high-priority task.
     * The index integer gives the current position of the task in
     * the relevant list of tasks. (You can assume that index is a
     * valid position in the relevant list.)
     */
    public void changePriority(boolean important, int index) {
        if (important) {
            lowPriority.add(0,highPriority.remove(index));
            
        } else {
            highPriority.add(lowPriority.remove(index));
            
        }
        


    }

    /* Produces a string that can be used to save the task lists. */
    public String toString() {
        String s = "High Priority Tasks";

        return s;  // dummy return value (before this method is implemented)
    }

    /* Pushes an important task one higher up.
     * The index gives the current position of the task in the
     * highPriority list. (You can assume that index is a
     * valid position in the highPriority list.)
     */
    public void promote(int index) {
        if (index > 0) {
            String task = highPriority.get(index - 1);
            highPriority.set(index - 1, highPriority.get(index));
            highPriority.set(index, task);
            //highPriority.add(index -1, highPriority.remove(index));
        }


    }
}

