package composite;

//Leaf
public class Developer implements Employee{
    @Override
    public String goToWork() {
        return "Developer go to work";
    }

    @Override
    public String toHire() {
        return "Developer is hired";
    }
}
