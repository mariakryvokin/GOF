package interpreter;

import java.util.List;

public class From implements Expression{

    private String tableName;

    public From(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setTableName(tableName);
        return context.search();
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
