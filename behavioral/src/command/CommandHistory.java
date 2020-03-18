package command;

import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public Command add(Command command){
       return history.push(command);
    }

    public Command getLastExecuted(){
        return history.pop();
    }
}
