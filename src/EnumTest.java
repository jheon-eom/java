public enum EnumTest {
    SIGN_SATE("전자서명 상태", "SIGN_STATE", 1),
    B("TypeA", "SIGN_STATE", 1),
    C("TypeA", "SIGN_STATE", 3);

    EnumTest(String type, String status,  int order) {
        this.type = type;
        this.status = status;
        this.order = order;
    }

    private String type;
    private String status;
    private int order;

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public int getOrder() {
        return order;
    }


}
