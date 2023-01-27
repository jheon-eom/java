package oop._04_srp.card;

public class WooriCardPaymentService implements CardPaymentService {

    @Override
    public void pay() {
        // 우리카드 국내 결제 로직
    }

    /**
     * 만약 우리카드는 해외 결제를 지원하지 않는다면?
     * payOverseas 메서드를 구현할 필요가 없지만 규칙에 의해 강제로 구현해야 함
     */
    @Override
    public void payOverseas() {
        // 해외 결제 로직
    }

}
