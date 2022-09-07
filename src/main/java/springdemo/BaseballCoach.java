package springdemo;

public class BaseballCoach implements Coach{	
	
	//define a private field for the dependency 
	private FortuneService fortuneSevice;
	
	public BaseballCoach(FortuneService theFortuneService){
		fortuneSevice=theFortuneService;
	}
	
	//define constructor for dependency injection
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 min in practise";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune service to get the fortune
		return fortuneSevice.getFortune();
	}
}
