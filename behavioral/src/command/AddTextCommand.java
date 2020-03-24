package command;

public class AddTextCommand extends Command {

    private String textToAdd;

    public AddTextCommand(TextFile textFile, String textToAdd, boolean isAddableToHistory) {
        super(textFile, isAddableToHistory);
        this.textToAdd = textToAdd;
    }

    @Override
    public void execute() {
        textFile.addText(textToAdd);
    }

}
