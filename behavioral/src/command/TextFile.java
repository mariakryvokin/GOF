package command;

import command.memento.Memento;

//reciver
// originator
public class TextFile {

    private String context;

    public TextFile(String context) {
        this.context = context;
    }

    public boolean addText(String textToAddAdd) {
        context += textToAddAdd;
        return true;
    }

    public boolean cutSelectedText(String selectedText){
        context = context.replaceAll(selectedText, "");
        return true;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    //memento part

    public Memento save(){
        return new Memento(this.getContext());
    }

    public void restore(Memento memento){
        this.setContext(memento.getContext());
    }

}
