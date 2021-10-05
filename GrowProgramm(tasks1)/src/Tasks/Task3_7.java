package Tasks;

public class Task3_7 {
    public static void dividers(int a,int b)
    {
        for(int i=2 ;i < a && i < b;i++)
        {

                if (a % i == 0 && b % i == 0) {
                    if (i != a - 1 && i!=b - 1) ;
                    System.out.println(i);
                }

        }
    }
}
