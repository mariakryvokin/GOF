package command;

import java.util.Optional;

//invoker
public class Executor {

    private Command command;
    private CommandHistory commandHistory;

    public Executor(CommandHistory commandHistory) {
        this.commandHistory = commandHistory;
    }

    public boolean executeCommand() {
        boolean result = command.execute();
        addCommandToHistory(result);
        return result;
    }

    private void addCommandToHistory(boolean result) {
        if (result && command.isAddableToHistory()) {
            commandHistory.add(command);
        }
    }

    public boolean undo(){
        Optional<Command> command = commandHistory.getLastExecuted();
        if(command.isPresent()){
            command.get().undo();
            return true;
        }
        return false;
    }

    public boolean restore(){
        Optional<Command> command = commandHistory.getLastExecuted();
        if(command.isPresent()){
            command.get().restore();
            return true;
        }
        return false;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

}
