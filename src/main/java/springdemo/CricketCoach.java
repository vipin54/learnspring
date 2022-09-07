package springdemo;

public class CricketCoach implements Coach {
	
	//define a private field for the dependency 
		private FortuneService fortuneSevice;
		private String emailAddress;
		private String team;
		
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}

		// create a no arg constructor
		public CricketCoach() {
			System.out.println("Inside cricket coach no arg constructor");
		}
		
		public void setFortuneService(FortuneService fortuneSevice) {
			this.fortuneSevice=fortuneSevice;
		}

	@Override
	public String getDailyWorkout() {
		
		return "Practise batting";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneSevice.getFortune();

}
}
