package Tasks;

public class Task3_4 {
    public static int sum(){
        int sum=1;
        for(int i=1;i<=200;i++)
        {
            sum*=Math.pow(i,2);

        }
        return sum;
    }
}
