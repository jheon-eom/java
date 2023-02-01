package java_._01_enum;

public enum FunctionalEnum {

    PLUS((x, y) -> x + y),
    MINUS((x, y) -> x - y);

    private BinaryCalculator fn;

    public BinaryCalculator getFn() {
        return fn;
    }

    FunctionalEnum(BinaryCalculator fn) {
        this.fn = fn;
    }

    public Double apply(Double x, Double y) {
        return fn.apply(x, y);
    }

}

interface BinaryCalculator {

    Double apply(Double x, Double y);

}
