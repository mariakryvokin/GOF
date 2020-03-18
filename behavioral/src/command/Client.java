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
        System.out.println("1 undo:             "+executor.undo() + " " + textFile.getContext());
        System.out.println("2 undo:             "+executor.undo() + " " + textFile.getContext());
        System.out.println("3 undo:             "+executor.undo() + " " + textFile.getContext());

        Command addAnotherText = new AddTextCommand(textFile, " another text", true);
        executor.setCommand(addAnotherText);
        executor.executeCommand();
        System.out.println(textFile.getContext());
        executor.restore();
        System.out.println(textFile.getContext());

    }

}
