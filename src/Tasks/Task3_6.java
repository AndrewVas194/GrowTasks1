package Tasks;

public class Task3_6 {
    public static void toASCII(String s) {
        char[] num=  s.toCharArray();
        for(char elem: num)
        {
            System.out.println((int) elem);
        }
    }
}
