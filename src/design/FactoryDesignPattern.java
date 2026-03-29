package design;

import java.util.*;

enum PaymentType {
    CARD, UPI, NET_BANKING;
}

interface Payment {
    void pay();
}

class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment using card method");
    }
}

class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using upi method");
    }
}

class NetBankingPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using net banking method");
    }
}

class PaymentFactory {

    public static Payment getPayment(PaymentType type) {

        if(type == PaymentType.CARD) {
            return new CardPayment();
        }
        else if(type == PaymentType.UPI) {
            return new UpiPayment();
        }
        else if(type == PaymentType.NET_BANKING) {
            return new NetBankingPayment();
        }

        throw new RuntimeException("Invalid payment type");
    }

}


public class FactoryDesignPattern {

    public static void main(String[] args) {

        Payment payment1 = PaymentFactory.getPayment(PaymentType.CARD);
        Payment payment2 = PaymentFactory.getPayment(PaymentType.UPI);
        Payment payment3 = PaymentFactory.getPayment(PaymentType.NET_BANKING);

        payment1.pay();
        payment2.pay();
        payment3.pay();
    }

}
