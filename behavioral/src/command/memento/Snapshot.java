package command.memento;

import command.TextFile;

public class Snapshot {

    private TextFile textFile;

    public Snapshot(TextFile textFile) {
        this.textFile = new TextFile(textFile.getContext());
    }

    public TextFile restore(){
        return textFile;
    }



}
