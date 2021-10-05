package Tasks;

public class Task1_2 {
    public static double Sum(double a,double b,double c) {
        double z;
        if (a != 0) {
            z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
            return z;
        } else {
           System.out.println("Происходит деление на 0");
            return 0;
        }
    }

}
