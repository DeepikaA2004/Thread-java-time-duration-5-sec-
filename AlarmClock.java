import java.util.Timer;
import java.util.TimerTask;

public class AlarmClock {
    public static void main(String[] args) {
        // Create a Timer object
        Timer timer = new Timer();

        // Set the number of seconds to wait before the alarm
        int secondsToWait = 5; // Adjust this value as needed

        // Schedule a task to run after the specified delay
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // This code will be executed when the alarm goes off
                System.out.println("Alarm! It's time to contact the customer and deliver the product.");
            }
        }, secondsToWait * 1000); // Convert seconds to milliseconds

        System.out.println("Alarm set. Waiting for " + secondsToWait + " seconds...");
    }
}
