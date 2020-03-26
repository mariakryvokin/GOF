package interpreter;

import java.util.List;

public class Select implements Expression {

    private String columnName;
    private From fromExpression;

    public Select(From expression, String columnName) {
        this.fromExpression = expression;
        this.columnName = columnName;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setColumnName(columnName);
        return fromExpression.interpret(context);
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
