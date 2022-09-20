import java.util.*; //To use the Calendar class
public class Clock implements IClock {

    private int second;
    private int minute;
    private int hour;

    public Clock() {
        // The clock gets current time from Java’s Calendar class
        Calendar rightNow = Calendar.getInstance();
        second = rightNow.get(Calendar.SECOND);
        minute = rightNow.get(Calendar.MINUTE);
        hour   = rightNow .get(Calendar.HOUR_OF_DAY);
    }


    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    @Override
    public void tick() {
        if (second <= 58) {
            second++;
        }
        else {
            second = 0;
            if (minute <= 58) {
                minute++;
            } else {
                minute = 0;
                if (hour <= 22) {
                    hour++;
                } else {
                    hour = 0;
                }
            }
        }

    }

    @Override
    public void tickAhead(int numSecs) {
        for (int i = 0; i < numSecs; i++)
            tick();
    }

}
