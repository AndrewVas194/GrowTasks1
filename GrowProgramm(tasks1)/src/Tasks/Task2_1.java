package Tasks;

public class Task2_1 {
    public static void triangle(int a,int b)
    {
        if(a+b> 0 && a+b< 180)
        {
            if (a+b==90 || a==90 || b==90)
                System.out.print("Прямоугольный треугольник");
            else System.out.print("Треугольник существует");
        }
        else {
            System.out.print("Треугольник не может иметь углы" + a + " " + b);
        }
    }
}
