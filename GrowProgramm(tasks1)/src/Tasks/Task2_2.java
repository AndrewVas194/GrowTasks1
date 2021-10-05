package Tasks;

public class Task2_2 {
    public static int max(int a, int b,int c, int d)
    {
        int max1,max2;

        if(a >= b)
        {
            max1=a;
        }
        else{max1=b;}

        if(c >= d)
        {
            max2=c;
        }
        else{max2=d;}

        if(max1>max2)
            return max1;
        else return max2;
    }
}
