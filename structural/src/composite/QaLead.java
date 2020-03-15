package composite;

//Leaf
public class QaLead implements Employee{
    @Override
    public String goToWork() {
        return "qa lead move";
    }

    @Override
    public String toHire() {
        return "qa lead hire";
    }
}
