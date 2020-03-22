package composite;

import composite.behavioral.visitor.Visitor;

// Component
public interface Employee {

    String goToWork();
    String toHire();

    void accept(Visitor hrVisitor);
}
