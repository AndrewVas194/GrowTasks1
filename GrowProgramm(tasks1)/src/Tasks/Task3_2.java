package Tasks;

public class Task3_2 {
    public static void steps(int a,int b,double x, double dx)
    {
        double y=0;
         for (x=a;x<=b-dx;x+=dx ) {
             System.out.print("x= " + x + ",");
             if (x > 2) {
                 y=x;
                 System.out.println("y =" + y);
             } else if (x <= 2) {
                 y= -x;
                 System.out.println("y =" + y);
             }
         }
    }
}
