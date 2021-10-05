package Tasks;

public class Task1_6 {
    public static void coordinates(double x, double y){

        if ( x <= 4 && x >= -4 )
        {
            if( y <= 0 && y >= -3 )
            {
             System.out.print("true");
            }
            else if(x <= 2 && x >= -2)
                {
                if(y <= 4 && y >= 0)
                    {
                    System.out.print("true");
                    }
                }
            else{System.out.print("false");}
        }
            else{System.out.print("false");}

    }
}
