package composite;

import composite.behavioral.visitor.Hr;
import composite.behavioral.visitor.Visitor;

import java.util.Collections;

//Client
public class Main {

    public static void main(String[] args) {

        Developer developer = new Developer();
        Manager manager = new Manager();

        QaLead qaLead = new QaLead(2);

        CompositeQaArchitector compositeQA = new CompositeQaArchitector();
        compositeQA.addComponent(qaLead);

        CompositeDirector director = new CompositeDirector();
        director.addComponent(developer);
        director.addComponent(manager);
        director.addComponent(compositeQA);

        System.out.println(director.goToWork());


        // visitor check

        Employee firstDev = new Developer();
        ((Developer) firstDev).setKnownTechnology(Collections.singletonList("Genius"));
        Employee firstQaLead = new QaLead(3);
        Visitor visitor = new Hr();
        firstDev.accept(visitor);
        firstQaLead.accept(visitor);

    }
}
