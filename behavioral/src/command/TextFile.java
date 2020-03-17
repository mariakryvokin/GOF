package command;

//reciver
public class TextFile {

    private String context;
    private String backup;

    public TextFile(String context) {
        this.context = context;
    }

    public String backup() {
        backup = context;
        return backup;
    }

    public boolean addText(String textToAddAdd) {
        backup();
        context += textToAddAdd;
        return true;
    }

    public String undo() {
        context = backup;
        return backup;
    }


    public String getContext() {
        return context;
    }


}
