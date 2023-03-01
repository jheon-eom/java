package effective.ch03.item17;

public final class Complex {
    private final double re;
    private final double im;

    public static final Complex ZERO = new Complex(0, 0);

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(this.re + c.re, this.im + c.im);
    }

    public static void main(String[] args) {
        Complex zero = Complex.ZERO;
        System.out.println(zero.toString());
    }
}
