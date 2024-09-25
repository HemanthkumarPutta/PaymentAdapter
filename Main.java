import differentPaymentClasses.*;
import paymentAdapters.*;

public class Main {
    public static void main(String[] args) {
        paypal paypal = new paypal();
        paypalAdapter paypalAdapter = new paypalAdapter(paypal);
        paypalAdapter.pay(100);

        gpay gpay = new gpay();
        gpayAdapter gpayAdapter = new gpayAdapter(gpay);
        gpayAdapter.pay(1000);

        phonepe phonepe = new phonepe();
        phonepeAdapter phonepeAdapter = new phonepeAdapter(phonepe);
        phonepeAdapter.pay(10000);

    }
}