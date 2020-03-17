package command;

public class UndoAddTextCommand implements Command {

    private TextFile textFile;

    public UndoAddTextCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public boolean execute() {
        textFile.undo();
        return true;
    }
}
