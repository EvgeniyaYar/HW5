public class BmiService {

    public double calculate(double weightKg, double heightM) {
        double index = weightKg / (heightM * heightM);
        return index;
    }
}
