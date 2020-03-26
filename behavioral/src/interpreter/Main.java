package interpreter;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.addValueInColumn("table","column", "value");
        Expression select = new Select(new From("table"),"column");
        select.interpret(context).forEach(s -> System.out.println(s));
        Expression selectSecond = new Select(new From("table"),"woops");
        System.out.println(selectSecond.interpret(context).size());

    }
}
