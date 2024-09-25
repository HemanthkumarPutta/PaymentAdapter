package paymentAdapters;

import differentPaymentClasses.gpay;
import targetInterface.PaymentProcessor;

public class gpayAdapter implements PaymentProcessor {
    gpay gpay;
    public gpayAdapter(gpay gp)
    {
        gpay=gp;
    }
    @Override
    public void pay(int amount) {
        gpay.gpayment(amount);
    }
}
