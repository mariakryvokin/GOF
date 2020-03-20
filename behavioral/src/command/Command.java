package command;

import command.memento.Snapshot;

//command
public abstract class Command {

    protected TextFile textFile;
    protected boolean isAddableToHistory;
    protected String backup;
    protected Snapshot backupSnapshot;

    public Command(TextFile textFile, boolean isAddableToHistory) {
        this.textFile = textFile;
        this.isAddableToHistory = isAddableToHistory;
    }

    abstract boolean execute();

    protected TextFile undo() {
        textFile.setContext(backup);
        return textFile;
    }

    protected void doBackup(){
        backup = textFile.getContext();
    }

    protected void doSnapshotBackup(){
        backupSnapshot = textFile.createSnapshot();
    }

    protected TextFile restore(){
       if(backupSnapshot != null){
         textFile.setContext(backupSnapshot.restore().getContext());
       }
       return textFile;
    }

    public boolean isAddableToHistory() {
        return isAddableToHistory;
    }
}
