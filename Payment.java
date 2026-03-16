public class Payment {
    public void processPayment(){
        System.out.println("Processing payment...");
    }

    public static void main(String[] args){
        Payment p1 = new CreditCard();
        Payment p2 = new DebitCard();
        Payment p3 = new PayPal();

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}

class CreditCard extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing Credit card payment...");
    }
}

class DebitCard extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing Debit card payment...");
    }
}

class PayPal extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing PayPal payment...");
    }
}
