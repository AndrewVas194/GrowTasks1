package Tasks;

public class Task2_3 {
    public static void straight(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        if ((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)==0)
        {
            System.out.print("точки лежат на одной прямой");
        }
        else{System.out.print("точки НЕ лежат на одной прямой");}
    }
}
