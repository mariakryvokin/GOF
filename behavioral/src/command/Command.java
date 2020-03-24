package command;

//command
public abstract class Command {

    protected TextFile textFile;
    protected boolean isAddableToHistory;
    protected String backup;

    public Command( TextFile textFile, boolean isAddableToHistory) {
        this.textFile = textFile;
        this.isAddableToHistory = isAddableToHistory;
    }

    abstract void execute();

    public TextFile undo() {
        textFile.setContext(backup);
        return textFile;
    }

    public void doBackup(){
        backup = textFile.getContext();
    }

    public boolean isAddableToHistory() {
        return isAddableToHistory;
    }

    public TextFile getTextFile() {
        return textFile;
    }

}
