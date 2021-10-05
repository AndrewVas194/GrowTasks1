package Tasks;

public class Task1_4 {
    public static double Sum(double x) {
        if (x >= 100.000 && x < 1000) {
            double y = (x * 1000) % 1000 + (int) x / 1000.0;
            return y;
        }
        else return 0;
    }
}
