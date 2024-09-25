package paymentAdapters;

import differentPaymentClasses.paypal;
import targetInterface.PaymentProcessor;

public class paypalAdapter implements PaymentProcessor {
    paypal paypal;
    public paypalAdapter(paypal pp)
    {
        paypal=pp;
    }
    @Override
    public void pay(int amount) {
        paypal.paypalPay(amount);
    }
}
