package interpreter;

import java.util.*;

public class Context {

    private String tableName;
    private String columnName;
    private Map<String, Map<String, List<String>>> tableNameAndColumnNameAndValueList = new HashMap<>();

    public void addValueInColumn(String tableName, String columnName, String value) {
        if (!tableNameAndColumnNameAndValueList.containsKey(tableName)) {
            addNewTableWithColumnAndValue(tableName, columnName, value);
        } else {
            tableNameAndColumnNameAndValueList.get(tableName).get(columnName).add(value);
        }
    }

    private void addNewTableWithColumnAndValue(String tableName, String columnName, String value) {
        List<String> values = new ArrayList<>();
        values.add(value);
        Map<String, List<String>> columnValues = new HashMap<>();
        columnValues.put(columnName, values);
        tableNameAndColumnNameAndValueList.put(tableName, columnValues);
    }

    public List<String> search() {
        Map<String, List<String>> columnValue = tableNameAndColumnNameAndValueList.get(tableName);
        if (columnValue != null) {
            return (columnValue.get(columnName)) != null ? columnValue.get(columnName) : Collections.emptyList();
        }
        return Collections.emptyList();
    }


    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
