package command;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public Command add(Command command){
       return history.push(command);
    }

    public Optional<Command> getLastExecuted(){
        if ( ! history.isEmpty()){
            return Optional.of(history.pop());
        }
        return Optional.empty();
    }
}
