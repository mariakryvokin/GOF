package command;

public class CutSelectedTextCommand extends Command {

    private String selectedText;

    public CutSelectedTextCommand(TextFile textFile, boolean isAddableToHistory, String selectedText) {
        super(textFile, isAddableToHistory);
       this.selectedText = selectedText;
    }

    @Override
    void execute() {
        textFile.cutSelectedText(selectedText);
    }
}
