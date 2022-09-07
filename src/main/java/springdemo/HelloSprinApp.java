package springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSprinApp {

	public static void main(String[] args) {
		
	//load the spring container file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach theCoach1 = context.getBean("myCoach1",Coach.class);
		Coach theCoach2 = context.getBean("myCoach2",Coach.class);
		
		// litersl injection
		CricketCoach theCoach3 = context.getBean("myCoach2",CricketCoach.class);
		
		//call methods on Bean
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach1.getDailyWorkout());
//		System.out.println(theCoach.getDailyFortune());
//		System.out.println(theCoach1.getDailyFortune());
//		
//		System.out.println(theCoach2.getDailyWorkout());
//		System.out.println(theCoach2.getDailyFortune());
		System.out.println(theCoach3.getTeam());
		System.out.println(theCoach3.getEmailAddress());
		
		// close the context 
		context.close();
		
		
	}

}
