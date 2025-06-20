public class StrategyPatternTest {
    public static void main(String[] args) {
       
        PaymentContext context = new PaymentContext(new CreditCardPayment("1234-5678-9876-5432"));
        context.executePayment(250.00);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(150.00);
    }
}
