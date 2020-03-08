import java.util.Collections;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee prototype = new Employee(20,"Ludovik", Collections.singletonList("First Certificete"));
        Employee copy = (Employee) prototype.clone();
        System.out.println(copy.getAge());
        System.out.println(prototype.getCertificats() != copy.getCertificats());
        System.out.println(prototype.getCertificats().equals(copy.getCertificats()));
    }
}
