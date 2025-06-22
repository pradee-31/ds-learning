public class ForecastRunner {
    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();

        double presentValue = 1000.0;   
        double growthRate = 0.05;       
        int periods = 10;               

        double futureValue = forecast.predictFutureValue(presentValue, growthRate, periods);

        System.out.printf("Present Value: %.2f\n", presentValue);
        System.out.printf("Growth Rate per Period: %.2f%%\n", growthRate * 100);
        System.out.println("Number of Periods: " + periods);
        System.out.printf("Predicted Future Value: %.2f\n", futureValue);
    }
}
