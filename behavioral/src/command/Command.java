package command;

//command
public abstract class Command {

    protected TextFile textFile;
    protected boolean isAddableToHistory;
    protected String backup;

    public Command(TextFile textFile, boolean isAddableToHistory) {
        this.textFile = textFile;
        this.isAddableToHistory = isAddableToHistory;
    }

    abstract boolean execute();

    protected String undo() {
        textFile.setContext(backup);
        return backup;
    }

    protected void doBackup(){
        backup = textFile.getContext();
    }

    public boolean isAddableToHistory() {
        return isAddableToHistory;
    }
}
