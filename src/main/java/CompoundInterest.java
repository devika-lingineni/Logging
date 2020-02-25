class CompoundInterest extends SimpleInterest {
    CompoundInterest(double p1, double r1, double t1) {
        super(p1, r1, t1);
    }

    double interest_comcal() {
        double x = this.rate / 100.0D;
        return this.principle * Math.pow(1.0D + x, 10.0D);
    }
}
