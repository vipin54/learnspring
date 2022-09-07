package springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	public TrackCoach( ) {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Run a harf 5km";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it"+fortuneService.getFortune();
	}

}
