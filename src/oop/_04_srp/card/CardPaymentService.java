package oop._04_srp.card;

public interface CardPaymentService {

    // 국내 결제
    void pay();
    // 추가된 해외 결제
    void payOverseas();

}
