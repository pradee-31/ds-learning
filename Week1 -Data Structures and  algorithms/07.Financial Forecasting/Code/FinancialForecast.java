public class FinancialForecast {

    public double predictFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        } else {
            return predictFutureValue(presentValue, growthRate, periods - 1) * (1 + growthRate);
        }
    }
}
