package Tasks;

public class Task3_8 {
    public static void equals(int a,int b) {
        int[] arr = new int[10];
        while(a != 0){
            arr[a % 10]++;
            a /=10;
        }
        while(b != 0){
            if(arr[b % 10] != 0)
                System.out.println(b % 10);
            b /=10;
        }
    }
}
