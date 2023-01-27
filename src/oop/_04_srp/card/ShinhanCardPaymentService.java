package oop._04_srp.card;

public class ShinhanCardPaymentService implements CardPaymentService {

    @Override
    public void pay() {
        // 국내 결제 로직
    }

    @Override
    public void payOverseas() {
        // 해외 결제 로직
    }

}
