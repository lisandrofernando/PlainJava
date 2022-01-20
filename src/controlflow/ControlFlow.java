package controlflow;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double timeToWakeUp = 7.30;
	
	double delayTime = 7.55;
	
	String opinion="";
	
	if(timeToWakeUp < delayTime) {
		opinion =" Woke up on time";
	}else if(timeToWakeUp > delayTime) {
		
		opinion ="It is time to wake up .....";
	}
		
	  System.out.println(opinion);
	  
	  switchLoop();
	  
	}
	
	public static void switchLoop() {
		
		int month = 4;
		String monthString;
		
		switch(month) {
		
		case 1: monthString ="January";
		break;
		case 2: monthString ="February";
		break;
		case 3: monthString ="March";
		break;
		case 4: monthString ="April";
		break;
		default: monthString ="Unknown Month";
		break;
		
		}
		System.out.println(monthString);
	}
	
}
