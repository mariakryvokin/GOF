import java.util.List;
import java.util.stream.Collectors;


//in real-world cloneable object should be costly. Fo instance created after call to db
public class Employee implements Cloneable {

    private int age;
    private String name;
    private List<String> certificats;

    public Employee(int age, String name, List<String> certificats) {
        this.age = age;
        this.name = name;
        this.certificats = certificats;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCertificats() {
        return certificats;
    }

    public void setCertificats(List<String> certificats) {
        this.certificats = certificats;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        List<String> certificateCopy = this.getCertificats().stream().collect(Collectors.toList());
        return new Employee(this.getAge(),this.getName(), certificateCopy);
    }
}
