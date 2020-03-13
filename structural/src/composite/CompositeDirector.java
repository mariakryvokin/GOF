package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDirector implements Employee, Composite {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public boolean addComponent(Employee employee) {
        return employees.add(employee);
    }

    @Override
    public boolean removeComponent(Employee employee) {
        return employees.remove(employee);
    }

    @Override
    public String goToWork() {
        employees.forEach(employee -> System.out.println(employee.goToWork()));
        return "Composite director is going to work";
    }

    @Override
    public String toHire() {
        employees.forEach(employee -> System.out.println(employee.toHire()));
        return "Composite director is hired";
    }


}
