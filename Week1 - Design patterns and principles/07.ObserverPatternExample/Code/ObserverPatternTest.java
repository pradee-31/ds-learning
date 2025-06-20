public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket abcStock = new StockMarket("ABC", 100.0);

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        abcStock.registerObserver(mobileApp);
        abcStock.registerObserver(webApp);

        abcStock.setPrice(105.0);

        abcStock.deregisterObserver(webApp);

        abcStock.setPrice(110.0);
    }
}
