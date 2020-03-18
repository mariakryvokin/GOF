package command;

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

    public String undo(){
        return commandHistory.getLastExecuted().undo();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

}
