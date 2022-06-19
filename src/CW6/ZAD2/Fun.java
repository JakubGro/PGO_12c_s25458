package CW6.ZAD2;

public interface Fun {
    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        if (a >= b){ throw new RuntimeException("Invalid values"); }

        double smallest = func.f(a);
        for (double i = a; i <= b; i+=alpha) {
            if (smallest > func.f(i)){
                smallest = func.f(i);
            }
        }
        return smallest;
    }
}
