package composite;

import composite.behavioral.visitor.Visitor;

// Component
public interface Employee {

    String goToWork();
    String toHire();

    void accept(Visitor hrVisitor);
    boolean addComponent(Employee employee);
    boolean removeComponent(Employee employee);
}
