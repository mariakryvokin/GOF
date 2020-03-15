package composite;

//Client
public class Main {

    public static void main(String[] args) {

        Developer developer = new Developer();
        Manager manager = new Manager();

        QaLead qaLead = new QaLead();

        CompositeQaArchitector compositeQA = new CompositeQaArchitector();
        compositeQA.addComponent(qaLead);

        CompositeDirector director = new CompositeDirector();
        director.addComponent(developer);
        director.addComponent(manager);
        director.addComponent(compositeQA);

        System.out.println(director.goToWork());

    }
}
