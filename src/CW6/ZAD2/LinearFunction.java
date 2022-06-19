package CW6.ZAD2;

public class LinearFunction extends Function{

    private double a;
    private double b;

    public LinearFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double f(double x) {
        return (this.a * x) + b;
    }

    @Override
    public void increaseCoefficientsBy(double delta) {
        this.a += delta;
        this.b += delta;
    }

    @Override
    public void decreaseCoefficientsBy(double delta) {
        this.a -= delta;
        this.b -= delta;
    }
}
