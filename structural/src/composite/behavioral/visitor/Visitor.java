package composite.behavioral.visitor;

import composite.Developer;
import composite.QaLead;

public interface Visitor {

    void promote(QaLead qaLead);

    void suggestWork(Developer developer);

}
