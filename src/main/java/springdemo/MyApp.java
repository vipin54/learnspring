package springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println();
	}

}
