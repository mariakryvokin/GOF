package command;

public class AddTextCommand implements Command {

    private TextFile textFile;
    private String textToAdd;

    public AddTextCommand(TextFile textFile, String textToAdd) {
        this.textFile = textFile;
        this.textToAdd = textToAdd;
    }

    @Override
    public boolean execute() {
        return textFile.addText(textToAdd);
    }

}
