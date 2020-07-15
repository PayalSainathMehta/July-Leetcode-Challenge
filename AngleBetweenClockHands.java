
public class AngleBetweenClockHands {
	 public double angleClock(int hour, int minutes) {
		 	int oneMinuteAngle = 360/60;
		 	int oneHourAngle = 360 / 12;
		 	
		 	double minutesAngle = oneMinuteAngle * minutes;
		 	double hourAngle =  (hour % 12 + minutes / 60.0) * oneHourAngle;
		 	
		 	double diff = Math.abs(hourAngle - minutesAngle);
		 	return Math.min(diff, 360 - diff);
	 }
	 
	 
	 public static void main(String[] args) {
		AngleBetweenClockHands obj = new AngleBetweenClockHands();
		System.out.println(obj.angleClock(12, 30));
	}
}
