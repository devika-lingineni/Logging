public class SimpleInterest {
    double principle;
    double rate;
    double time;

    SimpleInterest(double p, double r, double t) {
        this.principle = p;
        this.rate = r;
        this.time = t;
    }

    double interest_cal() {
        return this.principle * this.rate * this.time / 100.0D;
    }
}
