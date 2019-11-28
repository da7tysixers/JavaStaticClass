package project.practice.com;


/**
 * @author Orubele PC
 *
 */
public class JavaStaticClass {

	/**
	 * @param args
	 */
	
	 static int num1 = 22;
	public static void main(String[] args) {
		
		
		int y = num1;
		// TODO Auto-generated method stub

		simpleTest num1 = new simpleTest("Emmanuel", "Orubele");
		num1.setFinalAmount(49 + 22);
		
		System.out.println(num1.getFinalAmount());
		myStatfunction printResponse = new myStatfunction();
		
		printCount(); // calls the printCount method
		for(int i = 0; i < 10; i++) {
			myStatfunction count1 = new myStatfunction(); // creates an instance of the myStatfunction class
			
		}
		
		
	}
	
	private static void printCount() {
		System.out.println("There are now " + myStatfunction.getInstanceCount() 
		+ " instances of the myStatFunction class");
	}

}


