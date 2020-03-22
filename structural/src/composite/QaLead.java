package composite;

import composite.behavioral.visitor.Visitor;

//Leaf
public class QaLead implements Employee{

    private int yearsOfExperience;

    public QaLead(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String goToWork() {
        return "qa lead move";
    }

    @Override
    public String toHire() {
        return "qa lead hire";
    }

    @Override
    public void accept(Visitor hrVisitor) {
        hrVisitor.promote(this);
    }

    @Override
    public boolean addComponent(Employee employee) {
        return false;
    }

    @Override
    public boolean removeComponent(Employee employee) {
        return false;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
