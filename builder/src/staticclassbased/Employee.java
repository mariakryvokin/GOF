package staticclassbased;

// class should has a lot of fields
public class Employee {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class Builder{
        private Employee employee;

        public Builder() {
            this.employee = new Employee();
        }

        public Builder setName(String name){
            employee.setName(name);
            return this;
        }

        public Builder setAge(int age){
            employee.setAge(age);
            return this;
        }

        public Employee build(){
            return employee;
        }
    }
}
