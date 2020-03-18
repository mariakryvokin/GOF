package command;

public class Client {

    public static void main(String[] args) {
        //receiver
        TextFile textFile = new TextFile("context");
        //commands
        Command addText = new AddTextCommand(textFile, " text to add",true);
        Command cutText = new CutSelectedTextCommand(textFile,true,"add");
        //invokers
        Executor executor = new Executor(new CommandHistory());

        System.out.println(textFile.getContext());
        executor.setCommand(addText);
        executor.executeCommand();
        System.out.println(textFile.getContext());
        executor.setCommand(cutText);
        executor.executeCommand();
        System.out.println(textFile.getContext());
        System.out.println(executor.undo());
        System.out.println(executor.undo());

    }

}
