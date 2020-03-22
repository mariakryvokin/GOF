package composite.behavioral.visitor;

import composite.Developer;
import composite.QaLead;

public class Hr implements Visitor {
    @Override
    public void promote(QaLead qaLead) {
        if (qaLead.getYearsOfExperience() > 2 ){
            System.out.println("qa promotion");
        }
    }

    @Override
    public void suggestWork(Developer developer) {
        if(developer.getKnownTechnology().contains("Genius")){
            System.out.println("proposal for dev");
        }
    }
}
