package strategy;

public class DailyRation {

    private Strategy strategy;

    public void makeBreakfast(){
        strategy.makeBreakfast();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
