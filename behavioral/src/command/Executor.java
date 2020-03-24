package command;

import command.memento.Memento;

import java.util.Optional;
import java.util.Stack;

//invoker
//caretaker
public class Executor {

    private Command command;
    private CommandHistory commandHistory;
    private Stack<Memento> mementoHistory = new Stack<>();

    public Executor(CommandHistory commandHistory) {
        this.commandHistory = commandHistory;
    }

    public void executeCommand() {
        if(command.isAddableToHistory()){
            command.doBackup();
            saveMementoToHistory(command.getTextFile().save());
            commandHistory.add(command);
        }
        command.execute();
    }

    public boolean undo(){
        Optional<Command> command = commandHistory.getLastExecuted();
        if(command.isPresent()){
            command.get().undo();
            return true;
        }
        return false;
    }

    public void restore(Memento memento){
        command.getTextFile().restore(memento);
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void saveMementoToHistory(Memento memento){
        mementoHistory.push(memento);
    }

    public Stack<Memento> getMementoHistory() {
        return mementoHistory;
    }

}
