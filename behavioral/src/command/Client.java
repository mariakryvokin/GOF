package command;

public class Client {

    public static void main(String[] args) {
        Executor executor = new Executor();
        TextFile textFile = new TextFile("context");
        System.out.println(textFile.getContext());
        executor.setCommand(new AddTextCommand(textFile," text to add"));
        executor.executeCommand();
        System.out.println(textFile.getContext());
        executor.setCommand(new UndoAddTextCommand(textFile));
        executor.executeCommand();
        System.out.println(textFile.getContext());

    }
}
