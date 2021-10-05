package Tasks;

public class Task2_5 {
    public static double function (int x)
    {
        double F;
        if(x<=3)
        {
            F = Math.pow(x,2)-3*x+9;
           return F;
        }
        else
        {
            F= 1/(Math.pow(x,3)+6);
        }
        return F;
    }
}
