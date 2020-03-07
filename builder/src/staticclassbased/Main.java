package staticclassbased;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee.Builder().setAge(22).setName("Ludovik").build();
        System.out.println(employee.getAge());

    }
}
