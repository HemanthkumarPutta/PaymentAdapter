package paymentAdapters;

import differentPaymentClasses.phonepe;
import targetInterface.PaymentProcessor;

public class phonepeAdapter implements PaymentProcessor {
    phonepe phonepe;
    public phonepeAdapter(phonepe pp)
    {
        phonepe=pp;
    }
    @Override
    public void pay(int amount) {
        phonepe.paywithphonepe(amount);
    }
}
