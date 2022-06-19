package CW6.ZAD2;

public class SquareFunction extends Function{
    private double a;
    private double b;
    private double c;

    public SquareFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double f(double x) {
        return (this.a * (x * x)) + (this.b * x) + c;
    }

    @Override
    public void increaseCoefficientsBy(double delta) {
        this.a += delta;
        this.b += delta;
        this.c += delta;
    }

    @Override
    public void decreaseCoefficientsBy(double delta) {
        this.a -= delta;
        this.b -= delta;
        this.c -= delta;
    }
}
