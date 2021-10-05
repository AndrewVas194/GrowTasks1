package Tasks;

public class Task2_4 {
    public static void box(int a,int b, int x , int y , int z){
        int length1 = 0,width1 = 0;
        int length2 = 0,width2 = 0,height2 = 0;
        if (a!=0 && b!=0 && x!=0 && y!=0 && z!=0) {
            if (a > b) {                      //определим большую сторону( например длина больше ширины) отверстия
                length1 = a;
                width1 = b;
            } else {
                length1 = b;
                width1 = a;
            }
////////////////////////////////////////////////////////////////
            if (x > y && x > z)                 //определим большую сторону( например длина больше ширины) кирпича
            //вторая сторона ширина( ширина больше высоты) кирпича
            {
                length2 = x;
                if (y > z) {
                    width2 = y;
                    height2 = z;
                } else {
                    width2 = z;
                    height2 = y;
                }
            } else if (y > x && y > z) {
                length2 = y;
                if (x > z) {
                    width2 = x;
                    height2 = z;
                } else {
                    width2 = z;
                    height2 = x;
                }
            } else if (z > x && z > y) {
                length2 = z;
                if (x > y) {
                    width2 = x;
                    height2 = y;
                } else {
                    width2 = y;
                    height2 = x;
                }
            }
///////////////////////////////////////////////////////////
            if (length1 > length2 && width1 > height2) {
                System.out.println("Кирпич боком проходит");
            } else {
                System.out.println("Кирпич боком не пройдет");
            }


            if (length1 > width2 && width1 > height2) {
                System.out.println("Кирпич лицевой частью проходит");
            } else {
                System.out.println("Кирпич лицевой частью не пройдет");
            }


            if (length1 > length2 && width1 > width2) {
                System.out.println("Кирпич вид сверху проходит");
            } else {
                System.out.println("Кирпич вид сверху не пройдет");
            }

        }
    }
}
