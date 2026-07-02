package exam;

import java.util.Stack;

public class UndoRedoExam {
    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();

    public static void performAction(String action){
        undoStack.push(action);
        redoStack.clear();
        System.out.println("Perform: " + action);
    }

    public static void undo(){
        if(!undoStack.isEmpty()){
            String action = undoStack.pop();
            redoStack.push(action);
            System.out.println("Undo: " + action);
        } else System.out.println("Nothing to undo");
    }

    public static void redo(){
        if(!redoStack.isEmpty()){
            String action = redoStack.pop();
            undoStack.push(action);
            System.out.println("Redo: " + action);
        } else System.out.println("Nothing to redo");
    }

    public static void main(String[] args){
        performAction("Type A");
        performAction("Type B");
        performAction("Type C");
        performAction("Type D");

        undo();
        undo();

        redo();
    }
}
