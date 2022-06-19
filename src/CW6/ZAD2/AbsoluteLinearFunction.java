package CW6.ZAD2;

public class AbsoluteLinearFunction extends LinearFunction{
    public AbsoluteLinearFunction(double a, double b) {
        super(a, b);
    }

    @Override
    public double f(double x) {
        return Math.abs(super.f(x));
    }
}
