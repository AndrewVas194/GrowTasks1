package Tasks;

public class Task1_3 {
    ///////////////////////////////////////////////////////Вычислить по формуле Sin(x)+Cos(y)
    ///////////////////////////////////////////////////////                     ____________  * tg(xy)
    ///////////////////////////////////////////////////////                     Cos(x)-Sin(y)
    public static double Sum(double x,double y) {
        double z;
        double check;
        check = Math.cos(x)-Math.sin(y);
        if
        (check != 0 ){
            z = ((Math.sin(x) + Math.cos(y)) / check) * Math.tan(x * y);
            return z;
        }
        else
            {
                System.out.print("Деление на 0");
                return 0;
            }
    }
}
