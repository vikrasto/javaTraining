package training.ideas.java.Clock;

/**
 * Created by idnvra on 11-08-2014.
 */
public class GetAngleDifference {
    public static double get(int hour, int minute) {
        int minuteNeedle_AngleCreatedByOneMinute = 6;
        int hourNeedle_AngleCreatedByOneHour = 30;
        double hourNeedle_AngleCreatedByOneMinute = 0.5;
        double angleBetweenMinuteAndHourNeedle = minute * minuteNeedle_AngleCreatedByOneMinute - (hour * hourNeedle_AngleCreatedByOneHour + minute * hourNeedle_AngleCreatedByOneMinute);
        if (angleBetweenMinuteAndHourNeedle<0){
            angleBetweenMinuteAndHourNeedle = -angleBetweenMinuteAndHourNeedle;
        }
        if (angleBetweenMinuteAndHourNeedle>180){
            angleBetweenMinuteAndHourNeedle = 360-angleBetweenMinuteAndHourNeedle;
        }
       return angleBetweenMinuteAndHourNeedle;
    }
}
