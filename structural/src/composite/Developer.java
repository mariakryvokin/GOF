package composite;

import composite.behavioral.visitor.Visitor;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
import java.util.List;

//Leaf
public class Developer implements Employee{

    private List<String> knownTechnology = new ArrayList<>();

    @Override
    public String goToWork() {
        return "Developer go to work";
    }

    @Override
    public String toHire() {
        return "Developer is hired";
    }

    @Override
    public void accept(Visitor hrVisitor) {
        hrVisitor.suggestWork(this);
    }

    @Override
    public boolean addComponent(Employee employee) {
        throw new RuntimeException("unsupported operation");
    }

    @Override
    public boolean removeComponent(Employee employee) {
        throw new RuntimeException("unsupported operation");
    }

    public List<String> getKnownTechnology() {
        return knownTechnology;
    }

    public void setKnownTechnology(List<String> knownTechnology) {
        this.knownTechnology = knownTechnology;
    }
}
