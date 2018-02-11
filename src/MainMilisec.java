import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMilisec {

    private static float n;
    private static final int DAY_MILISEC = 86400000;
    private static final int HOUR_MILISEC = 3600000;
    private static final int MINUTE_MILISEC = 60000;
    private static final int SECOND_MILISEC = 1000;
    /*
     * 1 cутки = 1000*60*60*24 = 86400000 милисекунд
     * 1 час = 1000*60*60 = 3600000 милисекунд
     * 1 минута = 1000*60 = 60000 милисекунд
     * 1 секунда = 1000 милисекунд
     * */

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the number of milliseconds:");
            n = Integer.valueOf(br.readLine());
            System.out.println("n= " + n);
        } catch (IOException e) {
            e.printStackTrace();
        }

         if ((int) (n / DAY_MILISEC) > 0) {
            int day = (int) (n / DAY_MILISEC);
            System.out.println(day + " дней ");
            n = n - day * DAY_MILISEC;
        }

        if ((int) (n / HOUR_MILISEC) > 0) {
            int hour = (int) (n / HOUR_MILISEC);
            System.out.println(hour + " часов");
            n = n - hour * HOUR_MILISEC;
        }

        if ((int) (n / MINUTE_MILISEC) > 0) {
            int minute = (int) (n / MINUTE_MILISEC);
            System.out.println(minute + " минут");
            n = n - minute * MINUTE_MILISEC;
        }

        if ((int) (n / SECOND_MILISEC) > 0) {
            int second = (int) (n / SECOND_MILISEC);
            System.out.println(second + " секунд");
            n = n - second * SECOND_MILISEC;
        }
    }
}
