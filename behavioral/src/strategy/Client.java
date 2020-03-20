package strategy;

public class Client {

    public static void main(String[] args) {
        DailyRation dailyRation = new DailyRation();
        dailyRation.setStrategy(new LoseWeightStrategy());
        dailyRation.makeBreakfast();
        dailyRation.setStrategy(new GainWeightStrategy());
        dailyRation.makeBreakfast();
    }
}
