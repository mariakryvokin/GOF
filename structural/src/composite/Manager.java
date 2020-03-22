package composite;

import composite.behavioral.visitor.Visitor;

//Leaf
public class Manager implements Employee{
    @Override
    public String goToWork() {
        return "manager go to work";
    }

    @Override
    public String toHire() {
        return "manager is hired";
    }

    @Override
    public void accept(Visitor hrVisitor) {

    }
}
