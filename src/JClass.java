import Tasks.*;

import java.util.Scanner;


public class JClass {
    public static void main(String[] args){
        double a,b,c;
        int x,y,z,q,w,e;
        String s;
        double answer;
        int ans;
        Scanner sc = new Scanner(System.in);
        ans= sc.nextInt();
        switch (ans) {

            case 1:
                                                            ////Задание 1.найти значение функции z=((a-3)*b/2)+c
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();

                answer = Task1_1.Sum(a, b, c);                 /////////////ввести числа a,b,c через enter
                System.out.print(answer);
                break;

            case 2:
                                                            ////////////Задание 2.Вычислить значение выражения по формуле
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();

                answer= Task1_2.Sum(a,b,c);                    //////////////ввести числа a,b,c через enter
                System.out.print(answer);
                break;

            case 3:
                                                            ///////////Задание 3.Вычислить значение выражения по формуле
                a = sc.nextDouble();
                b = sc.nextDouble();

                answer= Task1_3.Sum(a,b);                      //////////////ввести числа x, y через enter
                System.out.print(answer);
                break;

            case 4:
                                                            //////////Задание 4.Дано действительное число R вида nnn.ddd
                a = sc.nextDouble();
                answer= Task1_4.Sum(a);
                System.out.print(answer);                      //////////////ввести дробное число
                break;

            case 5:
                                                            ///Задание 5. Дано натуральное число T, которое представляет
                                                            // длительность прошедшего времени в секундах
                int T=sc.nextInt();
               Task1_5.data(T);                             //////////////ввести числа a,b,c через enter
                break;

            case 6:
                                                            ///Задание 6. Составить программу которая печатает true
                                                            //если точка в области и false, если вышла за область
                a = sc.nextDouble();
                b = sc.nextDouble();

                Task1_6.coordinates(a,b);
                break;

            case 7:
//////////////////////////Task2_1///////////////////////////////////////////////
                x = sc.nextInt();
                y = sc.nextInt();
                Task2_1.triangle(x,y);
                break;

            case 8:
//////////////////////////Task2_2///////////////////////////////////////////////
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                q = sc.nextInt();


                answer= Task2_2.max(x,y,z,q);
                System.out.print(answer);
                break;

            case 9:
//////////////////////////Task2_3///////////////////////////////////////////////
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                q = sc.nextInt();
                w = sc.nextInt();
                e = sc.nextInt();

                Task2_3.straight(x,y,z,q,w,e);
                break;

            case 10:
//////////////////////////Task2_4///////////////////////////////////////////////
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                q = sc.nextInt();
                w = sc.nextInt();


                Task2_4.box(x,y,z,q,w);
                break;

            case 11:
//////////////////////////Task2_5///////////////////////////////////////////////
                x=sc.nextInt();

                answer=Task2_5.function(x);
                System.out.print(answer);
                break;

            case 12:
//////////////////////////Task3_1///////////////////////////////////////////////
                x=sc.nextInt();

                answer=Task3_1.sum(x);
                System.out.print(answer);
                break;

            case 13:
////////////////Task3_2////////////////////////////////////////////////////////
                x = sc.nextInt();
                y = sc.nextInt();
                a = sc.nextDouble();
                b = sc.nextDouble();


                Task3_2.steps(x,y,a,b);

                break;

            case 14:
////////////////Task3_3/////////////////////////////////////////////////////////
                answer=Task3_3.sum();
                System.out.print(answer);
                break;
            case 15:
//////////////////////////Task3_4///////////////////////////////////////////////
                answer=Task3_4.sum();
                System.out.print(answer);
                break;
            case 16:
//////////////////////////Task3_5///////////////////////////////////////////////

            case 17:
//////////////////////////Task3_6///////////////////////////////////////////////

                s = sc.next();
                Task3_6.toASCII(s);

                break;
            case 18:
//////////////////////////Task3_4///////////////////////////////////////////////
                x = sc.nextInt();
                y = sc.nextInt();
                Task3_7.dividers(x,y);
                break;

            case 19:
//////////////////////////Task3_8///////////////////////////////////////////////
                x = sc.nextInt();
                y = sc.nextInt();
                Task3_8.equals(x,y);
                break;

            default:System.out.print("Выберите задание");

        }
    }
}
