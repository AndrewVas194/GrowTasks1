package Tasks;

import java.sql.Time;

public class Task1_5 {


    public static void data(int T) {
        int seconds = 1, minutes = 60, hours = 3600;
        int secondsStorage = 0, minutesStorage = 0, hoursStorage = 0;
        if (T != 0) {
            if (T >= hours) {
                do {
                    T -= hours;
                    hoursStorage++;
                }
                while (T >= hours);
            }
            if (T >= minutes) {
                do {
                    T -= minutes;
                    minutesStorage++;
                }
                while (T >= minutes);
            }
            if (T >= seconds) {
                do {
                    T -= seconds;
                    secondsStorage++;
                }
                while (T >= seconds);
            }
        }
        if(hoursStorage<10||minutesStorage<10)
        System.out.print("0"+hoursStorage + "часов " +minutesStorage + "минут " + secondsStorage + "секунд");
        else{System.out.print(hoursStorage + "часов " + minutesStorage + "минут " + secondsStorage + "секунд");}
    }
}
