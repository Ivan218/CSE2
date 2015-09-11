//Free exploration

import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        
        long totalTimeMillis = System.currentTimeMillis(); //Obtains total number of milliseconds elapsed since 1970 January 1 UNIX Epoch
        long totalTimeSeconds = totalTimeMillis/1000;
        int timeSeconds = (int)(totalTimeSeconds % 60);
        long totalTimeMinutes = totalTimeSeconds/60;
        int timeMinutes = (int)(totalTimeMinutes % 60);
        long totalTimeHours = totalTimeMinutes/60;
        int timeHours = (int)(totalTimeHours % 24);
        
        System.out.println(timeHours + ":" + timeMinutes + ":" + timeSeconds);
        
    }
}